package abstractExample;

public class Review3 
{

	public  String display(String value)
	{
		return value;
	}
	public static void main(String[] args)
	{
		Review3 obj = new Review3();
		String s=obj.display("Hello");
		System.out.println(s);
		

	}

}
