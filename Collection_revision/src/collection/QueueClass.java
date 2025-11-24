package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
	//Queue=> ArrayDeque , PriorityQueue.  //FIFO
		
		
//		Queue<Integer>   arq=new ArrayDeque<Integer>();
//		
//		
//	
//		arq.add(123);
//		arq.add(567);
//		arq.add(789);
	

//PEEK  FIFO 
		
//		System.out.println(arq);
//		
//		System.out.println(arq.poll());
//		System.out.println(arq.peek());
		
		
		PriorityQueue<Employee> pq=new PriorityQueue<Employee>();
		
		
		pq.add(new Employee(1129));
		pq.add(new Employee(1129));
		pq.add(new Employee(345));
		pq.add(new Employee(567));
		pq.add(new Employee(890));
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		
	}

}


class Employee implements Comparable<Employee>
{
	int money;
	
	public  Employee(int money)
	{
		this.money=money;
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare( o.money,this.money);
	}
	
	
	public String toString()
	{
		return this.money+" ";
	}
}

