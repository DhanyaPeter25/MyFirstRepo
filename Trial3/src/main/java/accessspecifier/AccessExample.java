package accessspecifier;

public class AccessExample
{
public void show()
{
	System.out.println("This is a public method");
}
private void display()
{
	System.out.println("This is a private method");
}
protected void view()
{
	System.out.println("This is a protected method");
}
void def()
{
	System.out.println("This is a default method");
}
	public static void main(String[] args) 
	{
		AccessExample obj = new AccessExample();
		obj.show();
		obj.view();
		obj.display();
		obj.def();

	}

}
