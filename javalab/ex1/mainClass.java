import java.util.ArrayList;


public class mainClass {

	public static void main(String[] args) {
		
		UG st1 = new UG("bhushan","036",Type.Regular,180);
		UG st2 = new UG("xxxxxx","037",Type.Diploma,140);
		PG st3 = new PG("yyyyyy","038",Type.Regular,200);
		
		
//		try{
//			st1.checkCredits();
//		}catch(Exception e){
//			System.out.println(e);
//		}try{
//			st2.checkCredits();
//		}catch(Exception e){
//			System.out.println(e);
//		}
//		
//		try{
//			st3.checkCredits();
//		}catch(Exception e){
//			System.out.println(e);
//		}
		
		
		ArrayList<UG> stdCollection1 = new ArrayList<UG>();
		ArrayList<PG> stdCollection2 = new ArrayList<PG>();
		
		stdCollection1.add(st1);
		stdCollection1.add(st2);
		stdCollection2.add(st3);
		
		System.out.println("UG Students Collection\n");
		
		for(UG s : stdCollection1){
			try {
				s.display();
				s.checkCredits();
			} catch (creditException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("PG Students Collection\n");
		
		for(PG s : stdCollection2){
			try {
				s.display();
				s.checkCredits();
			} catch (creditException e) {
				System.out.println(e);
			}
		}
		
	}

}
