package p6;

/**
 * Controller for the second gui
 *
 * @author Christoffer Book
 * @author Markus Wendler
 */

public class Controller {
	/**
	 * Important member variables
	 */
	private Test2UI ui;
	private Array7 leftColumn;
	private Array7 rightColumn;
	private Array7x7 board;

	/**
	 * Constructor with appropriate parameters
	 *
	 * @param board
	 *            - The Array7x7 representing the board
	 * @param leftColumn
	 *            - The Array7 on the leftmost side of the gui
	 * @param rightColumn
	 *            - The Array7 on the rightmost side of the board
	 */
	public Controller(Array7x7 board, Array7 leftColumn, Array7 rightColumn) {
		this.board = board;
		this.leftColumn = leftColumn;
		this.rightColumn = rightColumn;
	}

	/**
	 * thus far unused setmethod
	 *
	 * @param board
	 */
	void setBoard(Array7x7 board) {
		this.board = board;
	}

	/**
	 * thus far unused getmethod.
	 *
	 * @return the board
	 */
	Array7x7 getBoard() {
		return board;
	}

	/**
	 * interconnection method for use in the gui.
	 *
	 * @param ui
	 *            - the ui to set
	 */
	public void setUI(Test2UI ui) {
		this.ui = ui;
	}

	/**
	 * Method to update the values in ui with the values stored in member variables
	 * in controller
	 */
	void updateView() {
		ui.updateView(board.toIntArray(), leftColumn.toIntArray(), rightColumn.toIntArray());
	}

	/**
	 * Method to shift the values in board to the left. in order to keep ui from
	 * doing anything just get values from text fields in the rightColumn textfields
	 * one by one (in case they have been manually changed) store in a temp int[]
	 * array, then shift everything left using method in array7x7 update the value
	 * in the leftColumn with the fallout column from board. lastly update ui view.
	 */
	public void shiftLeft() {
		int[] temp = new int[Array7.LENGTH];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(ui.getRightColumnNbr(i));
		}
		this.rightColumn.setArray(temp);
		this.leftColumn = board.shiftLeft(rightColumn);
		updateView();
	}

	/**
	 * Same as previous method, cba typing it again.
	 */
	public void shiftRight() {
		int[] temp = new int[Array7.LENGTH];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(ui.getLeftColumnNbr(i));
		}
		this.leftColumn.setArray(temp);
		this.rightColumn = board.shiftRight(leftColumn);
		updateView();
	}

}