package Cucumber.Automation;

import java.awt.List;
import java.util.ArrayList;
//import java.util.List;
import java.util.LinkedList;

public class school{
	
	public static void main (String[] args) 
	{		
		//method to create Linked list
		List<Integer> q= new LinkedList<Integer>();
		q = insert(q,1);
		q = insert(q,22);
		q = insert(q,333);
		System.out.println(q);
		
	}
		
	private static List<Integer> insert(List<Integer> a,Integer x){
		a.add(x);
		return a; 
	}
	private static List<Integer> remove(List<Integer> a){
		a.remove(0);
		return a; 
	}
	private static List<Integer> getFirstElement(List<Integer> a, Integer x){
		return a.get(0);
	}
}

		/*
		public static void main (String[] args) 
		{		
			//method to create arraylist, add and clear
			ArrayList<student> studentarraylist = new ArrayList<student>();
			student s1 = new student("san", 21);
			studentarraylist.add(s1);
			student s2 = new student("kum", 22);
			studentarraylist.add(s2);
			student s3 = new student("san", 23);
			studentarraylist.add(s3);
			
			for (student s : studentarraylist) {
				System.out.println(s.getname() + "-" + s.getrollnumber());
			}
			
			if(studentarraylist.remove(s1)){
				System.out.println("San has been removed");
				
			}
			for (student s : studentarraylist) {
				System.out.println(s.getname() + "-" + s.getrollnumber());
			}
			studentarraylist.clear();
			if(studentarraylist.isEmpty()) {
				System.out.println("School has been shutdown");
			}
			
			
				
		}*/

	

}

/*
public static void main (String[] args) 
{		
	//method to create arraylist, add and clear
	ArrayList<student> studentarraylist = new ArrayList<student>();
	student s1 = new student("san", 21);
	studentarraylist.add(s1);
	student s2 = new student("kum", 22);
	studentarraylist.add(s2);
	student s3 = new student("san", 23);
	studentarraylist.add(s3);
	
	for (student s : studentarraylist) {
		System.out.println(s.getname() + "-" + s.getrollnumber());
	}
	
	if(studentarraylist.remove(s1)){
		System.out.println("San has been removed");
		
	}
	for (student s : studentarraylist) {
		System.out.println(s.getname() + "-" + s.getrollnumber());
	}
	studentarraylist.clear();
	if(studentarraylist.isEmpty()) {
		System.out.println("School has been shutdown");
	}
	
	
		
}*/

