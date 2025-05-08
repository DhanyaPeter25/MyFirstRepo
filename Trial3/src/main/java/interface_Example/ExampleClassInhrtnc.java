package interface_Example;

public class ExampleClassInhrtnc implements Example1
{

	public static void main(String[] args) 
	{
		ExampleClassInhrtnc obj = new ExampleClassInhrtnc();
		System.out.println(a);
		obj.display();
		obj.show();
	}
	public void show()
	{
		System.out.println("Normal method in child class");
	}

	@Override
	public void display() 
	{
		System.out.println("Inherited method");
	}

}
