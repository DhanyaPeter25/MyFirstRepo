package aggregation;

public class Trial2 
{
	String status;
	Trial1 ref;
	public Trial2(String status,Trial1 ref)
	{
		this.status=status;
		this.ref=ref;
		//System.out.println();
	}
	public void view()
	{
		System.out.println(ref.rollno);
		System.out.println(ref.mark);
		System.out.println(status);
	}

	public static void main(String[] args)
	{
		Trial1 obj = new Trial1(561014,600);
		Trial2 obj1 = new Trial2("Passed",obj);
		obj1.view();
		
	}

}
