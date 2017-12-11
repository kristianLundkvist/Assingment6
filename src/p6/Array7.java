package p6;

/**
 * Class representing an array of fixed length.
 * 
 * @author Kristian Lundkvist
 * @author Tim Normark
 *
 */
public class Array7 {

	/**
	 * The local array.
	 */
	private int[] array;

	/**
	 * The fixed length of the array.
	 */
	public static final int LENGTH = 7;

	/**
	 * Constructor. Instantiates a new and empty array.
	 */
	public Array7() {
		this.array = new int[Array7.LENGTH];
	}

	/**
	 * Constructor. Sets the data in the array based on the data in the
	 * parameter.
	 * 
	 * @param array7
	 *            Data used to determine the state of the new Array7.
	 */
	public Array7(Array7 array7) {
		this.setArray(array7);
	}

	/**
	 * Constructor. Sets data based on the integer array.
	 * 
	 * @param array
	 *            Data used to determine the state of the new Array7.
	 */
	public Array7(int[] array) {
		this.setArray(array);
	}

	/**
	 * Sets the value of an element in the array.
	 * 
	 * @param pos
	 *            Position of the array. Throws a IndexOutOfBoundsException if
	 *            the position is greater than 7 or less than zero.
	 * @param value
	 *            The new value.
	 */
	public void setElement(int pos, int value) {
		if (pos < Array7.LENGTH && pos >= 0) {
			array[pos] = value;
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	/**
	 * Returns the value of the element at a given position.
	 * 
	 * @param pos
	 *            The position of the element. Throws a
	 *            IndexOutOfBoundsException if the position is greater than 7 or
	 *            less than 0.
	 * @return The value of the element.
	 */
	public int getElement(int pos) {
		if (pos < Array7.LENGTH && pos >= 0) {
			return array[pos];
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	/**
	 * Returns the Array7 as a integer array.
	 * 
	 * @return The representation of Array7.
	 */
	public int[] toIntArray() {
		int[] toReturn = new int[this.array.length];

		for (int i = 0; i < this.array.length; i++) {
			toReturn[i] = this.array[i];
		}

		return toReturn;
	}

	/**
	 * Returns a new instance of Array7.
	 * 
	 * @return Instance of Array7.
	 */
	public Array7 getArray() {
		return new Array7(this);
	}

	/**
	 * Sets the data to the new data from the parameters.
	 * 
	 * @param array
	 *            Data as a array of integers.
	 */
	public void setArray(int[] array) {
		int[] temp = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}

		this.array = temp;
	}

	/**
	 * Sets the data to the new data from the parameters.
	 * 
	 * @param array
	 *            Data as a Array7.
	 */
	public void setArray(Array7 array) {
		this.array = array.toIntArray();
	}
}
