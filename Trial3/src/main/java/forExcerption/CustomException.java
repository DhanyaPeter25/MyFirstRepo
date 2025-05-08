package forExcerption;

public class CustomException {

	public static void main(String[] args) throws VoteException
	{
		int age=9;
		if(age>=18)
			System.out.println("Eligible for voting");
		else
		{
			throw new VoteException("Not eligible");
		}
	}

}
