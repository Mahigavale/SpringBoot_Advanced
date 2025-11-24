package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class First {

	public static void main(String[] args) {
		
		/**
		 * Collection (Iterator)
		 *  |
		 *  
	 List(I)     Set(I)      Queue (FIFO) (I)
	  |        |            |
 ArrayList   HashS       ArrayDeque
 LinkedList  Linked      PriorityQueue.
 Vector      TreeS(NS,SS)
 Stack(*)	 
		 */
		
		
		
		
		
		

		  Stack<Integer> list=new Stack<Integer>();
		  
		  
		 
		  list.push(123);
		  list.push(234);
		  list.push(345);
		  list.push(567);
		  list.push(678);
		  list.push(509);
		  list.push(34);
		
		  
		  list.g
		
		   Enumeration<Integer>I=   list.elements();
		
		  //System.out.println(list.peek());
		  
//		  System.out.println(list);
//		  
//		  System.out.println(list.peek());
//		  System.out.println(list);
		

		  while(I.hasMoreElements())
		  {
			 
			  if(I.nextElement()==0)
			  {}
			  System.out.println(I.nextElement());
			  System.out.println("******");
		  }
	}
}


