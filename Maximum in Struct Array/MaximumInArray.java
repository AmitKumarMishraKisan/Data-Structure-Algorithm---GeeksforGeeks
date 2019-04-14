import java.util.Scanner;

class Height {
    int feet;
    int inches;

    Height(int ft, int inc) {
        feet = ft;
        inches = inc;
    }
}

class MaximumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Height[] arr = new Height[n];
            for (int i = 0; i < n; i++) {
                int temp1 = sc.nextInt();
                int temp2 = sc.nextInt();
                arr[i] = new Height(temp1, temp2);

            }
            GfG gfg = new GfG();

            int res = gfg.findMax(arr, n);
            System.out.println(res);
        }
    }
}

class GfG {
    static int findMax(Height []arr, int n) {
        int max = 0;
        for (Height h : arr) {
            int height = h.feet * 12 + h.inches;
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}