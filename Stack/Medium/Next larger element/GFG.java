import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class GFG {
	private BufferedReader br;
	private long[] ipArr, ngeArr;

	public static void main(String[] args) {
		GFG nge = new GFG();
		nge.init();
		byte T = nge.readT();
		while (T-- > 0) {
			nge.readData();
			nge.findNGE();
			nge.display();
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
			int n = Integer.parseInt(br.readLine());
			ipArr = new long[n];
			ngeArr = new long[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int iter = 0; iter < n; iter++) {
				ipArr[iter] = Long.parseLong(st.nextToken());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void findNGE() {
		Stack<Long> stack = new Stack<>();
		for (int iter = ipArr.length - 1; iter >= 0; iter--) {
			while (!stack.empty() && stack.peek() <= ipArr[iter]) {
				stack.pop();
			}
			ngeArr[iter] = stack.empty() ? -1 : stack.peek();
			stack.push(ipArr[iter]);
		}
	}

	private void display() {
		for (Long ele : ngeArr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		ipArr = null;
		ngeArr = null;
	}
}