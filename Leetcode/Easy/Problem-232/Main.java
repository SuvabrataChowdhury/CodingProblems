import java.util.*;

class MyQueue {
	int top1,top2;
	int[] stack;
	
	public MyQueue() {
		top1=-1;
		top2=-1;
		stack=new int[100];
	}
	
	public void push(int x){
		if(top1==-1&&top2==-1)
			top1=(top1+1)%100;
		
		top2=(top2+1)%100;
		stack[top2]=x;
	}
	
	public int pop(){
		int val=stack[top1];
		if(top1==top2){
			top1=-1;
			top2=-1;
		}
		else
			top1=(top1+1)%100;
		
		return val;
	}
	
	public int peek(){
		return stack[top1];
	}
	
	public boolean empty(){
		if(top1==-1&&top2==-1)
			return true;
		return false;
	}
}

public class Main{
	public static void main(String[] args){
		MyQueue q=new MyQueue();
		
		q.push(1);
		q.push(2);
		
		System.out.println(q.peek());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.empty());
	}
}
