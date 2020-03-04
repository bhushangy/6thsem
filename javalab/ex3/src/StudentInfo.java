import javax.swing.*;
import java.util.stream.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;

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
	
	JButton validate;
	JButton display;
	JButton cgpaBut;
	
	JTextArea txtArea;
	
	
	
	
	public StudentInfo() {
		
		name = new JLabel("Name:");
		txtname = new JTextField(10);

		usn = new JLabel("USN:");
		txtusn = new JTextField(10);
		
		age = new JLabel("Age:");
		txtage = new JTextField(10);
		
		address = new JLabel("Address:");
		txtaddress = new JTextField(10);
		
		sgpa = new JLabel("SGPA:");
		txtsgpa = new JTextField(10);
	
		cgpaBut = new JButton("Get CGPA");
		txtcgpa = new JTextField(10);
	
		
		validate = new JButton("validate");
		display = new JButton("Display");
		
		
		display.addActionListener(this);
		cgpaBut.addActionListener(this);
		validate.addActionListener(this);
		
		
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
		
		add(validate);
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
	
	
	
	public void actionPerformed(ActionEvent evt){
		
		if(evt.getSource() == display){
			displayDetails();
			
		}else if(evt.getSource() == cgpaBut) {
			
			double sgpa[] = new double[8];
			for(int i=0;i<8;i++) {
			
				sgpa[i] = Double.parseDouble(JOptionPane.showInputDialog("enter sem "+(i+1)+" sgpa"));
				
			}
			
			double su = DoubleStream.of(sgpa).sum();
			txtsgpa.setText(String.valueOf(su));
			
			txtcgpa.setText(String.valueOf(su/8));
			
		}
		else if(evt.getSource() == validate) {
			if(Integer.parseInt(txtage.getText())>22 && Integer.parseInt(txtage.getText()) <18 ) {
				
				JOptionPane.showMessageDialog(null,"Invalid Age!!!");
				
			}
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
