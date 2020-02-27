import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class StudentInfo extends JPanel implements ActionListener {

	
	JLabel name;
	JLabel usn;
	JLabel age;
	JLabel address;
	JLabel sgpa;
	String sgp;
	
	JTextField txtname;
	JTextField txtusn;
	JTextField txtage;
	JTextField txtaddress;
	JTextField txtsgpa;
	JTextField txtcgpa; 
	
	JButton submit;
	JButton display;
	JButton cgpaBut;
	
	JTextArea txtArea;
	
	
	
	
	public StudentInfo() {
		
		name = new JLabel("Name:");
		txtname = new JTextField(10);
		txtname.setBounds(10,20,120,125);
		usn = new JLabel("USN:");
		txtusn = new JTextField(10);
		txtusn.setBounds(10,60,120,125);
		age = new JLabel("Age:");
		txtage = new JTextField(10);
		txtage.setBounds(10,100,120,125);
		address = new JLabel("Address:");
		txtaddress = new JTextField(10);
		txtaddress.setBounds(10,140,120,125);
		sgpa = new JLabel("SGPA:");
		txtsgpa = new JTextField(10);
		txtsgpa.setBounds(10,180,120,125);
		cgpaBut = new JButton("Get CGPA");
		txtcgpa = new JTextField(10);
		txtcgpa.setBounds(10,220,120,125);
		
		submit = new JButton("Submit");
		display = new JButton("Display");
		
		
		display.addActionListener(this);
		cgpaBut.addActionListener(this);
		submit.addActionListener(this);
		
		
		add(name);
		add(txtname);
		add(usn);
		add(txtusn);
		add(age);
		add(txtage);
		add(address);
		add(txtaddress);
		add(sgpa);
		add(txtsgpa);
		add(cgpaBut);
		add(txtcgpa);
		
		add(submit);
		add(display);
		
	}
	public void displayDetails(){
		JFrame frm2 = new JFrame("Display");
		txtArea = new JTextArea(30,30);
		frm2.setContentPane(txtArea);
		frm2.setSize(500,500);
		frm2.setVisible(true);
		String name = txtname.getText();
		System.out.println("Student Details");
		System.out.println("Name: " + name);
		name = txtusn.getText();
		System.out.println("USN: " + name);
		name = txtage.getText();
		System.out.println("Age: " + name);
		name = txtsgpa.getText();
		System.out.println("SGPA: " + name);
		txtArea.append(txtname.getText());
		txtArea.append(txtusn.getText());
		txtArea.append(txtage.getText());
		txtArea.append(txtname.getText());
		txtArea.append(txtname.getText());
		
	}
	
	public void validate() {
		
		
		
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent evt){
		
		if(evt.getSource() == display){
			displayDetails();
			
		}else if(evt.getSource() == cgpaBut) {
			
			sgp = txtsgpa.getText();
			
			txtcgpa.setText(String.valueOf((Double.parseDouble(sgp)/8)));
			
		}
		else if(evt.getSource() == submit) {
			validate();
		}
		
		
	}
	
	
	public static void main(String args[]){
		
		
		StudentInfo ob1 = new StudentInfo();
		
		JFrame frm1 = new JFrame("Student Info");
		frm1.setContentPane(ob1);
		
		frm1.setSize(500,500);
		frm1.setVisible(true);
		
		
	}
	
	
}
