package _01_nasty_surprise;


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Nastystuffs implements ActionListener {
JButton goodbutton = new JButton();
JButton badbutton = new JButton();	


	public void setup() {
	
	goodbutton.setSize(10, 10);
	goodbutton.addActionListener(this);
	badbutton.setSize(10, 10);
	badbutton.addActionListener(this);
	goodbutton.setText("Treat");
	badbutton.setText("Trick");
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	panel.add(goodbutton);
	panel.add(badbutton);
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();





}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
		if(arg0.getSource()==badbutton) {
			
			
		}else {
			
		}
	}
	
	
}
