package aggregation;

public class Child2 
{
	int pin;
	String dist;
	Parent2 ref1;
	public Child2(int pin,String dist,Parent2 ref1)
	{
		this.ref1=ref1;
		this.pin=pin;
		this.dist=dist;
		
	}
	public void show()
	{
		System.out.println(pin);
		System.out.println(dist);
		System.out.println(ref1.name);
		System.out.println(ref1.roll);
	}

	public static void main(String[] args)
	{
		Parent2 obj1 = new Parent2(12,"Ishan");
		Child2 obj = new Child2(695524,"Tvpm",obj1);
		obj.show();
		

	}

}
