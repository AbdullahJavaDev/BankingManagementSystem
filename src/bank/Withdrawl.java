package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener{

	
	//Instance variables for frame designing
	JTextField tf1,tf2;
	JLabel l1,l2;
	JButton b1,b2,b3;
	String pin="";
	//constructor 
	public Withdrawl(String pin){
		this.pin=pin;
		
		 //Frame designing
		 setTitle("Deposit Page");
		 setLocation(300,20);
		 setSize(800,650);
		 getContentPane().setBackground(Color.BLACK);
		 
		 //Background picture inserting
		 ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icons/atm1.jpeg"));
		 Image i2=icon1.getImage().getScaledInstance(700,550,Image.SCALE_DEFAULT);
		 ImageIcon icon3=new ImageIcon(i2);
		 JLabel lblimage=new JLabel(icon3);
		 lblimage.setBounds(0,0,960,1000);
		 add(lblimage);
		 
		 //label for withdrawl
		 l1=new JLabel("Maximum Withdrawl is: 10,000");
		 l1.setFont(new Font("System",Font.BOLD,16));
		 l1.setBackground(Color.BLACK);
		 l1.setForeground(Color.BLACK);
		 l1.setBounds(220,190,300,30);
		 lblimage.add(l1);
		 
		 
		 //textfield for label 
		 tf1=new JTextField(20);
		 tf1.setBackground(Color.BLACK);
		 tf1.setForeground(Color.ORANGE);
		 tf1.setFont(new Font("Raleway",Font.BOLD,16));
		 tf1.setBounds(180,220,300,30);
		 lblimage.add(tf1);
		 
		 //Button--Back
		 b1=new JButton("Back");
		 b1.setFont(new Font("Raleway",Font.BOLD,16));
		 b1.setBackground(Color.BLACK);
		 b1.setForeground(Color.GREEN);
		 b1.setBounds(180,290,100,30);
		 lblimage.add(b1);
		 
		 //Button--Deposit
		 b2=new JButton("Withdrawl");
		 b2.setFont(new Font("Raleway",Font.BOLD,16));
		 b2.setBackground(Color.BLACK);
		 b2.setForeground(Color.RED);
		 b2.setBounds(370,290,100,30);
		 lblimage.add(b2);
		 setVisible(true);
		 
		 //adding the actionListeners 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
	
		 
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String amount=tf1.getText();
		Date date=new Date();
		try {
			if(e.getSource()==b2) {
				
				if(tf1.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Please Enter the amount");
				}
				else{
					//connecting to the database
					ConnectionFactory cf=new ConnectionFactory();
					String query="Select*from bank where pin='"+pin+"'";
					ResultSet res=cf.stmt.executeQuery(query);
					
					int balance=0;
					while(res.next()) {
						
						if(res.getString("transaction_type").equals("Deposit")) {
							balance=balance+Integer.parseInt(res.getString("amount"));
						}
						else {
							balance=balance-Integer.parseInt(res.getString("amount"));
						}
					}
					
					if(balance<Integer.parseInt(amount)) {
						JOptionPane.showMessageDialog(null,"Insufficient Balance");
						return;
					}
					
					//for inserting the new amount
					String query2="insert into bank values('"+pin+"','"+date+"'+'withdrawl','"+amount+"')";
					cf.stmt.executeUpdate(query2);
					JOptionPane.showMessageDialog(null,"Debitted successfully amount:"+amount);
					setVisible(false);
					new TransactionGUI(pin).setVisible(true);
					
					
				}
			}
			
			else if(e.getSource()==b1) {
				setVisible(false);
				new TransactionGUI(pin).setVisible(true);
			}
		}
		catch(Exception ae) {
			
		}
	}

}
