package _04_chuckle_clicker;


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class ChuckleClicker implements ActionListener {
	JPanel panel = new JPanel();		
	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.add(panel);
		button1.setText("Joke");
		button2.setText("Punchline");
		panel.add(button1);
		panel.add(button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == button1) {
			JOptionPane.showMessageDialog(null,  "joke");
		}else {
			JOptionPane.showMessageDialog(null,  "punchline");
		}
		
		
	}





}
