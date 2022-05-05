//Reverse Singly LinkedList
import java.util.*;
class Q2{
	Node head;
	Node result;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	} 
	
	
	 void display(Node head){
		 System.out.println();
		if(head==null){
			return;
		}
		Node n= head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	
	 void insert(int data){
		Node new_node = new Node(data);
		if(head==null){
			head=new_node;
			return;
		}
		new_node.next=null;
		Node n=head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=new_node;
		return;	
	}
	
	
	Node reverse(Node head){
		if(head== null || head.next == null){
			return head;
		}
		Node new_head= reverse(head.next);
		head.next.next=head;
		head.next=null;
		return new_head;
	}
	
	
	
	public static void main(String... args){
		Scanner sc= new Scanner(System.in);
		Q2 a = new Q2();
		int testcase =sc.nextInt();
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			a.insert(sc.nextInt());
		}
		
		a.result= a.reverse(a.head);
		
		a.display(a.result);
		
		
		
		
	}
	


}