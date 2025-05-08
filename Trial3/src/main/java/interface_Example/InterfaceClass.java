package interface_Example;

public class InterfaceClass implements InterfaceReference
{

	public static void main(String[] args) 
	{
		InterfaceReference obj = new InterfaceClass();
		obj.display();
		//obj.view();

	}
	public void view()
	{
		System.out.println("Method in class");
	}

	@Override
	public void display() 
	{
		System.out.println("Method for illustrating reference");
		
	}

}
