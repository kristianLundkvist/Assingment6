package p6;

public class Array7 {
	private int[] array;

	private static final int LENGTH = 7;

	public Array7() {
		this.array = new int[Array7.LENGTH];
	}

	public Array7(Array7 array7) {
		this.setArray(array7);
	}

	public Array7(int[] array) {
		this.setArray(array);
	}

	public void setElement(int pos, int value) {
		if (pos < Array7.LENGTH && pos >= 0) {
			array[pos] = value;
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	public int getElement(int pos) {
		if (pos < Array7.LENGTH && pos >= 0) {
			return array[pos];
		} else {
			throw new IndexOutOfBoundsException("Position must be greater than or equal to zero and less than 7");
		}
	}

	public int[] toIntArray() {
		int[] toReturn = new int[this.array.length];

		for (int i = 0; i < this.array.length; i++) {
			toReturn[i] = this.array[i];
		}

		return toReturn;
	}

	public Array7 getArray() {
		return new Array7(this);
	}

	public void setArray(int[] array) {
		int[] temp = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}

		this.array = temp;
	}

	public void setArray(Array7 array) {
		this.array = array.toIntArray();
	}
}
