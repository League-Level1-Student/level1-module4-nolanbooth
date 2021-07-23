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
	JTextField input = new JTextField(20);
	JTextField input2 = new JTextField(20);
	String num1;
	String num2;
	
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
	num1 = input.getText();
	num2 = input2.getText();
	double addAnswer = Double.parseDouble(num1);
	double addAnswer2 = Double.parseDouble(num2);
	double addAnswerFinal = addAnswer+addAnswer2;
	JOptionPane.showMessageDialog(null, "Answer is "+addAnswerFinal);
}
public void subtract() {
	System.out.println("SUBTRACTED");
	num1 = input.getText();
	num2 = input2.getText();
	double subAnswer = Double.parseDouble(num1);
	double subAnswer2 = Double.parseDouble(num2);
	double subAnswerFinal = subAnswer-subAnswer2;
	JOptionPane.showMessageDialog(null, "Answer is "+subAnswerFinal);
}
public void multiply() {
	System.out.println("MULTIPLIED");
	num1 = input.getText();
	num2 = input2.getText();
	double multiplyAnswer = Double.parseDouble(num1);
	double multiplyAnswer2 = Double.parseDouble(num2);
	double multiplyAnswerFinal = multiplyAnswer*multiplyAnswer2;
	JOptionPane.showMessageDialog(null, "Answer is "+multiplyAnswerFinal);
	

}
public void divide() {
	System.out.println("DIVIDED");
	num1 = input.getText();
	num2 = input2.getText();
	double divAnswer = Double.parseDouble(num1);
	double divAnswer2 = Double.parseDouble(num2);
	double divAnswerFinal = divAnswer/divAnswer2;
	JOptionPane.showMessageDialog(null, "Answer is "+divAnswerFinal);



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
