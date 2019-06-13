import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class GFG {
	private BufferedReader br;
	private String ip_exp;

	public static void main(String[] args) {
		GFG exp = new GFG();
		exp.init();
		byte T = exp.readT();
		while (T-- > 0) {
			exp.readData();
			if (exp.checkBalance()) {
				System.out.println("balanced");
			} else {
				System.out.println("not balanced");
			}
		}
	}

	private void init() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	private byte readT() {
		try {
			return Byte.parseByte(br.readLine());
		} catch (Exception e) {
			return 0;
		}
	}

	private void readData() {
		try {
			ip_exp = br.readLine();
		} catch (Exception e) {
		}
	}

	private boolean checkBalance() {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < ip_exp.length(); i++) {
			char ch = ip_exp.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.empty()) {
					return false;
				} else if (!checkBracket(stack.pop(), ch)) {
					return false;
				}
			}
		}
		if (!stack.empty()) {
			return false;
		} else {
			return true;
		}
	}

	private boolean checkBracket(char open, char close) {
		if (open == '(' && close == ')') {
			return true;
		} else if (open == '{' && close == '}') {
			return true;
		} else if (open == '[' && close == ']') {
			return true;
		} else {
			return false;
		}
	}
}