package edu.kis.vh.nursery;

/**
 * klasa zajmująca się przehowywaniem oraz obsługą tablicy
 */

public class DefaultCountingOutRhymer {
	/**
	 * Capacity przechowuje rozmiar tablicy
	 */

	public static final int CAPACITY = 12;
	/**
	 * Empty stała odpawadjąca za zerowanie tablicy
	 */
	public static final int EMPTY = -1;
	/**
	 * tablica danych
	 */
	private final int[] numbers = new int[CAPACITY];
	/**
	 * ustawienie zmiennej total na -1
	 */
	private int total = EMPTY;

	/**
	 * Zapisanie wartości do tablicy na następny indeks oraz zwiększenie total
	 * @param in liczba która ma być wpisana do tablicy
	 */

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 *funkcja zwracająca true jeżeli tablica jest pusta
	 * @return true jeśli tablica jest pusta
	 */
	public boolean callCheck() {
		return total == EMPTY;
	}
	/**
	 * funkcja zwracająca true jeżeli tablica jest pełna
	 * @return true jeśli tablica jest pełna
	 */
	public boolean isFull() {

		return total == CAPACITY-1;
	}

	/**
	 * Funkcja zwraająca liczbe pod aktualnym indeksem
	 * @return liczba z tablicy pod aktualnym indeksem
	 */
	public int peekaboo() {
		if (callCheck())
			return EMPTY;
		return numbers[total];
	}

	/**
	 * Funkcja zwracająca liczbę z pod akutalnego indeksu oraz mniejszająca indeks o 1
	 * @return liczba z tablicy pod aktualnym indeksem
	 */
	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}


}
