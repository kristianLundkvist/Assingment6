package p6;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

/**
 * This is a rolling text window. It allows the user to input a text string and
 * displays the pixelated text. The window width is set in the WINDOW_BREAD
 * constant.
 *
 * @author Christoffer Book
 * @author Markus Wendler
 */
public class RollingTextWindow extends ColorDisplay {

	private static final long serialVersionUID = 1L;
	/**
	 * Constant setting the width of the window
	 */
	private static final int WINDOW_BREAD = 35;
	/**
	 * Constant defining the Width of the character
	 */
	private static final int CHARACTER_SPACE = 7;
	/**
	 * Constant for Empty Array7x7 from which the empty columns are read.
	 */
	private static final Array7x7 EMPTY_ARRAY = new Array7x7();
	/**
	 * The array in which the string is stored after being converted to chars
	 */
	private char[] inputArray;
	/**
	 * String holding the users input, temporarily.
	 */
	private String input;
	/**
	 * Counter used to determine when to read in a new character.
	 */
	private int counter;
	/**
	 * Keeps track of which character to set from inputArray.
	 */
	private int inputIndex;
	/**
	 * Timer, keeps track of time.
	 */
	private Timer timer;
	/**
	 * Array of Array7x7 holding references to the frames.
	 */
	private Array7x7[] frames = new Array7x7[(WINDOW_BREAD / CHARACTER_SPACE) + 1];

	/**
	 * Constructor, initialized values, gets input from user, converts string to
	 * chars and stored in array of chars, for easier management, starts the timer
	 * with set intervals and sets the first character .
	 *
	 */
	public RollingTextWindow() {
		super(1, WINDOW_BREAD / CHARACTER_SPACE, Color.WHITE, Color.GRAY, 1, 10);
		counter = 0;
		inputIndex = 0;
		input = "";
		timer = new Timer();
		initFrames();

		try {
			input = JOptionPane.showInputDialog("Mata in en sträng!").toUpperCase();
		} catch (NullPointerException e) {

		}
		setInputArray(input);

		timer.schedule(new UpdateFrequence(), 50, 50);
		setNewCharacter();
	}

	/**
	 * Initializes the array of frames with empty Array7x7s
	 */

	private void initFrames() {
		for (int i = 0; i < frames.length; i++) {
			frames[i] = new Array7x7();
		}
	}

	/**
	 * Converts the input string to an array of chars for easier management.
	 *
	 * @param input
	 */
	private void setInputArray(String input) {
		inputArray = new char[input.length()];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = input.charAt(i);
		}
	}

	/**
	 * Sets the frame that´s not visible in window to the next character in
	 * inputArray based on the inputIndex.
	 */
	private void setNewCharacter() {
		if (inputIndex < inputArray.length) {
			frames[frames.length - 1].setArray(Chars.getChar(inputArray[inputIndex], Color.RED));
			inputIndex++;
		}
	}

	public int getInputArrayLength() {
		return inputArray.length;
	}

	/**
	 * Timer
	 */
	private class UpdateFrequence extends TimerTask {
		@Override

		/**
		 * Shit that´s going down on timer intervals. Move characters in window, read
		 * new character if necessary. Set the display to new values, and update the
		 * display to show new values
		 */
		public void run() {
			for (int i = 0; i < frames.length; i++) {
				if (i != frames.length - 1) {
					frames[i].shiftLeft(frames[i + 1].getCol(0));
				} else {
					frames[i].shiftLeft(EMPTY_ARRAY.getCol(0));
				}
			}
			if (counter == CHARACTER_SPACE + 1) {
				counter = 0;
				setNewCharacter();
			}
			for (int i = 0; i < frames.length; i++) {
				setDisplay(frames[i].toIntArray(), 0, i);
			}
			updateDisplay();
			counter++;
		}
	}

}
