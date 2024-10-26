package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppnedLastNToIFirst {

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		Node<Integer> node=head,checkNode=null,newHead=null;
		if (n==0)
		{
			return head;
		}

		int count=0;
		while(node!=null)
		{
			node=node.next;
			count=count+1;
		}
		if (count<n)
		{
			return head;
		}

		n=count-n;
		node=head;
		for (int i=0;i<n-1;i++)
		{
			node=node.next;
		}
		checkNode=node.next;
		node.next=null;
		newHead=checkNode;

		while(checkNode.next!=null)
		{
			checkNode=checkNode.next;
		}
		checkNode.next=head;
		head=newHead;
		return head;

	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static Node<Integer> takeInput() throws IOException {
		Node<Integer> head = null, tail = null;

		String[] datas = br.readLine().trim().split("\\s");

		int i = 0;
		while (i < datas.length && !datas[i].equals("-1")) {
			int data = Integer.parseInt(datas[i]);
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			i += 1;
		}

		return head;
	}

	public static void print(Node<Integer> head){
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			Node<Integer> head = takeInput(); 

			int n = Integer.parseInt(br.readLine().trim());
			head = AppnedLastNToIFirst.appendLastNToFirst(head, n);
			print(head);

			t -= 1;
		}

	}

}
