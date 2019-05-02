import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LoopLength {
    private Node head;

    /* Function to print linked list */
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    /* Inserts a new Node at front of the list. */
    private void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            LoopLength llist1 = new LoopLength();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist1.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist1.addToTheLast(new Node(a));
            }
            llist1.head = head;
            Node temp, te;
            int c = sc.nextInt();
            if (c > 0) {
                temp = head;
                te = head;
                while (te.next != null) te = te.next;
                while (c-- > 0) temp = temp.next;
                te.next = temp;
                // s->next=temp;
            }
            GFG obj = new GFG();
            System.out.println(obj.countNodesinLoop(llist1.head));
        }
    }
}

//Function should return the length of the loop in LL.
class GFG {
    int countNodesinLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int count = 0;
                do {
                    count++;
                    fast = fast.next;
                } while (slow != fast);
                return count;
            }
        }
        return 0;
    }
}