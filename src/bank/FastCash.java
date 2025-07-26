package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FastCash extends JFrame implements ActionListener{
	
	//Instance variables
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JTextField tf1,tf2,tf3;
	String pin="";
	
	//constructor 
	public FastCash(String pin){
		this.pin=pin;
		
		 //Frame designing
		 setTitle("FastCashWithdrawl");
		 setLocation(300,20);
		 setSize(800,650);
		 getContentPane().setBackground(Color.BLACK);
		 ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icons/atm1.jpeg"));
		 Image i2=icon1.getImage().getScaledInstance(700,550,Image.SCALE_DEFAULT);
		 ImageIcon icon3=new ImageIcon(i2);
		 JLabel lblimage=new JLabel(icon3);
		 lblimage.setBounds(0,0,960,1000);
		 add(lblimage);
		
		 //label1
		 l1=new JLabel("PLEASE ENTER THE AMOUNT");
		 l1.setBounds(200,160,700,30);
		 //l1.setBackground(Color.BLACK);
		 l1.setForeground(Color.BLACK);
		 l1.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(l1);
		 //button--1
		 b1=new JButton("Rupees 100");
		 b1.setBounds(180,200,150,30);
		 b1.setForeground(Color.ORANGE);
		 b1.setBackground(Color.BLACK);
		 b1.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(b1);
		 
		 //button--2
		 b2=new JButton("Rupees 500");
		 b2.setBounds(180,240,150,30);
		 b2.setForeground(Color.CYAN);
		 b2.setBackground(Color.BLACK);
		 b2.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(b2);
		
		 //button--3
		 b3=new JButton("Rupees 1000");
		 b3.setBounds(180,280,150,30);
		 b3.setForeground(Color.GREEN);
		 b3.setBackground(Color.BLACK);
		 b3.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(b3);
		 
		 //button--4
		 b4=new JButton("Rupees 10000");
		 b4.setBounds(180,320,150,30);
		 b4.setForeground(Color.YELLOW);
		 b4.setBackground(Color.BLACK);
		 b4.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(b4);
		 
		 //button--5
		 b5=new JButton("BACK");
		 b5.setBounds(350,200,120,30);
		 b5.setForeground(Color.RED);
		 b5.setBackground(Color.BLACK);
		 b5.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(b5);
		 setVisible(true);
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);
		 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			String amount=((JButton)e.getSource()).getText().substring(6);
			ConnectionFactory cf=new ConnectionFactory();
			ResultSet rs=cf.stmt.executeQuery("select*from bank where pin='"+pin+"");
			int balance=0;
			while(rs.next()) {
				if(rs.getString("transaction_type").equals("Deposit")) {
					balance+=Integer.parseInt(rs.getString("amount"));
				}
				else {
					balance-=Integer.parseInt(rs.getString("amount"));
						
					
				}
			}
			
			if(e.getSource()!=b5 && balance<Integer.parseInt(amount)) {
				JOptionPane.showMessageDialog(null,"Insufficient balance");
				return;
			}
			if(e.getSource()==b5) {
				this.setVisible(false);
				new TransactionGUI(pin).setVisible(true);
			}
		}
		
		catch(Exception ae) {
			ae.printStackTrace();
		}
		
	}
	
	
	public static void main(String args[]) {
		
		FastCash obj=new FastCash("");
	}


	

}
