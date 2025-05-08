package accessspecifier2;

import accessspecifier.AccessExample;

public class AccessExample2 extends AccessExample
{

	public static void main(String[] args) 
	{
		AccessExample2 obj3 = new AccessExample2();
		obj3.show();
		obj3.view();
		//obj3.def();//default cannot call
	}

}
