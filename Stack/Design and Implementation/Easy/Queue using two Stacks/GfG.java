import java.util.Scanner;
import java.util.Stack;

class GfG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			StackQueue g = new StackQueue();
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryTyoe = sc.nextInt();
				if(QueryTyoe == 1)
				{
					int a = sc.nextInt();
					g.insert(a);
				}else
				if(QueryTyoe == 2)
				System.out.print(g.remove()+" ");
			q--;
				
			}
			System.out.println();
		t--;
		}
	}
}
/*This is a function problem.You only need to complete the function given below*/
class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    /* The method insert to push element
       into the queue */
    void insert(int B) {
		s1.push(B);
	}
    /* The method remove which return the
      element popped out of the queue*/
    int remove() {
    	if(s1.empty()) {
    		return -1;
    	}
		while(!s1.empty()) {
			s2.push(s1.pop());
		}
		int pop = s2.pop();
		while(!s2.empty()) {
			s1.push(s2.pop());
		}
		return pop;
	}
}