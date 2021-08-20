package _12_slot_machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class Slot implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel result = new JLabel();
	// three labels
	JLabel picture1 = new JLabel();
	JLabel picture2 = new JLabel();
	JLabel picture3 = new JLabel();
	Icon seven;
	Icon cherry;
	Icon bar;
	Random random = new Random();
	int number;
	int number2;
	int number3;

	public void run() {
		seven = createLabelImage("seven.jpeg");
		cherry = createLabelImage("cherry.jpeg");
		bar = createLabelImage("bar.jpeg");
		frame.add(panel);
		frame.setVisible(true);
		panel.add(result);
		button.setText("SPIN");
		panel.add(picture1);
		panel.add(picture2);
		panel.add(picture3);
		panel.add(button);
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		number = random.nextInt(3);
		number2 = random.nextInt(3);
		number3 = random.nextInt(3);
		System.out.println(number);
		System.out.println(number2);
		System.out.println(number3);
		if (number == 0) {
			picture1.setIcon(seven);
		}
		if (number == 1) {
			picture1.setIcon(cherry);
		}
		if (number == 2) {
			picture1.setIcon(bar);
		}

		if (number2 == 0) {
			picture2.setIcon(seven);
		}
		if (number2 == 1) {
			picture2.setIcon(cherry);
		}
		if (number2 == 2) {
			picture2.setIcon(bar);
		}

		if (number3 == 0) {
			picture3.setIcon(seven);
		}
		if (number3 == 1) {
			picture3.setIcon(cherry);
		}
		if (number3 == 2) {
			picture3.setIcon(bar);
		}

		if (number == 0 && number2 == 0 && number3 == 0) {
			result.setText("YOU WIN 7 MILLION!");
		}
		if (number == 1 && number2 == 1 && number3 == 1) {
			result.setText("YOU WIL A BILLION CHERRIES!");
		}
		if (number == 2 && number2 == 2 && number3 == 2) {
			result.setText("You win 10 BILLION");
		}

	}

	private Icon createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return null;
		}
		Icon icon = new ImageIcon(imageURL);
		return icon;
	}
}
