package prog1;
import java.util.HashMap;

public class CountryTax {

	public static void main(String[] args) {
		HashMap<String,TaxSystem> hm = new HashMap<String, TaxSystem>();
		System.out.println("Item List");
		Items.itemList();
		hm.put("US",new TaxSystem("bhushan", 30,0.2,Category.Cricket));
		TaxSystem t = hm.get("US");
		
		t.addItems();
		t.calculateBill();
		
		
		

	}

}
