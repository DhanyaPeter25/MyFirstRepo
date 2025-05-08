package accessspecifier;

public class Access2 extends AccessExample
{

	public static void main(String[] args) 
	{
		Access2 obj1 = new Access2();
		obj1.show();//public
		obj1.def();//def
		obj1.view();//protected
		obj1.display();//cannot call private

	}

}
