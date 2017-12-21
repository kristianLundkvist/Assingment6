package p6;

/**
 * Class that can hold a two dimensional array of {@code int} values. The length
 * of the arrays rows and columns are fixed to the constant value
 * {@code Array7x7.LENGTH}
 *
 * @author Tim Normark
 * @author Kristian Lundkvist
 */
public class Array7x7 {
	/**
	 * The two dimensional {@code int} array.
	 */
	private int[][] arrays;

	/**
	 * The constant value determining the length of the rows and columns in the
	 * array.
	 */
	public static final int LENGTH = 7;

	/**
	 * Constructs an Array7x7 with an initialized array, with no values.
	 */
	public Array7x7() {
		this.arrays = new int[Array7x7.LENGTH][Array7x7.LENGTH];
	}

	/**
	 * Constructs an Array7x7 using a copy of the array from the given object.
	 *
	 * @param array
	 *            The object who's array will be copied to this array.
	 */
	public Array7x7(Array7x7 array) {
		this.setArray(array);
	}

	/**
	 * Constructs an Array7x7 and copies the given array to this objects array.
	 *
	 * @param array
	 *            The array that will be copied and used in this object.
	 */
	public Array7x7(int[][] array) {
		this.setArray(array);
	}

	/**
	 * Sets the element in the array in the given row and column to the given value.
	 * The values of {@code row} and {@code col} must be >= 0 and <
	 * {@code Array7x7.LENGTH} or an {@link IndexOutOfBoundsException} will be
	 * thrown.
	 *
	 * @param row
	 *            The index of the row position in the array
	 * @param col
	 *            The index of the column position in the array
	 * @param value
	 *            The value to set the arrays chosen position to.
	 */
	public void setElement(int row, int col, int value) {
		if (row >= 0 && col >= 0 && row < Array7x7.LENGTH && col < Array7x7.LENGTH) {
			this.arrays[row][col] = value;
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	/**
	 * Gets the element from the array from the given row and column. The values of
	 * {@code row} and {@code col} must be >= 0 and < {@code Array7x7.LENGTH} or an
	 * {@link IndexOutOfBoundsException} will be thrown.
	 *
	 * @param row
	 *            The index of the row position in the array
	 * @param col
	 *            The index of the column position in the array
	 * @return The value from the arrays chosen position.
	 */
	public int getElement(int row, int col) {
		if (row >= 0 && col >= 0 && row < Array7x7.LENGTH && col < Array7x7.LENGTH) {
			return this.arrays[row][col];
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	/**
	 * Sets all the values in the arrays row with the given index, using the values
	 * from the array in the given {@code Array7}.
	 *
	 * @param row
	 *            The index of the row in the array to set.
	 * @param theRow
	 *            The {@code Array7} who's arrays values will be used to set the
	 *            row.
	 */
	public void setRow(int row, Array7 theRow) {
		if (row >= 0 && row < Array7x7.LENGTH) {
			this.arrays[row] = theRow.toIntArray();
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	/**
	 * Gets the values from the row of the array with the given index.
	 *
	 * @param row
	 *            The index of the row from the array to get.
	 * @return An {@code Array7} object containing the requested array.
	 */
	public Array7 getRow(int row) {
		if (row >= 0 && row < Array7x7.LENGTH) {
			return new Array7(this.arrays[row]);
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	/**
	 * Sets all the values in the arrays column with the given index, using the
	 * values from the array in the given {@code Array7}.
	 *
	 * @param col
	 *            The index of the column in the array to set.
	 * @param theCol
	 *            The {@code Array7} who's arrays values will be used to set the
	 *            column.
	 */
	public void setCol(int col, Array7 theCol) {
		int[] temp = theCol.toIntArray();

		for (int i = 0; i < temp.length; i++) {
			this.arrays[i][col] = temp[i];
		}
	}

	/**
	 * Gets the values from the column of the array with the given index.
	 *
	 * @param col
	 *            The index of the column from the array to get.
	 * @return An {@code Array7} object containing the requested array.
	 */
	public Array7 getCol(int col) {
		int[] temp = new int[Array7.LENGTH];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = this.arrays[i][col];
		}

		return new Array7(temp);
	}

	/**
	 * Creates a copy of the two dimensional array and returns the copy.
	 *
	 * @return a copy of the array of this instance
	 */
	public int[][] toIntArray() {
		int[][] temp = new int[this.arrays.length][this.arrays.length];

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = this.arrays[i][j];
			}
		}

		return temp;
	}

	/**
	 * Copies the values from the given {@code Array7x7}'s array to this objects
	 * array.
	 *
	 * @param array7x7
	 *            The object who's array will be used to set this object's array.
	 */
	public void setArray(Array7x7 array7x7) {
		this.arrays = new int[Array7x7.LENGTH][Array7x7.LENGTH];
		this.arrays = array7x7.toIntArray();
	}

	/**
	 * Copies this object with it's array and returns the new copy.
	 *
	 * @return a copy of this object.
	 */
	public Array7x7 getArray() {
		return new Array7x7(this);
	}

	/**
	 * Copies the values from the given array to this objects array.
	 *
	 * @param array
	 *            The array that will be used to set the array of this object.
	 */
	public void setArray(int[][] array) {
		this.arrays = new int[LENGTH][LENGTH];

		for (int i = 0; i < this.arrays.length; i++) {
			for (int j = 0; j < this.arrays[i].length; j++) {
				this.arrays[i][j] = array[i][j];
			}
		}
	}

	/**
	 * Basically shifts array right with the inparam leftcolumn ending up in array
	 * column 0 and returning the array7 column rolling over on the right side.
	 *
	 * @param leftColumn
	 *            - the column to write into first column of array
	 * @return the array7 that rolls over to the right.
	 */
	Array7 shiftRight(Array7 leftColumn) {
		Array7 temp = new Array7(this.getCol(Array7.LENGTH - 1));

		for (int i = Array7.LENGTH - 2; i >= 0; i--) {
			this.setCol(i + 1, this.getCol(i));
		}
		this.setCol(0, leftColumn);
		return temp;
	}

	/**
	 * Basically shifts array left with the inparam rightcolumn ending up in array
	 * column length-1 and returning the array7 column rolling over on the left
	 * side.
	 *
	 * @param rightColumn
	 *            - the column to write into last column of array
	 * @return the array7 that rolls over to the left.
	 */
	Array7 shiftLeft(Array7 rightColumn) {
		Array7 temp = new Array7(this.getCol(0));

		for (int i = 1; i < Array7.LENGTH; i++) {
			this.setCol(i - 1, this.getCol(i));
		}
		this.setCol(Array7.LENGTH - 1, rightColumn);

		return temp;
	}
}
