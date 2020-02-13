package prog1;

import java.util.ArrayList;

public class Items {

	static ArrayList<String> cricket = new ArrayList<String>();
	static ArrayList<String> hockey = new ArrayList<String>();
	static ArrayList<String> football = new ArrayList<String>();
	
	static void itemList() {
		
		cricket.add("a");
		cricket.add("b");
		cricket.add("c");
		hockey.addAll(cricket);
		football.addAll(football);
		
	}
	
	
}
