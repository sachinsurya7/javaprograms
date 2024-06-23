class b{
	int rollno=005;
	void get1() {
		System.out.println("this is department");
	
	}
}
class d1 extends b
{
	void get2() {
		System.out.println("Sachin::"+rollno);
	}
}
class d2 extends b
{
	void get3() {
		System.out.println("from Robotics"+rollno);
	}
}
public class hierarchicalinhritance {

	public static void main(String[] args) {
		d1 f1=new d1();
		f1.get1();
		f1.get2();
		
		d2 f2=new d2();
		f2.get1();
		f2.get3();

	}

}
