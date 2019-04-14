import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Occurrence {
    private static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }

            int k = sc.nextInt();
            GfG gfg = new GfG();
            System.out.println(gfg.frequency(head, k));
        }
    }

    private static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}

class GfG {
    static int frequency(Node node, int search) {
        int count = 0;
        Node temp = node;

        while (temp != null) {
            if (temp.data == search)
                count++;
            temp = temp.next;
        }
        return count;
    }
}