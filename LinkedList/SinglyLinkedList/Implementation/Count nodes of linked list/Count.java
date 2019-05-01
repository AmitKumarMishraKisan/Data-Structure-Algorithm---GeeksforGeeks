import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (head == null)
                    head = new Node(a);
                else
                    insert(head, a);
            }
            GfG g = new GfG();
            System.out.println(g.getCount(head));
        }
    }

    private static Node insert(Node head, int a) {
        if (head == null)
            return new Node(a);
        head.next = insert(head.next, a);
        return head;
    }
}

class GfG {
    int getCount(Node head) {
        byte count = 0;
        for (Node ref = head; ref != null; ref = ref.next) {
            count++;
        }
        return count;
    }
}