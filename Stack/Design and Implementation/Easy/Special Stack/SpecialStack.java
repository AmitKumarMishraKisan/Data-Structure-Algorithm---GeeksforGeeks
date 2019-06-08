import java.util.Scanner;
import java.util.Stack;

class SpecialStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Stack<Integer> s = new Stack<>();
			GfG g = new GfG();
			while (!g.isFull(s, n)) {
				g.push(sc.nextInt(), s);
			}
			System.out.println(g.min(s));
		}
	}
}

class GfG {
	private Stack<Integer> auxillary = new Stack<>();

	public void push(int a, Stack<Integer> s) {
		if (s.empty()) {
			auxillary.removeAllElements();
			s.push(a);
			auxillary.push(a);
		} else {
			if (a > auxillary.peek()) {
				s.push(a);
			} else {
				s.push(a);
				auxillary.push(a);
			}
		}
	}

	public int pop(Stack<Integer> s) {
		if (!s.empty()) {
			int i = s.pop();
			if (i == auxillary.peek()) {
				auxillary.pop();
			}
			return i;
		}
		return -1;
	}

	public int min(Stack<Integer> s) {
		if (!auxillary.empty()) {
			return auxillary.peek();
		}
		return -1;
	}

	public boolean isFull(Stack<Integer> s, int n) {
		if (s.size() == n) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty(Stack<Integer> s) {
		if (s.empty()) {
			return true;
		} else {
			return false;
		}
	}
}