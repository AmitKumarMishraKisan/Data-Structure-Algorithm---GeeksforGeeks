import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class InsertToList {
    //  Node head;

    /* Function to print linked list */
    private void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            InsertToList llist = new InsertToList();
            GFG obj = new GFG();
            Node head = null;
            sc.nextLine();
            for (int i = 0; i < n; i++) {

                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                if (a2 == 0)
                    head = obj.insertAtBeginning(head, a1);
                else
                    head = obj.insertAtEnd(head, a1);
            }
            llist.printList(head);
        }
    }
}

class GFG {
    // function inserts the data in front of the list and returns the head of LL.
    Node insertAtBeginning(Node head1, int a1) {
        Node temp = new Node(a1);
        if (head1 == null) {
            head1 = temp;
        } else {
            temp.next = head1;
            head1 = temp;
        }
        return head1;
    }

    // function appends the data at the end of the list and returns the head of LL.
    Node insertAtEnd(Node head1, int a1) {
        Node temp = new Node(a1);
        if (head1 == null) {
            head1 = temp;
        } else {
            Node iter = head1;
            while (iter.next != null) {
                iter = iter.next;
            }
            iter.next = temp;
        }
        return head1;
    }
}