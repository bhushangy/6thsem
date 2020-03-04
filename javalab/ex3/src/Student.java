
public class Student {

	String name,usn,address;
	int age;
	double sgpa;
	
	
	
	Student(String n,String u,String addr,int a,double s){
		
		this.name = n;
		this.usn = u;
		this.address = addr;
		this.age = a;
		this.sgpa = s;
		
	}
	
	public String toString() {
		return "\nname: " + name + "\nusn: "+ usn+"\naddress: "+address+"\nage: "+age+"\nsgpa: "+sgpa;
	}
	
	
}
