package bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TransactionGUI extends JFrame implements ActionListener{
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	String pin="";
	
	//constructor 
	 public TransactionGUI(String pin){
		 this.pin=pin;
		 //Frame designing
		 setTitle("Transaction Page");
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
		 l1=new JLabel("PLEASE SELECT YOUR TRANSACTION");
		 l1.setBounds(180,160,700,30);
		 //l1.setBackground(Color.BLACK);
		 l1.setForeground(Color.BLACK);
		 l1.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(l1);
		 
		 
		 //Button---deposit
		 b1=new JButton("DEPOSIT");
		 b1.setBounds(180,200,140,20);
		 b1.setBackground(Color.BLACK);
		 b1.setForeground(Color.BLUE);
		 b1.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage. add(b1);
		 
		 //Button---Withdrawl
		 b2=new JButton("WITHDRAWL");
		 b2.setBounds(330,200,145,20);
		 b2.setBackground(Color.BLACK);
		 b2.setForeground(Color.ORANGE);
		 b2.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(b2);
		 
		 //Button---Fast Cash
		 b3=new JButton("FAST CASH");
		 b3.setBounds(175,250,145,20);
		 b3.setBackground(Color.BLACK);
		 b3.setForeground(Color.GREEN);
		 b3.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage. add(b3);
		 
		 //Button--Ministatement
		 b4=new JButton("MINISTATEMENT");
		 b4.setBounds(330,250,145,20);
		 b4.setBackground(Color.BLACK);
		 b4.setForeground(Color.CYAN);
		 b4.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage. add(b4);
		 
		//Button---Pin Change
		 b5=new JButton("PINCHANGE");
		 b5.setBounds(175,300,145,20);
		 b5.setBackground(Color.BLACK);
		 b5.setForeground(Color.YELLOW);
		 b5.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage. add(b5);
		 
		 
		//Button---Balance check
		 b6=new JButton("BALANCE CHECK");
		 b6.setBounds(330,300,145,20);
		 b6.setBackground(Color.BLACK);
		 b6.setForeground(Color.BLUE);
		 b6.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage. add(b6);
		 
		 //Button---Exit
		 b7=new JButton("EXIT");
		 b7.setBounds(250,330,145,20);
		 b7.setBackground(Color.BLACK);
		 b7.setForeground(Color.RED);
		 b7.setFont(new Font("Tahoma",Font.BOLD,16));
		 lblimage.add(b7);
		 setVisible(true);
		 
		 //Attaching the ActionListener 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);
		 b6.addActionListener(this);
		 b7.addActionListener(this);
		 
	}
	 
	 @Override
		public void actionPerformed(ActionEvent e) {
			
		 if(e.getSource()==b7) {
			 System.exit(0); 
		 }
		 else if(e.getSource()==b1) {
			 new Deposit(pin);
		 }
		 else if(e.getSource()==b2) {
			 setVisible(false);
			 new Withdrawl(pin).setVisible(true);
		 }
			
		}
	
}
