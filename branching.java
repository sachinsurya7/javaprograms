import java.util.Scanner;
public class branching {
	int age;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
	  System.out.println("Enter you age::");
	  age=sc.nextInt();
	}
	void get2()
	{
	
	if(age>=18)
	 {
		 System.out.println("You are Elegible for voting");
	 }
	else
	{
		System.out.println("you are Not elegible for voting");
	}
	
	}
	public static void main(String[] args) {
	branching f1=new branching();
	f1.get1();
	f1.get2();
		
	}

}
