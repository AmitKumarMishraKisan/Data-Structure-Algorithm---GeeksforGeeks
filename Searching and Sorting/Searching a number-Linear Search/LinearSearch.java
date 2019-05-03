import java.io.BufferedReader;
import java.io.InputStreamReader;

class LinearSearch {
    private int N, K;
    private int []arr;
    private BufferedReader br;
    public static void main (String[] args) throws Exception{
        LinearSearch ls = new LinearSearch();
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
        for(int i = 0; i < N; i++){
            if(arr[i] == K){
                return i + 1;
            }
        }
        return -1;
    }
}