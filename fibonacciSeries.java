import java.util.Scanner;
public class fibonacciSeries {
	int n;
	int a=0,b=1,next,c;
	Scanner sc=new Scanner(System.in);
	void get1() {
		System.out.println("enter N value");
		n=sc.nextInt();
	}
	void get2() {
		for(int i=1;i<=n;i++)
		{
			System.out.println(a+"");
			c=a+b;
			a=b;
			b=c;
		 
		}
	     
	}

public static void main(String []args) {
	fibonacciSeries f1= new fibonacciSeries();
	f1.get1();
	f1.get2();
	
}
}