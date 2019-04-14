import java.io.BufferedReader;
import java.io.InputStreamReader;

class LargestElementArray {
    public static void main (String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte testCase = 0;
        try{
            testCase = Byte.parseByte(br.readLine().trim());
        }catch(Exception e){
            e.printStackTrace();
        }
        for(byte b = 0; b < testCase; b++){
            byte num = 0;
            String []arr = {""};
            try{
                num = Byte.parseByte(br.readLine().trim());
                arr = br.readLine().split(" ");
            }catch(Exception e){
                e.printStackTrace();
            }
            int []array = new int[num];
            int maxValue = 0;
            for(byte c = 0; c < num; c++){
                array[c] = Integer.parseInt(arr[c]);
                if(array[c] > maxValue){
                    maxValue = array[c];
                }
            }
            System.out.println(maxValue);
        }
    }
}