class product {
	product()
	{
		System.out.println("IT IS DEFAULT CONST...");
		
	}
	product(int a)
	{
		System.out.println("IT IS PARAM CONSt...");
	}
	void get1() {
		System.out.println("IT IS NORMAL METHOD");
	}
}
public class constructor {

	public static void main(String[] args) {
		new product();
		product p1= new product(1001);
		p1.get1();
		
	}

}
