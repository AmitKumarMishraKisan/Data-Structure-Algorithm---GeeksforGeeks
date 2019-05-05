import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JumpSearch {
    private int N, K;
    private int []arr;
    private BufferedReader br;
    public static void main (String[] args) throws Exception{
        JumpSearch ls = new JumpSearch();
        byte T = ls.readT();
        while(T-- > 0){
            ls.input();
            System.out.println(ls.search());
        }
    }

    private byte readT() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        return Byte.parseByte(br.readLine());
    }

    private void input() throws Exception{
        String []input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
    }

    private int search(){
        int step = (int) Math.floor(Math.sqrt(arr.length));
        int prev = 0, index = 0;
        while(arr[index] < K){
            prev = index;
            index += (step - 1);
        }
        while(arr[prev] < K){
            prev++;
        }
        if(arr[prev] == K){
            return prev;
        }
        return -1;
    }
}
