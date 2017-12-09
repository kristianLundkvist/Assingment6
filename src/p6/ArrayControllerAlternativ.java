package p6;

public class ArrayControllerAlternativ {

	private Test1UIAlternativ ui;
	private Array7x7 array;
	private Array7 row;
	private Array7 column;

	public ArrayControllerAlternativ(Array7x7 array, Array7 leftColumn, Array7 bottomColumn) {
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

	void setUI(Test1UIAlternativ ui) {
		this.ui = ui;
	}
	
	void updateView() {
		ui.updateView(array.toIntArray(), row.toIntArray(), column.toIntArray());
	}
	
	// -----------------------------------------------------------------------------------------
	// 				Allt under detta streck är nytt / Tim
	// -----------------------------------------------------------------------------------------
	
	public void readRow(int rowNbr) {
		for(int i = 0; i < 7; i++) {
			row.setElement(i, ui.getlblArrayElement(rowNbr, i));
		}
		updateView();
	}
	
	public void readColumn(int columnNbr) {
		for(int i = 0; i < 7; i++) {
			column.setElement(i, ui.getlblArrayElement(i, columnNbr));
		}
		updateView();
	}

	public void writeRow(int rowNbr, Array7 rowArray) {
		row = rowArray;
		array.setRow(rowNbr, rowArray);
		updateView();
	}
	
	public void writeColumn(int columnNbr, Array7 columnArray) {
		column = columnArray;
		array.setCol(columnNbr, columnArray);
		updateView();
	}

}
