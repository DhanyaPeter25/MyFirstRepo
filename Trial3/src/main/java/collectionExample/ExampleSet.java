package collectionExample;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set st = new HashSet();
     st.add("Set 1");
     st.add("Set 2");
     st.add("Set 3");
     System.out.println(st);
     
     
     Set st1 = new HashSet();
     st1.add("Set 4");
     st1.add("Set 5");
     st1.add("Set 6");
     System.out.println(st1);
     System.out.println(st.addAll(st1));
     System.out.println(st);
     //contains
     System.out.println(st.contains("Set 1"));
     
     System.out.println(st.containsAll(st1));
     
     System.out.println(st1.isEmpty());
     
     System.out.println(st1.size());
     st1.clear();
     System.out.println(st1);
     
     st.remove("Set 1");
     System.out.println(st);
	}

}
