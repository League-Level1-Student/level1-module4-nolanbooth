package _10_pig_latin_DONE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Pig_Latin implements ActionListener {

	PigLatinTranslator translator = new PigLatinTranslator();
	String wordNew;
	String word;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField field = new JTextField(20);
	JTextField field2 = new JTextField(20);

	public void run() {
		frame.setVisible(true);
		panel.add(field);
		panel.add(button);
		panel.add(field2);
		frame.add(panel);
		button.setText("TRANSLATE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		frame.setTitle("T r a n s l a t e r");
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("TRANSLATING...");
		word = field.getText();
	System.out.println(word);
	
	 wordNew = new PigLatinTranslator().translate(word);
	field2.setText(wordNew);
	}

}


