package p6;

public class Array7x7 {
	private int[][] arrays;

	private static final int LENGTH = 7;

	public Array7x7() {
		this.arrays = new int[Array7x7.LENGTH][Array7x7.LENGTH];
	}

	public Array7x7(Array7x7 array) {
		this.setArray(array);
	}

	public Array7x7(int[][] array) {
		this.setArray(array);
	}

	public void setElement(int row, int col, int value) {
		if (row >= 0 && col >= 0 && row < Array7x7.LENGTH && col < Array7x7.LENGTH) {
			this.arrays[row][col] = value;
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	public int getElement(int row, int col) {
		if (row >= 0 && col >= 0 && row < Array7x7.LENGTH && col < Array7x7.LENGTH) {
			return this.arrays[row][col];
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	public void setRow(int row, Array7 theRow) {
		if (row >= 0 && row < Array7x7.LENGTH) {
			this.arrays[row] = theRow.toIntArray();
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	public Array7 getRow(int row) {
		if (row >= 0 && row < Array7x7.LENGTH) {
			return new Array7(this.arrays[row]);
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	public void setCol(int col, Array7 theCol) {
		int[] temp = theCol.toIntArray();

		for (int i = 0; i < temp.length; i++) {
			this.arrays[i][col] = temp[i];
		}
	}

	public Array7 getCol(int col) {
		int[] temp = new int[Array7.LENGTH];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = this.arrays[i][col];
		}

		return new Array7(temp);
	}

	public int[][] toIntArray() {
		int[][] temp = new int[this.arrays.length][this.arrays.length];

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = this.arrays[i][j];
			}
		}

		return temp;
	}

	public void setArray(Array7x7 array7x7) {
		this.arrays = new int[Array7x7.LENGTH][Array7x7.LENGTH];
		this.arrays = array7x7.toIntArray();
	}

	public Array7x7 getArray() {
		return new Array7x7(this);
	}

	public void setArray(int[][] array) {
		this.arrays = new int[array.length][this.arrays.length];

		for (int i = 0; i < this.arrays.length; i++) {
			for (int j = 0; j < this.arrays[i].length; j++) {
				this.arrays[i][j] = array[i][j];
			}
		}
	}
}
