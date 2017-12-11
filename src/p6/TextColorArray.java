package p6;

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
		
		char[] inputArray = new char[input.length()];
		int inputlength = input.length() * 7 + 49;
		int travelDistance = 4*7 + inputlength;
		int inputIndex = 0;
		for(int i = 0; i< input.length(); i++) {
			inputArray[i] = input.charAt(i);
		}
		Array7x7 character2 = new Array7x7();
		getNextCharacter(character2, inputIndex, inputArray);

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
				
				getNextCharacter(character2, inputIndex, inputArray);
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
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			};
			d.updateDisplay();
		}
	}

	private static void getNextCharacter(Array7x7 character2, int currentIndexInInputArray, char[] inputArray) {
		char temp = inputArray[currentIndexInInputArray];
		switch(temp) {
		case 'A': character2.setArray(convertIntArrayToBlack(Chars.charA()));
		break;
		case 'B': character2.setArray(convertIntArrayToBlack(Chars.charB()));
		break;
		case 'C': character2.setArray(convertIntArrayToBlack(Chars.charC()));
		break;
		case 'D': character2.setArray(convertIntArrayToBlack(Chars.charD()));
		break;
		case 'E': character2.setArray(convertIntArrayToBlack(Chars.charE()));
		break;
		case 'F': character2.setArray(convertIntArrayToBlack(Chars.charF()));
		break;
		case 'G': character2.setArray(convertIntArrayToBlack(Chars.charG()));
		break;
		case 'H': character2.setArray(convertIntArrayToBlack(Chars.charH()));
		break;
		case 'I': character2.setArray(convertIntArrayToBlack(Chars.charI()));
		break;
		case 'J': character2.setArray(convertIntArrayToBlack(Chars.charJ()));
		break;
		case 'K': character2.setArray(convertIntArrayToBlack(Chars.charK()));
		break;
		case 'L': character2.setArray(convertIntArrayToBlack(Chars.charL()));
		break;
		case 'M': character2.setArray(convertIntArrayToBlack(Chars.charM()));
		break;
		case 'N': character2.setArray(convertIntArrayToBlack(Chars.charN()));
		break;
		case 'O': character2.setArray(convertIntArrayToBlack(Chars.charO()));
		break;
		case 'P': character2.setArray(convertIntArrayToBlack(Chars.charP()));
		break;
		case 'Q': character2.setArray(convertIntArrayToBlack(Chars.charQ()));
		break;
		case 'R': character2.setArray(convertIntArrayToBlack(Chars.charR()));
		break;
		case 'S': character2.setArray(convertIntArrayToBlack(Chars.charS()));
		break;
		case 'T': character2.setArray(convertIntArrayToBlack(Chars.charT()));
		break;
		case 'U': character2.setArray(convertIntArrayToBlack(Chars.charU()));
		break;
		case 'V': character2.setArray(convertIntArrayToBlack(Chars.charV()));
		break;
		case 'W': character2.setArray(convertIntArrayToBlack(Chars.charW()));
		break;
		case 'X': character2.setArray(convertIntArrayToBlack(Chars.charX()));
		break;
		case 'Y': character2.setArray(convertIntArrayToBlack(Chars.charY()));
		break;
		case 'Z': character2.setArray(convertIntArrayToBlack(Chars.charZ()));
		break;
		default: character2.setArray(convertIntArrayToBlack(Chars.nbr0()));
		}
	}
	private static int[][] convertIntArrayToBlack(int[][] inArrayFromChars) {
		int[][] katt = inArrayFromChars;
		int[][] temp = new int [7][7];
		for(int i = 0; i < 7; i++) {
			for (int j = 0; j <7; j++) {
				if(katt[i][j] == 0) {
					temp[i][j] = 0;
				} else {
					temp[i][j] = Color.BLACK;
				}
			}
		}
		return temp;
	}
}
