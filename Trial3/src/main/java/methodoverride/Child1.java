package methodoverride;

public class Child1 extends Parent1{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj2 = new Child1();
		obj2.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Test only");
		super.display();
	}

}
