package forExcerption;

public class ExceptionSample 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
		}
		catch(Exception e)//if we know what kind of exception is 
		//occurs we can give the exception_class_name obj_name
		{
			//System.out.println("Exception handled");
			b=2;
			int x=a/b;
			System.out.println(x);
		}
		finally
		{
			System.out.println("Remaining code");
		}
		int arr[]= {1,2,3};
		try 
		{
			for(int i=0;i<=3;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error handled");
			System.out.println(e);
		}
	
		
	}

}
