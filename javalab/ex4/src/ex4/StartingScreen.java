package ex4;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class StartingScreen {

	String userName;
	String passWord;
	int cusId;
	String mobile;
	HashMap<Double, Integer> customers = new HashMap<>();
	
	public StartingScreen() {
		
		customers.put((double) 999999, 1);
		customers.put((double) 888888, 2);
		customers.put((double) 777777, 3);
		
		
	}
	
	
	public void getInput() {
		userName = JOptionPane.showInputDialog(null,"Enter Username");
		
		if(userName.equals("xxx")) {
			passWord = JOptionPane.showInputDialog(null,"Enter Password");
			if(passWord.equals("yyy")) {
				
				mobile = JOptionPane.showInputDialog(null,"Enter mobile num");
				if(customers.containsKey(Double.parseDouble(mobile))){
					cusId = customers.get(Double.parseDouble(mobile));
				}else {
					String cus;
					cus = JOptionPane.showInputDialog(null,"The mobile num does not exists..Enter cusId");
					cusId = Integer.valueOf(cus);
					customers.put(Double.parseDouble(mobile),cusId);
				}
				
				UserFrame uf = new UserFrame(this);
				//Passing the current object of StartingScreen class that has mob and cusId initialised
				
			}else {
				
				JOptionPane.showMessageDialog(null,"Invalid Password");
			}
		}else {
			JOptionPane.showMessageDialog(null,"Invalid Username");
		}
		
	}
	
	
	public static void main(String[] args) {
		StartingScreen s = new StartingScreen();
		s.getInput();
	}
	
	
	
}
