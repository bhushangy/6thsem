package ex4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserFrame implements ActionListener {

	JFrame uf;
	JPanel jp;
	JPanel jp2;
	JTextField item;
	JTextField qty;
	JTextField price;
	JButton discount;
	JButton priceBut;
	
	public UserFrame(StartingScreen ob) {
		
		JPanel jp = new JPanel();
		JLabel mobLabel = new JLabel("Ur mob:");
		JTextField jt1 = new JTextField(10);
		JLabel idLabel = new JLabel("Ur cusId:");
		JTextField jt2 = new JTextField(10);
		jt1.setText(String.valueOf(ob.mobile));
		jt2.setText(String.valueOf(String.valueOf(ob.cusId)));
		jt1.setEditable(false);
		jt2.setEditable(false);
		
		
		
		 JLabel jl1 = new JLabel("Enter itemid purchased:");
		 item = new JTextField(10);
		
	
		 JLabel jl2 = new JLabel("Quantity purchased:");
		 qty = new JTextField(10);
		 qty.setEnabled(false);
		 
		 JLabel jl3 = new JLabel("Price:");
		 price = new JTextField(10);
		 price.setEnabled(false);
		 
		 priceBut = new JButton("Get Price");
		 discount = new JButton("Get Discount");
		 priceBut.addActionListener(this);
		 discount.addActionListener(this);
		 
		 
		
		 
		 jp.setLayout(new GridLayout(0,1));
		 jp.add(mobLabel);
		 jp.add(jt1);
		 jp.add(idLabel);
		 jp.add(jt2);
		 jp.add(jl1);
		 jp.add(item);
		 jp.add(jl2);
		 jp.add(qty);
		 jp.add(jl3);
		 jp.add(price);
		 jp.add(priceBut);
		 jp.add(discount);
		 
		uf = new JFrame("User "+String.valueOf(ob.cusId));
		uf.setContentPane(jp);
		uf.setVisible(true);
		uf.setSize(500,500);
		Item obj = new Item();

		
		
	}
	
	public void finalPrice(double n,int price) {
		
		JOptionPane.showMessageDialog(null, "Price after discount is: Rs " +String.valueOf(price - (price*n)));
		
		
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getSource() == priceBut) {
			
			Item it = Item.purchased.get(Integer.parseInt(item.getText()));
			qty.setText(String.valueOf(it.qty));
			price.setText(String.valueOf(it.price));
		}else {
			Item it = Item.purchased.get(Integer.parseInt(item.getText()));
			Object[] options = {"10%","20%", "30%"};
			int n = JOptionPane.showOptionDialog(null,"Select the disount category","Discount", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
			
			switch(n) {
			case 0: finalPrice(0.1,it.price);
					break;
			case 1: finalPrice(0.2,it.price);
					break;
			case 2: finalPrice(0.3,it.price);
					break;
			
			}
			
			
			
		}
		
		
	}

	
}
