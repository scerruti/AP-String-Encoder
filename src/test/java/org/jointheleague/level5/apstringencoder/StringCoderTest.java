package org.jointheleague.level5.apstringencoder;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.jointheleague.level5.apstringencoder.StringCoder;
import org.jointheleague.level5.apstringencoder.StringPart;
import org.junit.Test;

public class StringCoderTest {

	@Test
	public void testDecodeString() {
		StringCoder coder = new StringCoder(
				"sixtyzipperswerequicklypickedfromthewovenjutebag");
		ArrayList<StringPart> parts = new ArrayList<StringPart>(4);
		parts.add(new StringPart(37, 3));
		parts.add(new StringPart(14, 2));
		parts.add(new StringPart(46, 2));
		parts.add(new StringPart(9, 2));

		assertEquals("overeager", coder.decodeString(parts));
	}

	@Test
	public void testFindPart() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		StringCoder coder = new StringCoder(
				"sixtyzipperswerequicklypickedfromthewovenjutebag");
		StringPart part = new StringPart(37, 3);
		
        Class<?>[] cArg = new Class[1];
        cArg[0] = String.class;
		Method findPart = StringCoder.class.getDeclaredMethod("findPart", cArg);
		findPart.setAccessible(true);
		
		assertEquals(part, findPart.invoke(coder, "overeager"));
	}

	@Test
	public void testEncodeString() {
		StringCoder coder = new StringCoder(
				"sixtyzipperswerequicklypickedfromthewovenjutebag");
		ArrayList<StringPart> parts = new ArrayList<StringPart>(4);
		parts.add(new StringPart(37, 3));
		parts.add(new StringPart(14, 2));
		parts.add(new StringPart(46, 2));
		parts.add(new StringPart(9, 2));

		assertEquals(parts, coder.encodeString("overeager"));
	}

}
