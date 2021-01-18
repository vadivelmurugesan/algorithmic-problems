package engineer.vel.alogirthms.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	private Map<Character, Character> parenthesesMap = null;

	public ValidParentheses() {
		parenthesesMap = new HashMap<Character, Character>();
		parenthesesMap.put('}', '{');
		parenthesesMap.put(')', '(');
		parenthesesMap.put(']', '[');
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (Character currentChar : s.toCharArray()) {
			// has end parentheses
			if (parenthesesMap.containsKey(currentChar)) {
				Character mappingOpenParentheses = parenthesesMap.get(currentChar);
				// already inserted open parentheses for this close parentheses?
				// then remove else we found the answer it is not valid
				if (stack.contains(mappingOpenParentheses) && mappingOpenParentheses == stack.lastElement()) {
					stack.pop();
				} else {
					stack.push(currentChar);
					break;
				}
			} else {
				// push open parentheses
				stack.push(currentChar);
			}
		}

		return stack.isEmpty();

	}
}
