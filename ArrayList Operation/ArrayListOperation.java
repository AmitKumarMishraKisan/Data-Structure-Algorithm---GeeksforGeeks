//Initial Template for Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Position this line where user code will be pasted.
// Driver class with driver code
class ArrayListOperation {
    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Declaring ArrayList
            ArrayList<Character> clist = new ArrayList<>();
            int q = sc.nextInt();
            // Looping for queries
            while (q-- > 0) {
                char ch = sc.next().charAt(0);
                Geeks obj = new Geeks();
                if (ch == 'i') {
                    char c = sc.next().charAt(0);
                    obj.insert(clist, c);
                }
                if (ch == 'f') {
                    char c = sc.next().charAt(0);
                    obj.freq(clist, c);
                }
            }
        }
    }
}

class Geeks {
    // Function to insert element
    static void insert(ArrayList<Character> clist, char c) {
        clist.add(c);
    }

    // Function to count frequency of element
    static void freq(ArrayList<Character> clist, char c) {
        int frequency = Collections.frequency(clist, c);
        if (frequency > 0)
            System.out.println(frequency);
        else
            System.out.println("Not Present");
    }
}