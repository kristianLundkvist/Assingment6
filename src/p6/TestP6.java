package p6;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestP6 {
	public static void main(String[] args) {
		String input;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(3);

		int choice = -1;
		do {

			input = JOptionPane.showInputDialog(
					"MENY! \n\n\t1. TestUI1\n\t2. TestUI2\n\t3. RollingTextWindow\n\n\t0. Avsluta\n\n");
			if (input == null) {
				System.exit(-1);
			}
			try {
				choice = Integer.parseInt(input);
			} catch (NumberFormatException e) {

			}
			switch (choice) {
			case 1:
				Thread thread = new Thread();
			}
			frame.pack();
			frame.setVisible(true);
			break;
		} while (choice != 0);

	}
}
