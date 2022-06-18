package edu.kis.vh.nursery;

/**
 *
 */

public class DefaultCountingOutRhymer {
	/**
	 * @param in
	 */

	public static final int CAPACITY = 12;
	public static final int EMPTY = -1;
	private final int[] NUMBERS = new int[CAPACITY];

	private int total = EMPTY;

	/**
	 * @return
	 */

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/**
	 * @return
	 */
	public boolean callCheck() {
		return total == EMPTY;
	}
	/**
	 * @return
	 */
	public boolean isFull() {

		return total == CAPACITY-1;
	}

	/**
	 * @return
	 */
	public int peekaboo() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total];
	}

	/**
	 * @return
	 */
	public int countOut() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total--];
	}


}
