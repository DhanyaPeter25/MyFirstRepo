package abstractExample;

public class AbsExample2 extends AbsExample1
{
	public void view()
	{
		System.out.println("Normal method in child class");
	}

	public static void main(String[] args)
	{
		AbsExample1 obj = new AbsExample2();//reference for abstract class
		obj.method1();
		obj.trial();
		
		//obj.view(); //if reference is created for abstract class we 
		             //cannot access the methods of normal class
		
	}

	@Override
	void method1() {
		System.out.println("Show abstract method");
		
		
		// TODO Auto-generated method stub
		
	}

}
