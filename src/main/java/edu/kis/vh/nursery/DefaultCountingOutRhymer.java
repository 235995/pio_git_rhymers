package edu.kis.vh.nursery;

/**
 *
 */

public class DefaultCountingOutRhymer {
	/**
	 * @param in
	 */

	public static final int CAPACITY = 12;
	public static final int TOTAL = -1;
	public static final int FULL = 11;
	private final int[] NUMBERS = new int[CAPACITY];

	private int total = -1;

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
		return total == TOTAL;
	}
	/**
	 * @return
	 */
	public boolean isFull() {

		return total == FULL;
	}

	/**
	 * @return
	 */
	public int peekaboo() {
		if (callCheck())
			return TOTAL;
		return NUMBERS[total];
	}

	/**
	 * @return
	 */
	public int countOut() {
		if (callCheck())
			return TOTAL;
		return NUMBERS[total--];
	}


}
