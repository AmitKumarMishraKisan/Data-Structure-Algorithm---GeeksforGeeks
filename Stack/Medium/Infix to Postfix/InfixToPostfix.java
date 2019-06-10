import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixToPostfix {
	private BufferedReader reader;
	private String infix, postfix;

	public static void main(String[] args) throws Exception {
		InfixToPostfix itp = new InfixToPostfix();
		itp.init();
		byte T = itp.readT();
		while (T-- > 0) {
			itp.readExp();
			itp.postfixConversion();
			itp.disp();
		}
		itp.reader.close();
	}

	private void init() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		infix = null;
		postfix = null;
	}

	private byte readT() throws Exception {
		return Byte.parseByte(reader.readLine());
	}

	private void readExp() throws Exception {
		infix = reader.readLine();
	}

	private void postfixConversion() {
		StringBuilder exp = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		postfix = new String("");
		for (int iter = 0; iter < infix.length(); iter++) {
			char ch = infix.charAt(iter);
			if (Character.isLetterOrDigit(ch)) {
				exp.append(ch);
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.empty() && stack.peek() != '(') {
					exp.append(stack.pop());
				}
				if (!stack.empty() && stack.peek() == '(') {
					stack.pop();
				} else {
					postfix = "Invalid Expression";
					return;
				}
			} else {
				while (!stack.empty() && getPrecedance(ch) <= getPrecedance(stack.peek())) {
					if (stack.peek() == '(') {
						break;
					}
					exp.append(stack.pop());
				}
				stack.push(ch);
			}
		}
		while (!stack.empty()) {
			if (stack.peek() == '(') {
				postfix = "Invalid Expression";
				return;
			}
			exp.append(stack.pop());
		}
		postfix = exp.toString();
	}

	private int getPrecedance(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		case '(':
			return 4;
		case ')':
			return 5;
		default:
			return 0;
		}
	}

	private void disp() {
		System.out.println(postfix);
	}
}
