package p6;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Mer eller mindre proof of concept. Kommer behöva skriva om helt och hållet! 
 * @author Alis4
 *
 */
public class TextColorArray {
	private Array7x7 array;

	public TextColorArray() {

	}
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Input a string").toUpperCase();
		Random rand = new Random();
		char[] inputArray = new char[input.length()];
		int inputlength = input.length() * 7 + 49 +input.length();
		int travelDistance = 4*7 + inputlength;
		int inputIndex = 0;
		for(int i = 0; i< input.length(); i++) {
			inputArray[i] = input.charAt(i);
		}
		Array7x7 character2 = new Array7x7();
		

		JFrame frame = new JFrame("Testshit");
		frame.setDefaultCloseOperation(3);
		ColorDisplay d = new ColorDisplay(1, 5, Color.WHITE, Color.GRAY, 1, 10);


		frame.add(d);
		frame.pack();
		frame.setVisible(true);
		d.updateDisplay();
		Array7x7 character = new Array7x7();
		Array7x7 secondFrame = new Array7x7();
		Array7x7 thirdFrame = new Array7x7();
		Array7x7 fourthFrame = new Array7x7(); 
		Array7x7 fifthFrame = new Array7x7();
		Array7x7 empty = new Array7x7();
		int counter = 0;
		for(int i = 0; i < travelDistance; i++) {

			fifthFrame.shiftLeft(fourthFrame.getCol(0));
			fourthFrame.shiftLeft(thirdFrame.getCol(0));
			thirdFrame.shiftLeft(secondFrame.getCol(0));
			secondFrame.shiftLeft(character.getCol(0));
			if(i%8 == 0 && inputIndex < inputArray.length) {
				
				character2.setArray(Chars.getChar((char)inputArray[inputIndex], Color.argb(0xFF, 0xFF+rand.nextInt(256), 0xFF+rand.nextInt(256), 0xFF+rand.nextInt(256))));
				inputIndex++;
				character.shiftLeft(empty.getCol(0));
			} else { 
				character.shiftLeft(character2.getCol(0));
				character2.shiftLeft(empty.getCol(0));
			}
			
			


			d.setDisplay(character.toIntArray(), 0, 4);
			d.setDisplay(secondFrame.toIntArray(), 0, 3 );
			d.setDisplay(thirdFrame.toIntArray(),0,2);
			d.setDisplay(fourthFrame.toIntArray(),0,1);
			d.setDisplay(fifthFrame.toIntArray(),0,0);



			try {
				Thread.sleep(5);
			} catch (Exception e) {
				// TODO: handle exception
			};
			d.updateDisplay();
		}
	}

	
}
