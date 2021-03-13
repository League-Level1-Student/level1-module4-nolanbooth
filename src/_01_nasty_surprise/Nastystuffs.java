package _01_nasty_surprise;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Nastystuffs {
public static void main (String[]args) {
	JButton goodbutton = new JButton();
	JButton badbutton = new JButton();
	goodbutton.setSize(100, 100);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	panel.add(goodbutton);
	panel.add(badbutton);
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
	
	
}
