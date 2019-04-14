import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SumNNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i = 1; i < n; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            Solution obj = new Solution();
            System.out.println(obj.sum(head, k));
        }
    }
}

class Solution {

    //Return the sum of last k nodes
    int sum(Node head, int k) {
        int len = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            len++;
        }
        int sum = 0;
        int count = 0;
        Node cur = head;
        while (count < (len - k)) {
            count++;
            cur = cur.next;
        }
        while (cur != null) {
            sum += cur.data;
            cur = cur.next;
        }
        return sum;
    }
}