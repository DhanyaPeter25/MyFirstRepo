package review;

public class EncapChild {

	public static void main(String[] args) 
	{
		EncapParent obj = new EncapParent();
		obj.setName("Dhanya");
		obj.setAge(10);
		String nm=obj.getName();
		System.out.println(nm);
		System.out.println(obj.getAge());

	}

}
