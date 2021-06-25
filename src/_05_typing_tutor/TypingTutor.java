package _05_typing_tutor;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	char currentLetter;
	JLabel label = new JLabel();
	
	public void run() {
frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	currentLetter = generateRandomLetter();
	
	label.setText(currentLetter+"");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	panel.add(label);
	frame.add(panel);
	frame.addKeyListener(this);
	frame.pack();
	
	
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
	char keyPressed =  (char) e.getKeyChar();
		if(keyPressed == currentLetter) {
			System.out.println("You got it correct");
		panel.setBackground(Color.green);
		
		}else {
			System.out.println("bad");
		panel.setBackground(Color.red);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
	System.out.println("you typed " + currentLetter);
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		
	}
	Date timeAtStart = new Date();
    
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
}
