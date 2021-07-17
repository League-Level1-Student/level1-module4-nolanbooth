package _08_calculator;


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();	
	JButton subtract = new JButton();	
	JButton multiply = new JButton();	
	JButton divide = new JButton();	
	JTextField input = new JTextField();
	JTextField input2 = new JTextField();
	
	
public void run() {
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
	
	add.setText("ADD");
	subtract.setText("SUBTRACT");
	multiply.setText("MULTIPLY");
	divide.setText("DIVIDE");
	
	panel.add(input);
	panel.add(input2);
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	
	frame.pack();

}
public void add() {
	System.out.println("ADDED");
}
public void subtract() {
	System.out.println("SUBTRACTED");
}
public void multiply() {
	System.out.println("MULTIPLIED");


}
public void divide() {
	System.out.println("DIVIDED");
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();	
if(buttonPressed == add) {
	add();
}if(buttonPressed == subtract) {
	subtract();
}if(buttonPressed == multiply) {
	multiply();
}if(buttonPressed == divide){
	divide();
}


}



}
