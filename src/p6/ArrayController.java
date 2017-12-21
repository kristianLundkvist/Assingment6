package p6;

/**
 * Works as a controller class for Test1UIAleternativ. The class holds an
 * instance of the {@code Test1UIAlternativ} that it controlls and also two
 * instances of {@code Array7} and one instance of {@code Array7x7} where data
 * is stored. The class has public methods that reflect the functionality of the
 * 4 buttons on {@code Test1UIAlternativ}.
 * 
 * @author Tim Normark
 */
public class ArrayController {

	/**
	 * The {@code Test1UIAlternativ} that this class controls.
	 */
	private Test1UI ui;
	/**
	 * used for storing a 2 dimensional array in.
	 */
	private Array7x7 array;
	/**
	 * Used for storing a 1 dimensional array in.
	 */
	private Array7 row;
	/**
	 * used for storing a 1 dimensional array in.
	 */
	private Array7 column;

	/**
	 * Constructor that sets the values of this instance's variables, except for
	 * the {@code Test1UIAlternativ}
	 * 
	 * @param array
	 *            The {@code Array7x7} representing the labelArray in the
	 *            {@code Test1UIAlternativ}.
	 * @param leftColumn
	 *            The {@code Array7} representing the {@code columnTextField} in
	 *            the {@code Test1UIAlternativ}.
	 * @param bottomColumn
	 *            The {@code Array7} representing the {@code rowTextField} in
	 *            the {@code Test1UIAlternativ}
	 */
	public ArrayController(Array7x7 array, Array7 leftColumn, Array7 bottomColumn) {
		this.array = array;
		this.row = leftColumn;
		this.column = bottomColumn;
	}

	/**
	 * Sets the UI which the controller ill control.
	 * 
	 * @param ui
	 *            The ui that the controller will control.
	 */
	public void setUI(Test1UI ui) {
		this.ui = ui;
	}

	/**
	 * updates all the labels and the textfields in the UI so they present the
	 * data that is stored in the controllers {@code Array7x7} and it's two
	 * {@code Array7}'s.
	 */
	public void updateView() {
		ui.updateView(array.toIntArray(), row.toIntArray(), column.toIntArray());
	}

	/**
	 * Reads the selected row from the labelArray on the UI and then updates the
	 * view on the UI to show that row in the rowTextField in the UI.
	 */
	public void readRow() {
		try {
			int rowNbr = ui.getRowTextFieldControl() - 1;
			if (rowNbr >= 0 && rowNbr < 7) {
				for (int i = 0; i < 7; i++) {
					row.setElement(i, ui.getlblArrayElement(rowNbr, i));
				}
				updateView();
			}
		} catch (NumberFormatException e) {
		}

	}

	/**
	 * Reads the selected column from the labelArray on the UI and then updates
	 * the view on the UI to show that column in the columnTextField in the UI.
	 */
	public void readColumn() {
		try {
			int columnNbr = ui.getColumnTextFieldControl() - 1;
			if (columnNbr >= 0 && columnNbr < 7) {
				for (int i = 0; i < 7; i++) {
					column.setElement(i, ui.getlblArrayElement(i, columnNbr));
				}
				updateView();
			}
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * Sets the chosen row in the UI's labelArray to the numbers entered into
	 * the rowTextField in the UI.
	 */
	public void writeRow() {
		try {
			int rowNbr = ui.getRowTextFieldControl() - 1;

			if (rowNbr >= 0 && rowNbr < 7) {
				row = ui.getRowTextFieldArray();
				array.setRow(rowNbr, row);
				updateView();
			}
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * Sets the chosen column in the UI's labelArray to the numbers entered into
	 * the columnTextField in the UI.
	 */
	public void writeColumn() {
		try {
			int columnNbr = ui.getColumnTextFieldControl() - 1;
			if (columnNbr >= 0 && columnNbr < 7) {
				column = ui.getColumnTextFieldArray();
				array.setCol(columnNbr, column);
				updateView();
			}
		} catch (NumberFormatException e) {
		}
	}

}
