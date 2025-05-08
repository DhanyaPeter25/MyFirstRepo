package encapsulation;

public class Child {

	public static void main(String[] args)
	{

      Parent obj = new Parent();
      obj.setNo(99);
      obj.setName("Ishan");
      obj.setColor("Red");
      obj.setAge(9);
      int a= obj.getNo();
      System.out.println(a);
      String b=obj.getName();
      System.out.println(b);
      String c=obj.getColor();
      System.out.println(c);
      int d=obj.getAge();
      System.out.println(d);

	}

}
