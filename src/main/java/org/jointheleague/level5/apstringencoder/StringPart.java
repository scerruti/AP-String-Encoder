package org.jointheleague.level5.apstringencoder;

public class StringPart {
	protected int start;
	protected int length;
	/**
	 * @param start
	 *            the starting position of the substring in a master string
	 * @param length
	 *            the length of the substring in a master string
	 */
	public StringPart(int start, int length) { /* implementation not shown */
		this.start = start;
		this.length = length;
	}

	/**
	 * @return the starting position of the substring in a master string
	 */
	public int getStart() { /* implementation not shown */
		return this.start;
	}

	/**
	 * @return the length of the substring in a master string
	 */
	public int getLength() { /* implementation not shown */
		return this.length;
	}
}
