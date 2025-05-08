package collectionExample;
import java.util.ArrayList;
import java.util.List;
public class GenericList {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		li.add("Blue");
		li.add("Green");
		li.add("Red");
		li.add("Yellow");
		//for each iteration
		for(String col:li)
		{
			System.out.println(col);
		}
		//for loop iteration
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
	}

}
