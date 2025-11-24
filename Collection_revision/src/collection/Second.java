package collection;

import java.util.HashSet;

public class Second {

	public static void main(String[] args) {

   HashSet<Student> set=new HashSet<Student>();
   
   
   
   set.add(new Student(1,"abc"));
   set.add(new Student(2,"cde"));
  
   System.out.println(set);
  

	}

}

class Student
{
	int id;
	String name;
	public int hashCode()
	{
		return 100;
	}
	public boolean equals(Object o)
	{
		return true;
	}
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}
