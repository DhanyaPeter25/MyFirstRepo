package encapsulation;

public class EncapsExampleMain {

	public static void main(String[] args)
	{
		EncapsExample obj = new EncapsExample();
		obj.setAge(30);
		obj.setMark(450);
		int disp=obj.getAge();
		System.out.println(disp);
		int disp2=obj.getMark();
		System.out.println(disp2);
		

	}

}
