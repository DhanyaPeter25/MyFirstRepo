package review;

public class Review3Child extends Review3Parent
{

	public static void main(String[] args) 
	{
		Review3Child obj = new Review3Child();
		obj.print();
		obj.show();

	}

	@Override
	void print() 
	{
		// TODO Auto-generated method stub
		int number=100;
		System.out.println(number);
		
	}

}
