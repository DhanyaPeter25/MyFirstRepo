package interface_Example;

public class ClassMultipleInheritance implements Example1,InterfaceReference 

{

	public static void main(String[] args)
	{
		
		ClassMultipleInheritance obj = new ClassMultipleInheritance();
		obj.animal1();
		obj.animal2();
		obj.display();
	}

	@Override
	public void display() 
	{
		System.out.println("Multiple Inheritance");
		
	}

	@Override
	public void animal1() 
	{
		System.out.println("Anilmal 1 ");
		
	}

	@Override
	public void animal2() 
	{
		
		System.out.println("Animal2");
	}

}
