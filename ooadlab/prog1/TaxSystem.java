package prog1;

import java.util.ArrayList;
import java.util.Scanner;


public class TaxSystem {

	String name;
	double price;
	double tax;
	Category c;
	ArrayList<String> itemsAdded = new ArrayList<String>();
	
	TaxSystem(String n,double price,double tax,Category c){
		
		this.name = n;
		this.price = price;
		this.tax = tax;
		this.c = c; 
			
	}
	
	void addItems() {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		String it;

		if(c == Category.Cricket) {

			for(String item: Items.cricket) {
				System.out.print(item + "  ");
				System.out.print("\n");
		}
		}
		if(c == Category.Hockey) {

			for(String item: Items.hockey) {
				System.out.print(item + "  ");
		}
		}
		if(c == Category.Football) {

			for(String item: Items.football) {
				System.out.print(item + "  ");
		}
		}
		
		while(true) {
			
			System.out.println("enter 1 to add items to add or 0 to quit\n");
			ch = sc.nextInt();
			if(ch == 0) {
				break;
			}
			System.out.println("add item\n");
			it = sc.next();
			itemsAdded.add(it);
			
		}	
		
	}
	
	
	void calculateBill() {
		
		double bill = 0;
		double add = 0; 
		
		for(String item: itemsAdded) {
			add = price * tax;
			bill = bill + price + add;
	}
		System.out.print(bill);
		
	}
	
}
