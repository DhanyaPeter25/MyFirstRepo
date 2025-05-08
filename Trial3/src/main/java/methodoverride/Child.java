package methodoverride;

public class Child extends Parent {

	public void sum(int a,int b)
	{
		super.sum(10,12);
		int c=a+b;
		System.out.println(c);
	}
	public void display()
	{
		super.display();
		System.out.println("Hello child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.sum(12,15);
		obj.display();
	}
	

}
