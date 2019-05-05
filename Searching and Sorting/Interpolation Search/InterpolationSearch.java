import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InterpolationSearch {
    private int N, K;
    private int[] arr;
    private BufferedReader br;

    public static void main(String[] args) throws Exception {
        InterpolationSearch ls = new InterpolationSearch();
        byte T = ls.readT();
        while (T-- > 0) {
            ls.input();
            System.out.println(ls.search());
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

    private int search() {
        int lb = 0, ub = arr.length - 1;
        int count = 0;
        while (lb <= ub && arr[lb] < K && arr[ub] > K) {
            count++;
            if (lb == ub) {
                if (arr[lb] == K) {
                    System.out.println(count);
                    return lb;
                }
                System.out.println(count);;
                return -1;
            }
            int pos = lb + (((K - arr[lb]) * (ub - lb)) / (arr[ub] - arr[lb]));
            if (arr[pos] == K) {
                System.out.println(count);
                return pos;
            } else if (K < arr[pos]) {
                ub = pos - 1;
            } else if (K > arr[pos]) {
                lb = pos + 1;
            }
        }
        System.out.println(count);;
        return -1;
    }
}