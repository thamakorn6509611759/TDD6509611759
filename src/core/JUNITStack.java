package core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	public void testCreateNewEmptyStack() {
	Stack s1 = new Stack();
	int size = s1.getSize();
	assertEquals(0, size);
	assertTrue(s1.isEmpty());
	}
	
	public void testPushElmToTop() {
		Stack s1 = new Stack();
		s1.push(1);
		assertEquals(1, s1.Top());
	}
	
	
	
	
}
