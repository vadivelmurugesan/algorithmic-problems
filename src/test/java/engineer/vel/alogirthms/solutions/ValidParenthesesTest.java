package engineer.vel.alogirthms.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

	ValidParentheses obj = new ValidParentheses();

	@Test
	final void testIsValid() {
		assertEquals(true, obj.isValid("()"));
		assertEquals(true, obj.isValid("()[]{}"));
		assertEquals(false, obj.isValid("(]"));
		assertEquals(false, obj.isValid("([)]"));
		assertEquals(true, obj.isValid("{[]}"));
		assertEquals(true, obj.isValid("(((((())))))"));
		assertEquals(true, obj.isValid("()()()()"));
		assertEquals(false, obj.isValid("(((((((()"));
		assertEquals(true, obj.isValid("((()(())))"));
		assertEquals(false, obj.isValid("({{{{}}}))"));
	}

}
