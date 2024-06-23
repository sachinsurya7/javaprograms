import java .util.Scanner;

public class Factorialprogram {
	int i,n,f=1;
	Scanner sc=new Scanner(System.in);
	
	void get1() {
		System.out.println("enter the N value::");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			f=f*i;}
		
			System.out.println("the I value is::"+f);
		}
		

	public static void main(String[] args) {
		Factorialprogram f1= new Factorialprogram();
		f1.get1();
		

	}

}
