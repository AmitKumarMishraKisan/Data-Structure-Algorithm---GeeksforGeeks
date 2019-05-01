import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class DeleteNode {

    public static void po(Object o) {
        System.out.println(o);
    }

    public static void show(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            Node head1 = null, tail1 = null;

            int n1 = sc.nextInt();
            int d1 = sc.nextInt();
            head1 = new Node(d1);
            tail1 = head1;

            while (n1-- > 1) {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }

            Solution obj = new Solution();
            obj.deleteAlternate(head1);
            System.out.println();
        }
    }
}

class Solution {
    void deleteAlternate(Node head) {
        {
            int count = 0;
            Node cur = head, prev = null;
            while (cur != null) {
                count++;
                if (count % 2 == 0) {
                    prev.next = cur.next;
                    cur.next = null;
                    cur = prev.next;
                } else {
                    prev = cur;
                    cur = cur.next;
                }
            }
        }
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
    }
}