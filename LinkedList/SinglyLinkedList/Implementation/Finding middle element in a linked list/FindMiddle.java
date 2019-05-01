import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class FindMiddle {
    private Node head;  // head of list

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

    /* Driver program to test above functions */
    public static void main(String args[]) {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            FindMiddle llist = new FindMiddle();
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            GFG gfgobj = new GFG();
            //llist.head = new GFG().Middle(llist.head);
            System.out.println(gfgobj.getMiddle(llist.head));

            //llist.printList();

            t--;
        }
    }
}

class GFG {
    // Function to find middle element a linked list
    int getMiddle(Node head) {
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            return head.data;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }
        return slow.data;
    }
}