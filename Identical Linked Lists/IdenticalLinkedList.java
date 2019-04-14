import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class IdenticalLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            Node head1 = null, head2 = null, tail1 = null, tail2 = null;

            //Input first LL
            int n1 = sc.nextInt();
            int d1 = sc.nextInt();
            head1 = new Node(d1);
            tail1 = head1;

            while (n1-- > 1) {
                Node n = new Node(sc.nextInt());
                n.next = head1;
                head1 = n;
            }

            //Input second LL
            int n2 = sc.nextInt();
            int d2 = sc.nextInt();
            head2 = new Node(d2);
            tail2 = head2;

            while (n2-- > 1) {
                Node n = new Node(sc.nextInt());
                n.next = head2;
                head2 = n;
            }

            Solution obj = new Solution();
            if (obj.isIdentical(head1, head2))
                System.out.println("Identical");
            else
                System.out.println("Not identical");
        }
    }

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
}

class Solution {
    boolean isIdentical(Node head1, Node head2) {
        Node list1 = head1, list2 = head2;
        while (list1 != null && list2 != null) {
            if (list1.data != list2.data) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        if (list1 == null && list2 == null) {
            return true;
        }
        return false;
    }
}