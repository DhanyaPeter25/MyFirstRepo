package review;

public class Overload2 extends Overload3
{
    
    public void display()
    {
    	super.display();
    	System.out.println("Child class method");
    }
	public static void main(String[] args)
	{
		
      Overload2 obj = new Overload2();
      obj.display();
	}

}
