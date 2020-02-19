import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map.Entry;


public class TaxSystem {
	Scanner sc = new Scanner(System.in);
	String name;
	double tax;
	Category c;
	String n;
	String item;
	double val;
	double bill;
	double price;
	ArrayList<String> itemsAdded = new ArrayList<String>();
	
	TaxSystem(String n,double tax,Category c){
		
		this.name = n;
		this.tax = tax;
		this.c = c; 
			
	}
	

	void addItems() {

		if(c == Category.Cricket) {

			for (Entry<String, Double> item : Items.cricket.entrySet()) {
				n = item.getKey();
				val = item.getValue();
				System.out.println(n + " : " +val);
			}
			
			boolean foo = true;
			while(foo) {
				System.out.println("enter item");
				item = sc.next();
				itemsAdded.add(item);
				System.out.println("enter false to stop or true to cintinue");
				foo = sc.nextBoolean();
			}
			
			
		}
		
}
	
	
	void calculateBill() {
		
		bill = 0;
		if(c == Category.Cricket) {
		for(String item: itemsAdded) {
			price = Items.cricket.get(item);
			bill = bill + price + price*tax;
	}
		System.out.print(bill);
		
	}
	}
}
