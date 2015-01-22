package org.jointheleague.level5.apstringencoder;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.jointheleague.level5.apstringencoder.StringCoder;
import org.jointheleague.level5.apstringencoder.StringPart;

import org.junit.Test;

public class StringCoderTest {

	@Test
	public void testDecodeString() {
		StringCoder coder = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
		ArrayList<StringPart> parts = new ArrayList<StringPart>(4);
		parts.add(new StringPart(37, 3));
		parts.add(new StringPart(14, 2));
		parts.add(new StringPart(46, 2));
		parts.add(new StringPart(9, 2));
		
		assertEquals("overeager", coder.decodeString(parts));
	}

	@Test
	public void testEncodeString() {
		StringCoder coder = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
		ArrayList<StringPart> parts = new ArrayList<StringPart>(4);
		parts.add(new StringPart(37, 3));
		parts.add(new StringPart(14, 2));
		parts.add(new StringPart(46, 2));
		parts.add(new StringPart(9, 2));
		
		assertEquals(parts, coder.encodeString("overeager"));
	}

}
