package p6;

import java.util.Scanner;

import javax.swing.JFrame;

public class TestP6 {
	public static void main(String[] args) {
		String input;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Scanner reader = new Scanner(System.in);

		int choice = -1;
		do {
			System.out.println("MENY! \n1. TestUI1\n2. TestUI2\n3. RollingTextWindow\n0. Avsluta");
			input = reader.nextLine();
			if (input == null) {
				System.exit(-1);
			}
			try {
				choice = Integer.parseInt(input);
			} catch (NumberFormatException e) {

			}
			switch (choice) {
			case 1:
				frame.getContentPane().removeAll();
				frame.add(new Test1UI(new ArrayController(new Array7x7(), new Array7(), new Array7())));
				break;

			case 2:
				frame.getContentPane().removeAll();
				frame.add(new Test2UI(new Controller(new Array7x7(), new Array7(), new Array7())));
				break;

			case 3:
				frame.getContentPane().removeAll();
				frame.add(new RollingTextWindow());
				break;
			}
			frame.pack();
			frame.setVisible(true);

		} while (choice != 0);

		reader.close();
		System.exit(0);

	}
}
