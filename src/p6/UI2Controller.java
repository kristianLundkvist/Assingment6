package p6;

public class UI2Controller {

	private Test2UI ui;
	private Array7x7 array;
	private Array7 leftColumn;
	private Array7 rightColumn;

	public UI2Controller(Array7x7 array, Array7 leftColumn, Array7 rightColumn) {
		this.array = array;
		this.leftColumn = leftColumn;
		this.rightColumn = rightColumn;
	}

	public void setUI(Test2UI ui) {
		this.ui = ui;
	}

	// public void moveLeft() {
	// rightColumn = ui.getRightTfColumn();
	// leftColumn = array.moveLeft(rightColumn);
	// updateView();
	// }
	//
	// public void moveRight() {
	// leftColumn = ui.getLeftTfColumn();
	// rightColumn = array.moveRight(leftColumn);
	// updateView();
	// }

	public void updateView() {
		ui.updateView(array.toIntArray(), leftColumn.toIntArray(), rightColumn.toIntArray());
	}
}
