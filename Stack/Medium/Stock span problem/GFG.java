import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GFG {
	private BufferedReader br;
	private short[] price;
	private short[] span;

	public static void main(String[] args) {
		GFG stockSpan = new GFG();
		stockSpan.init();
		byte T = stockSpan.readT();
		while (T-- > 0) {
			stockSpan.readData();
			stockSpan.findStockSpan();
			stockSpan.display();
		}
	}

	private void init() {
		br = new BufferedReader(new InputStreamReader(System.in));
		price = null;
		span = null;
	}

	private Byte readT() {
		try {
			return Byte.parseByte(br.readLine());
		} catch (Exception E) {
			E.printStackTrace();
			return 0;
		}
	}

	private void readData() {
		try {
			short n = Short.parseShort(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			price = new short[n];
			span = new short[n];
			for (short iter = 0; iter < n; iter++) {
				price[iter] = Short.parseShort(st.nextToken());
			}
		} catch (Exception E) {
			E.printStackTrace();
		}
	}

	private void findStockSpan() {
		for (short iter = 0; iter < price.length; iter++) {
			short back_index = 1;
			while ((iter - back_index) >= 0 && price[iter] >= price[iter - back_index]) {
				back_index++;
			}
			span[iter] = back_index;
		}
	}

	private void display() {
		for (Short element : span) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
