package aggregation;

public class Child {
	String sub;
	int mark;
	Parent ref;
	public Child(String sub, int mark, Parent ref) 
	{
		this.sub=sub;
		this.mark=mark;
		this.ref=ref;
	}
    public void display()
    {
    	System.out.println(sub);
    	System.out.println(mark);
    	System.out.println(ref.age);
    	System.out.println(ref.name);
    }
	public static void main(String[] args) 
	{
		Parent obj1 = new Parent("Dhanya",10);
		Child obj = new Child("English", 50,obj1);
		obj.display();

	}

}
