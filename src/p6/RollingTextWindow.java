package p6;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RollingTextWindow extends ColorDisplay {
	private final static int WINDOW_BREAD = 35;
	private final static int CHARACTER_SPACE = 7;
	private final static Array7x7 EMPTY_ARRAY = new Array7x7();
	
	private char[] inputArray;
	private String input; 
	private int counter;
	private int inputIndex; 
	private Timer timer;
	
	private Array7x7 firstFrame, secondFrame, thirdFrame, fourthFrame, fifthFrame, outsideFrame;
	 
	public RollingTextWindow() {
		super(1,5,Color.WHITE,Color.GRAY,1,10);
		timer = new Timer();
		
		counter = 0;
		input = JOptionPane.showInputDialog("Mata in en sträng!").toUpperCase();
		setInputArray(input);
		inputIndex = 0;
		setFrames();
		timer.schedule(new UpdateFrequence(), 50,50);
		setNewCharacter();
		
	}
	
	private void setInputArray(String input) {
		inputArray = new char[input.length()];
		for(int i = 0; i < inputArray.length; i++) {
			inputArray[i] = input.charAt(i);
		}
	}
	
	private void setFrames() {
		firstFrame = new Array7x7();
		secondFrame = new Array7x7();
		thirdFrame = new Array7x7();
		fourthFrame = new Array7x7();
		fifthFrame = new Array7x7();
		outsideFrame =new Array7x7(); 

	}
	
	private void setNewCharacter() {
			if(inputIndex < inputArray.length) {
				outsideFrame.setArray(Chars.getChar(inputArray[inputIndex], Color.BLACK));
				inputIndex++;

			}
		
	}
	
	private class UpdateFrequence extends TimerTask{
		public void run() {
			firstFrame.shiftLeft(secondFrame.getCol(0));
			secondFrame.shiftLeft(thirdFrame.getCol(0));
			thirdFrame.shiftLeft(fourthFrame.getCol(0));
			fourthFrame.shiftLeft(fifthFrame.getCol(0));
			fifthFrame.shiftLeft(outsideFrame.getCol(0));
			outsideFrame.shiftLeft(EMPTY_ARRAY.getCol(0));
			if(counter == CHARACTER_SPACE + 1) {
				counter = 0;
				setNewCharacter();
			}
			
			setDisplay(firstFrame.toIntArray(), 0, 0);
			setDisplay(secondFrame.toIntArray(), 0, 1);
			setDisplay(thirdFrame.toIntArray(), 0, 2);
			setDisplay(fourthFrame.toIntArray(), 0, 3);
			setDisplay(fifthFrame.toIntArray(), 0, 4);
			updateDisplay();
			counter++;
		}
	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("test");
		frame.setDefaultCloseOperation(3);
		frame.add(new RollingTextWindow());
		frame.pack();
		frame.setVisible(true);
		
		
	}
	 
	
}
