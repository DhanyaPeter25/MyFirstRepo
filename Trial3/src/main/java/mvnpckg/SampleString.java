package mvnpckg;

public class SampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer("Hai");
		System.out.println(buf);
		StringBuilder sb=new StringBuilder("Welcome to kodaikanal");
		System.out.println(sb);
		
		//append ->adding one string to another
		
		System.out.println(buf.append("   Iam Aishwarya"));
		
		//insert ->to insert new element based on the index
		
		System.out.println(buf.insert(2, "wel"));
		buf.replace(1, 6,"elloi");
		System.out.println(buf);
		
		//reverse
		
		/*buf.reverse();
		System.out.println(buf);*/
		
		
		//delete
		buf.delete(0, 2);
		System.out.println(buf);
	}
	}


