package abstractExample;

public class Example2 extends Example1 
{
	public void trial()
	{
		System.out.println("Normal method declared in non abstract class");
	}

	public static void main(String[] args)
	{
		Example2 obj = new Example2();
		obj.display();
		System.out.println(obj.show());
		obj.view();
		obj.trial();
	}
	@Override
	void display()
	{
		System.out.println("Abstract class");
	}
	@Override
	int show() 
	{
		int a=10;
		int b=23;
		int c =a+b;
		return c;
	}

}
