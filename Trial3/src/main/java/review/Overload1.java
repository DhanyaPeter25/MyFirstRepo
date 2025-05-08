package review;

public class Overload1
{
 public void test()
 {
	 System.out.println("Parent class");
	 
 }
 public void test(String name)
 {
	 System.out.println(name);
 }
 /*public void display()
 {
	 System.out.println("Parent class method");
 }*/
 public static void main(String args[])
		 {
	 Overload1 obj1=new Overload1();
			 obj1.test();
	 obj1.test("Dhanya");
		 }
}
