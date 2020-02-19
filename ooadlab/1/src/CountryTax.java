import java.util.Scanner;

public class CountryTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
//		String n;
//		String categ;
	
		Items.itemList();
		System.out.println("Select Category");
		System.out.println("1)Cricket 2)Football 3)Hockey 4)Quit");
		ch = sc.nextInt();
		switch(ch) {
		
		case 1:	
				TaxSystem  t = new TaxSystem("bhushan",Items.taxList.get("US"),Category.Cricket);
				t.addItems();
				t.calculateBill();
				break;	
		
		default:System.out.print("pthu");
		
		}			
		
	}

}
