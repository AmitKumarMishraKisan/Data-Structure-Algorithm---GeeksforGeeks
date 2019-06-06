import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int key) {
		data = key;
		next = null;
	}
}

class Swap {
	static Node head;

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

			GfG gfg = new GfG();
			gfg.pairwiseSwap(head);
			printList(head);
			System.out.println();
		}
	}

	public static void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}

class GfG {
	public static void pairwiseSwap(Node node) {
		if(node == null || node.next == null) {
			return;
		}
		int temp;
		Node prev = node, cur = node.next;
		while (cur != null) {
			temp = prev.data;
			prev.data = cur.data;
			cur.data = temp;
			if (cur.next != null) {
				prev = cur.next;
				cur = prev.next;
			}
		}
	}
}