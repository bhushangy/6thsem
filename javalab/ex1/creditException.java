
@SuppressWarnings("serial")
public class creditException extends Exception {
	
	
	int credits;
	
	creditException(int credits){
		this.credits = credits;
	}
	
	public String toString () {
		return "Insufficient Credits!!! " +" => " + credits + "\n";
	}

}
