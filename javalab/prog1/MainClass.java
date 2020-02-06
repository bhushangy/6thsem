package prog1;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,time;
		Long num;
		int ch;
		boolean foo = true;
		ArrayList<MissedCall> missedCallList = new ArrayList<MissedCall>(5);
		ArrayList<MissedCall> removeList = new ArrayList<MissedCall>();
		
	
		System.out.println("1)enter missed call details\n"); 
			while(foo) {
				
				System.out.println("enter the number\n");
				num = sc.nextLong();
				System.out.println("enter the time\n");
				time = sc.next();
				
				if(DirectoryClass.directory.containsKey(num)){
					name = DirectoryClass.directory.get(num);
				}else{
					
					name = "private caller ";
				}
				
				//creating missed call objects
				
				MissedCall call = new MissedCall(name,time,num);
				//here for each iteration of the loop call is a different object and thus no need for array of objects
				
				if(missedCallList.size()==5) {
					missedCallList.remove(0);
					missedCallList.add(call);
					System.out.println("enter true to continue or false to stop\n");
					foo = sc.nextBoolean();
				}else{
					missedCallList.add(call);
					System.out.println("enter true to continue or false to stop\n");
					foo = sc.nextBoolean();
				}
			
		}
			
			
			
			System.out.println("\n ur missed call directory\n");
			for(MissedCall m : missedCallList) {
				m.getNumber();			
				System.out.println(" 1)delete number  2)go to next missed call  3)get call details\n 4)quit");
				
				ch = sc.nextInt();
				switch(ch) {
				
				case 1: removeList.add(m);
						break;
				
				case 2: break;
				
				case 3: m.getDetails();
						break;
						
				case 4: break;
				
				default : System.out.println("enter proper choice\n");
						  break;
				}
		
		}
		missedCallList.removeAll(removeList);	
		// if u try to do this inside for loop you will get exception --> java.util.ConcurrentModificationException
		
		System.out.println("specify a number to delete? yes : 1 or no : 0");
		ch = sc.nextInt();
		if(ch==1) {
			System.out.println("enter number to delete");
			long n;
			n = sc.nextLong();
			for(MissedCall m : missedCallList) {
				if(m.number == n)
					removeList.add(m);
			}
			missedCallList.removeAll(removeList);
		}
		
		//final list
		
		for(MissedCall m : missedCallList) {
			m.getDetails();
		}
		sc.close();
		
	}

}
