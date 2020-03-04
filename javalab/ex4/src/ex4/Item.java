package ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Item {

	String itemName;
	int id,qty,price;
	static HashMap<Integer,Item> purchased = new HashMap<>();
	
	Item(){
		Scanner sc =  new Scanner(System.in);
		boolean foo = true;
		int ch;
		while(foo) {
			System.out.println("Do u want to add items? Hit 1 to add 0 to quit ");
			ch = sc.nextInt();
			foo = ch == 1?true:false;
			if(foo) {
				System.out.println("enter item id");
				id = sc.nextInt();
				System.out.println("enter qty");
				qty = sc.nextInt();
				price = 200;
				
				purchased.put(id,this);

			}
			
		}
		
		
		
	}
}
