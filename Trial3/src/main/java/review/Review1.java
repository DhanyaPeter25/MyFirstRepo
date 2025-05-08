package review;

public class Review1 
{
    String name;
    static char value='y';
    public static void print(String name,int id)
    {
    	System.out.println("Name is "+name);
    	System.out.println("ID is "+id);
    	System.out.println("Character value is "+value);
    }
    public int printAge(int age)
    {
    	return age;
    }
	public static void main(String[] args) 
	{
		Review1 obj=new Review1();
		obj.printAge(35);
		Review1.print("Dhanya", 345);
	}

}
