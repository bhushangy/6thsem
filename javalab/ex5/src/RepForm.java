import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RepForm implements ActionListener{
	
	JLabel repNo;
	JLabel repName;
	JLabel state;
	JLabel comm;
	JLabel rate;
	JTextField repTxt;
	JTextField repNameTxt;
	JTextField stateTxt;
	JTextField commTxt;
	JTextField rateTxt;
	JPanel jp;
	JFrame jf;
	JButton submit;
	
	int num;
	String name;
	String st;
	int commis;
	int rat;
	
	
	RepForm(){
		
		repNo = new JLabel("RepNo:");
		repTxt = new JTextField(10);
		repName = new JLabel("RepName:");
		repNameTxt = new JTextField(10);
		state = new JLabel("State:");
		stateTxt = new JTextField(10);
		comm = new JLabel("Commission:");
		commTxt = new JTextField(10);
		rate = new JLabel("Rate:");
		rateTxt = new JTextField(10);
		submit = new JButton("Submit");
		
		
		
		
		jp = new JPanel();
		jp.setLayout(new GridLayout(0,1));
		jp.add(repNo);
		jp.add(repTxt);
		jp.add(repName);
		jp.add(repNameTxt);
		jp.add(state);
		jp.add(stateTxt);
		jp.add(comm);
		jp.add(commTxt);
		jp.add(rate);
		jp.add(rateTxt);
		jp.add(submit);
		
	
		
		submit.addActionListener(this);
		
		jf = new JFrame("Represntative Form:");
		jf.setContentPane(jp);
		jf.setVisible(true);
		jf.setSize(500,500);
		
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == submit){
			
			num = Integer.parseInt(repTxt.getText());
			name = repNameTxt.getText();
			st = stateTxt.getText();
			commis = Integer.parseInt(commTxt.getText());
			rat = Integer.parseInt(rateTxt.getText());
			
			
			
			try {
				//Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ex5","root","root");
				
				String query = "insert into representative values (?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1,num);
				ps.setString(2,name);	
				ps.setString(3,st);
				ps.setInt(4,commis);
				ps.setInt(5,rat);
				
				int i = ps.executeUpdate();
				ResultSet rs = ps.executeQuery("select * from representative");
				while(rs.next()){  
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5));  
					}  
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args){
		
		RepForm ob = new RepForm();
		
	}
	

}
