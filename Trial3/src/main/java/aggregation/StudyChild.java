package aggregation;

public class StudyChild
{
    String place;
    int pin;
    StudyParent ref;
    public StudyChild(String place,int pin,StudyParent ref)
    {
    	this.place=place;
    	this.pin=pin;
    	this.ref=ref;
    }
    public void display()
    {
    	System.out.println(ref.name);
    	System.out.println(ref.age);
    	System.out.println(place);
    	System.out.println(pin);
    	System.out.println();
    }
	public static void main(String[] args)
	{
		StudyParent obj = new StudyParent("Vilasini",80);
		StudyChild obj2=new StudyChild("Kovalam",695524,obj);
		obj2.display();
	}

}
