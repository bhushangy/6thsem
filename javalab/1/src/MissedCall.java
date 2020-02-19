public class MissedCall {

	String name,time;
	long number;
	
	MissedCall(String name,String time,long number){
		this.name = name;
		this.time = time;
		this.number = number;
	}
	
	
	void getDetails() {
		System.out.println("name: "+ name + "number: "+number+"time: "+time+"\n");
	}
	
	
	void getNumber(){
		System.out.println("\n"+number);
	}
	
}
