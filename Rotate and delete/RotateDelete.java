import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class RotateDelete {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte testCase = 0;
        try {
            testCase = Byte.parseByte(br.readLine().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (byte b = 0; b < testCase; b++) {
            int num = 0;
            try {
                num = Integer.parseInt(br.readLine().trim());
            } catch (Exception e) {
                e.printStackTrace();
            }
            ArrayList<Integer> arr = new ArrayList<>();
            String[] arrays = br.readLine().split(" ");
            for (int n = 0; n < num; n++) {
                arr.add(n, Integer.parseInt(arrays[n]));
            }
            RotateDelete rad = new RotateDelete();
            int result = rad.rotateAndDelete(arr, num);
            System.out.println(result);
        }
    }

    private int rotateAndDelete(ArrayList<Integer> arr, int n) {
        for (int k = 1; n > 1; k++) {
            int temp = arr.get(n - 1);
            arr.add(0, arr.remove(n - 1));
            if (n - k < 0) {
                arr.remove(0);
            } else {
                arr.remove(n - k);
            }
            n--;
        }
        return arr.get(0);
    }
}