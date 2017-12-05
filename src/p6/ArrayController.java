package p6;

package p6;

public class ArrayController {

	private Test1UI ui;
	private Array7x7 array;
	private Array7 row;
	private Array7 column;

	public ArrayController(Array7x7 array, Array7 leftColumn, Array7 bottomColumn) {
		this.array = array;
		this.row = leftColumn;
		this.column = bottomColumn;
	}

	void setArray(Array7x7 inArray) {
		array.setArray(inArray);
	}

	Array7x7 getArray() {
		return array;
	}

	void setRow(int[] inRow) {
		row.setArray(inRow);

	}

	Array7 getRow() {
		return row;
	}

	Array7 getRow(int row) {
		this.row = array.getRow(row);
		return this.row;
	}

	void setColumn(int[] inColumn) {
		this.column.setArray(inColumn);
	}

	void updateColumnInArray(int column) {
		array.setCol(column, this.column);
	}

	Array7 getColumn(int column) {
		this.column = array.getCol(column);
		return this.column;

	}

	Array7 getColumn() {
		return column;

	}

	void setUI(Test1UI ui) {
		this.ui = ui;
	}

	void updateView() {
		ui.updateView(array.toIntArray(), row.toIntArray(), column.toIntArray());
	}

}
