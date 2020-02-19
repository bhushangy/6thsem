import java.util.HashMap;

public class Items {

	static HashMap<String,Double> cricket = new HashMap<String,Double>();
	static HashMap<String,Double> hockey = new HashMap<String,Double>();
	static HashMap<String,Double> football = new HashMap<String,Double>();
	static HashMap<String,Double> taxList = new HashMap<String,Double>();
	
	static void itemList() {
		
		cricket.put("a",100.0);
		cricket.put("b",100.0);
		hockey.putAll(cricket);
		football.putAll(cricket);
		taxList.put("US", 0.30);
		taxList.put("IND", 0.40);
		
		
	}
	
	
}
