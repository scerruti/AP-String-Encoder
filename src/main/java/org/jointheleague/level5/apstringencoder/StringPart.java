package org.jointheleague.level5.apstringencoder;

public class StringPart {
	protected final int start;
	protected final int length;
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

	@Override
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof StringPart)) 
			return false;
		if (arg0 == this)
			return true;
		
		StringPart other = (StringPart) arg0;
		
		return ((this.getLength() == other.getLength()) &&
				(this.getStart() == other.getStart()));
	}

	@Override
	public int hashCode() {
		return (41 *(41 + getLength()) + getStart());
	}
}
