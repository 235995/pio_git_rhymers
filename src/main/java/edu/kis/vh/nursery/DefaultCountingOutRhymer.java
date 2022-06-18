package edu.kis.vh.nursery;

/**
 *
 */

public class DefaultCountingOutRhymer {
	/**
	 * @param in
	 */

	public static final int CAPACITY = 12;
	public static final int INIT_INDEX = -1;
	public static final int FULL = 11;
	private final int[] NUMBERS = new int[CAPACITY];

	private int total = INIT_INDEX;

	/**
	 * @return
	 */
	public int getTotal(){
		return total;
	}

	protected void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/**
	 * @return
	 */
	protected boolean callCheck() {
		return total == INIT_INDEX;
	}
	/**
	 * @return
	 */
	protected boolean isFull() {

		return total == FULL;
	}

	/**
	 * @return
	 */
	protected int peekaboo() {
		if (callCheck())
			return INIT_INDEX;
		return NUMBERS[total];
	}

	/**
	 * @return
	 */
	protected int countOut() {
		if (callCheck())
			return INIT_INDEX;
		return NUMBERS[total--];
	}

	public int[] getNUMBERS() {
		return NUMBERS;
	}

}
