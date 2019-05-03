import java.io.BufferedReader;
import java.io.InputStreamReader;

class GFG {
    private int N, K;
    private int[] arr;
    private BufferedReader br;

    public static void main(String[] args) throws Exception {
        GFG bs = new GFG();
        byte T = bs.readT();
        while (T-- > 0) {
            bs.input();
            System.out.println(bs.search());
        }
    }

    private byte readT() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        return Byte.parseByte(br.readLine());
    }

    private void input() throws Exception {
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
    }

    private byte search() {
        int lb = 0, ub = N - 1, m;
        while (lb <= ub) {
            m = (lb + ub) / 2;
            if (arr[m] == K) {
                return (byte) 1;
            } else if (arr[m] > K) {
                ub = m - 1;
            } else if (arr[m] < K) {
                lb = m + 1;
            }
        }
        return (byte) -1;
    }
}