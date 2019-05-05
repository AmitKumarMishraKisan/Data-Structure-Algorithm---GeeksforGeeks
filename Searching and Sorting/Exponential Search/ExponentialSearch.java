import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExponentialSearch {
    private int N, K;
    private int[] arr;
    private BufferedReader br;

    public static void main(String[] args) throws Exception {
        ExponentialSearch ls = new ExponentialSearch();
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
        if(arr[0] == K){
            return 0;
        }
        int index = 1;
        while(arr[index] < K){
            index *= 2;
        }
        int lb = index / 2, ub = Math.min(index, arr.length);
        while(lb <= ub){
            int mid = (lb + ub) / 2;
            if(arr[mid] == K){
                return mid;
            }else if(arr[mid] > K){
                ub = mid - 1;
            }else if(arr[mid] < K){
                lb = mid + 1;
            }
        }
        return -1;
    }
}