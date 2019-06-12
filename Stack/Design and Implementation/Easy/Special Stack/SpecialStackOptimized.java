import java.util.Scanner;
import java.util.Stack;

class SpecialStackOptimized {
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
	private int minElement;

	public void push(int a, Stack<Integer> s) {
		if (isEmpty(s)) {
			s.push(a);
			minElement = a;
		} else if (a >= minElement) {
			s.push(a);
		} else {
			s.push(2 * a - minElement);
			minElement = a;
		}
	}

	public int pop(Stack<Integer> s) {
		if (!isEmpty(s)) {
			if (s.peek() < minElement) {
				int pE = minElement;
				minElement = 2 * minElement - s.pop();
				return pE;
			} else {
				return s.pop();
			}
		}
		return -1;
	}

	public int min(Stack<Integer> s) {
		if (s.empty()) {
			return -1;
		} else {
			return minElement;
		}
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
