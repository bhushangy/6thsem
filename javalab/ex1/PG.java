
public class PG extends Student {

	int credits;
	
	PG(String name,String usn,Type type,int credits){
		
		super(name,usn,type);
		this.credits = credits;
		
	}
	
	
	void display(){
		System.out.println(name);
		System.out.println(usn);
		System.out.println(type);
		System.out.println(credits);
	}
	
	
	void checkCredits() throws creditException {
		
		
		if(type == Type.Regular && credits < 200){
			throw new creditException(credits);
		}
		
		if(type == Type.Diploma && credits < 150){
			throw new creditException(credits);
		}
		
		System.out.println("registered successfully");
	}
	
}
