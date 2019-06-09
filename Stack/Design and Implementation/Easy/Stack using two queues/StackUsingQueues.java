import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class StackUsingQueues {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			GfG g = new GfG();

			int q = sc.nextInt();
			while (q > 0) {
				int QueryType = sc.nextInt();
				if (QueryType == 1) {
					int a = sc.nextInt();
					g.push(a);
				} else if (QueryType == 2)
					System.out.print(g.pop() + " ");
				q--;
			}
			System.out.println();

			t--;
		}
	}
}

class GfG {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	int pop() {
		int i = -1;
		if (q1.size() >= 1) {
			while (q1.size() > 1) {
				q2.add(q1.remove());
			}
			i = q1.remove();
		} else if (q2.size() >= 1) {
			while (q2.size() > 1) {
				q1.add(q2.remove());
			}
			i = q2.remove();
		}
		Queue<Integer> temp = q2;
		q2 = q1;
		q1 = temp;
		return i;
	}

	void push(int a) {
		q1.add(a);
	}
}