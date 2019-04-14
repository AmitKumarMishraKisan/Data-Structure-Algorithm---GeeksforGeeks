import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    private Node head;

    private void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public static void main(String []args) {
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            LinkedList llist = new LinkedList();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);

            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            GfG pl = new GfG();
            pl.printList(llist.head);
            System.out.println();
            t--;
        }
    }
}

class GfG {
    void printList(Node head) {
        for (Node iter = head; iter != null; iter = iter.next) {
            System.out.print(iter.data + " ");
        }
    }
}