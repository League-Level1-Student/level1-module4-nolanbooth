package _11_whack_a_mole_DONE;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/* TODO this is a cool function
*/
public class Mole implements ActionListener {
	Date start;
	int score = 0;
	int games = 0;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random random = new Random();
	int i;
	JButton mole;
	public void run() {
		int randomNumber = random.nextInt(24);
		frame.setVisible(true);
		frame.setSize(300, 400);
		frame.setTitle("WHACK A MOLE!!");
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawButtons(randomNumber);
			
			
		
		
	}
	public void drawButtons(int rando) {
		boolean buttonFound = false;
		for ( i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
				if(buttonFound == false) {
					if(rando == i) {
						button.setText("mole");
						buttonFound = true;
						mole = button;
						
					}
				}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(start == null) {
		start = new Date();
	}
		
		int rand2 = random.nextInt(24);
		if(e.getSource() == mole) {
		speak("You got the mole!");
		score++;
		games++;
		}else {
		speak("you failed");
	games++;
		}
		if(games <= 9) {
		panel.removeAll();
		drawButtons(rand2);
		}else {
			endGame(start, score);
			frame.dispose();
		}
		
	}
	  static void speak(String words) {
	        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	            try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        } else {
	            try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        }
	    }
	  private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}

}
