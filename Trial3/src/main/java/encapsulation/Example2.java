package encapsulation;

public class Example2 {

	public static void main(String[] args) 
	{
		Example1 obj = new Example1();
		obj.setPassword(12345);
		obj.setUsername("Ishan");
        String usr = obj.getUsername();
        System.out.println(usr);
        int pwd = obj.getPassword();
        System.out.println(pwd);
	}

}
