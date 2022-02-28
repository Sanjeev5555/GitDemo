package Cucumber.Automation;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;



public static void main (String[] args) 
{
	//method to create arraylist and print contents
	ArrayList<String> arraylist = new ArrayList<String>();
	arraylist.add("sanjeev");
	arraylist.add("kumar");
	arraylist.add("ghorpade");
	arraylist.add(2, "ku");
	arraylist.add("k");

	System.out.println("hello");
	
	//arraylist.clear(); 
	for(String a: arraylist) {
	System.out.println(a);
	}
	int x= arraylist.indexOf("sanjeev");
	System.out.println("index of kumar is " + x);
}		
}


/*
public static void printrev(int[] c) {
	//accept integer array and print contents. 
	System.out.println("hello");
	for(int b=4; b>=0; b--)
	System.out.println(c[b]);
}*/
	//Example for switch case
	/*
	public static void main (String[] args) 
	{
		
		System.out.println("Enter the grade of the student [A,B,C or D]: ");
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0); 
		
		switch (grade) {
		case 'a': 
			System.out.println("January");
			break;
		case 'b': 
			System.out.println("Febraruy");
			break;
		case 'c': 
			System.out.println("March");
			break;
		default:
				System.out.println("default ");
				
		}
		System.out.println("out of for loop");
}*/


	//Examples for Array functioning
	/*
	public static void main (String[] args) 
	{
		/*int a[];
		int d[]= new int[5];
		
		a=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		int[] a= {11,22,33,44,55};
		//Arrays.fill(d,9);
	/*
	System.out.println("Enter 5 integers: ");
		Scanner sc = new Scanner(System.in);
		for(int b =0; b<d.length; b++)
			d[b] = sc.nextInt();*/
		//a=d;
		//int z=d[4];
			/*	
		System.out.println("Entered numbers are: ");
		for(int b =0; b<d.length; b++)
				System.out.println("value of a["+b+"] :" + a[b]);
		System.out.println("value of z :" + z);
		
		System.out.println("Entered numbers are: ");
		for(int b =0; b<a.length; b++)
				System.out.println("value of a["+b+"] :" + a[b]);
		//System.out.println("value of z :" + z);
		
		System.out.println("Entered numbers are for each: ");
		for(int x : a) {
				System.out.println("value of  :" + x);}
		//System.out.println("value of z :" + z);
		}*/

		

/*
	
	public static void main (String[] args) 
	{
		//method to print multiplication tables.
		Scanner sc =  new Scanner(System.in);
		System.out.println(" Enter the number: ");
		int a = sc.nextInt();
		for(int b=1; b<=10 ; b++)
		{
			System.out.println(a + " x " + b + " = " + (a*b) );
		}
	
	}*/



/*
public class App{
	public static void main (String[] args) {
	int ans=0;
		do {
			Scanner sc =  new Scanner(System.in);
			ystem.out.println(" Enter first No: ");S
			int a = sc.nextInt();
			System.out.println(" Enter Second No: ");
			int b = sc.nextInt();
			System.out.println(" The sum of two numbers is: " + (a+b));
			System.out.println(" Enter 1 to continue");
			ans = sc.nextInt();
		}while (ans ==1);
	System.out.println(" Thank You");
}
*/

/*
public class App{
			
		public static void main (String[] args) {
		//do while loop example
			int counter =0;	 
		do
		{
		System.out.println(counter + " I love Java");
		counter++;
		}while (counter < 10);
}
}*/

/*
class A{
	void display() {
	System.out.println("Display of class A");
}

}*/

/*	
public class App extends A{
	
	void display() {
		System.out.println("Display of class over riding main");
	}
	
	public static void main (String[] args) {
		App overridingmain=new App();
		overridingmain.display(); 
//		display();
		System.out.println("inside parent");
		
		}
}
*/
/*
public class App {
	/*public static void main( String[] args ) {
		//factorial();
		//whileloop();	
		//ifelse();
		//displayname("Vaibhav", 9);
		//int max; 
		//max = maxval(7,4); 
		//System.out.println("max value: "+ max);
		add();
		add(2);
		add(1,2);
		add(1,2,3);
		System.out.println("Hello "+ "world");
		System.out.println(10+20);
		System.out.println("hello "+(20 + 20));
		System.out.println(20 +10+ "hello ");
		
	}
	//add() to demonstarate over loading
public static void add() {
	System.out.println("Value of a: " + 1);	
}

public static void add(int a) {
	System.out.println("Value of a: " + a);
}

public static void add(int a, int b) {
		System.out.println("Value of a: "+ (a + b));
}
public static void add(int a, int b, int c ) {
	System.out.println("Value of a: "+ (a + b +c));
}
		
public static int maxval(int a, int b) {
	//returns the maximum of two integers. 
		int max; 
		if(a>b) 
			max=a;
			else
				max=b;
		return max; 
		  }
	
	public static void displayname(String nam, int age) {
		
		for(int i=0; i<5; i++){
		  System.out.println( "Name: " + nam + " Age: " + age );
		  
		}
	}
	public static void factorial() {
		//prints the factorial of an input number
		int i=1,t=1;    
		  System.out.println( "Enter the number: " );
	    	 Scanner sc =  new Scanner(System.in);
	    	  int number = sc.nextInt();
		  while(i<=number) {    
		      t=t*i;
		      i++;
			  }    
		 System.out.println("XX " +number+" YY "+t);
	}

    public static void whileloop() {
    	//example for while loop
    	int counter=0;
    	while (counter < 5) {
    		System.out.println( "I love Java " );
    		counter ++;
    	}
    	System.out.println( "Out of While loop" );
    }



    public static void ifelse() {
   	    	//example for if else function
       	 System.out.println( "Welcome to Internet Banking " );
    	 Scanner sc =  new Scanner(System.in);
    	 System.out.println( "Enter your Age: " );
    	 int mage= sc.nextInt(); 
    	 if(mage > 21){
    		 if(mage > 55) 
    			 System.out.println("Senior Citizen account ");
    		 else if (mage < 55)
    			 System.out.println("Savings account ");
    	 }
    	  else if (mage <21){
    		 			 System.out.println("You can NOt open  ");
    	  }
    	 }
    }
        
    //function will hang if 21 & 55 are entered.



    
    	 /*
    	 int a=10, b=20, c;
    	 c=a;
    	 a=b;
    	 b=c;
    	 System.out.println("a: " + a);
    	 System.out.println("b: " + b);
    	 */  	 
    	 //int a=10, b=20, c=15, d=25, e=20;
    	 
    	 
    	 //Examples for logical operators
    	 /*
    	  int a=10, b=20, c=15, d=25, e=20;
    	 System.out.println("&&: " + (true && true ));
    	 System.out.println("&&: " + (true && false ));
    	 System.out.println("&&: " + (false && false ));
    	 
    	 System.out.println("||: " + (true || true ));
    	 System.out.println("||: " + (false || true ));
    	 System.out.println("||: " + (false || false ));
    	 
    	 System.out.println("!: " + (!true));
    	 */
    	 
    	 
    	 
    	 //Examples for boolean operators
    	 /*
    	  System.out.println("a==b: " + (a==b));
    	  System.out.println("a<b: " + (a<b));
    	  System.out.println("a>b: " + (a>b));
    	  System.out.println("b==e: " + (b==e));
    	  System.out.println("a!=b: " + (a!=b));
    	  System.out.println("a>=b: " + (a>=b));
    	  System.out.println("a<=b: " + (a<=b));
    	  */
    	  
    	  
    	     	    	 
    	 /*Examples for operators
    
    	 int a=10, b=20, c=15, d=25; 
    	 System.out.println("a+b: " + (a+b)); 	
    	 System.out.println("a*b: " + (a*b));
    	 System.out.println("b-a: " + (b-a));
    	 System.out.println("b/a: " + (b/a));
    	 System.out.println("c%a: " + (c%a)); //modus operator will print the remainder
    	 */
    	 
    	 /*Examples for increment/decrement operators
    	 
    	 int x = a++;
    	 int y = ++a; 
    	 System.out.println("a++: " + x);
    	 System.out.println("++a: " + y);
    	 
    	 x = b--;
    	 y = --b;
    	 System.out.println("a++: " + x);
    	 System.out.println("a++: " + y);
    	 */   	 
    	  
    	 
    	 
    	 //System.out.println("Hello java");
        
    	 /*
        int myint = 10/3; 
        float myfloat=10f/3f;
        double mydouble=10d/3d;
        boolean myboolean = true;
        char mychar='s'; 
        char myunicode='\u0044';
                
        System.out.println("myint : " + myint);
        System.out.println("myfloat : " + myfloat);
        System.out.println("mydouble : " + mydouble);
        System.out.println("myboolean : " + myboolean);
        System.out.println("mychar : " + mychar);
        System.out.println("myunicode : " + myunicode);
        */
    	 /*
    	 Scanner sc =  new Scanner(System.in);
    	 System.out.println( "Enter number: " );
    	 int number = sc.nextInt();
    	 
	 int i,t=1;  
	  //int number=5;   
	  for(i=1;i<=number;i++){    
	      t=t*i;    
	    	 //System.out.println("XX " +number+" YY "+t);
	  }    
	 System.out.println("XX " +number+" YY "+t);
	 */
