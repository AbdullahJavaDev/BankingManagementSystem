package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignUpForm3 extends JFrame implements ActionListener{

JLabel ltitle,lAccType,lCardNo,lCardEx,lPinNo,lCardDes,lPinEx,lPinDesc,lService;
JRadioButton rbtnSave,rbtnFDA,rbtnCurAcc,rbtnDepoAcc;
JCheckBox catm,internetBanking,emailAlerts,mobileBanking;
JButton submit,cancel;
String FormNo="";
	
	public SignUpForm3(String FormNo){
		this.FormNo=FormNo;
		
		//Frame designing
		setTitle("New Application Accountant Form-3");
		setLayout(null);
		setSize(800,650);
		setLocation(250,70);
		getContentPane().setBackground(Color.BLACK);
	
		
		//Title design
		//label
		ltitle=new JLabel("page-3 Account Details");
		ltitle.setBounds(250,25,530,40);
		ltitle.setBackground(Color.BLACK);
		ltitle.setForeground(Color.BLUE);
		ltitle.setFont(new Font("Arial",Font.BOLD,25));
		add(ltitle);
	
		
		//Account--type
		lAccType=new JLabel("Account-Type:");
		lAccType.setBounds(70,75,300,30);
		lAccType.setBackground(Color.BLACK);
		lAccType.setForeground(Color.ORANGE);
		lAccType.setFont(new Font("Tahoma",Font.BOLD,18));
		add(lAccType);
		//radio button1 save
		rbtnSave=new JRadioButton("Saving Account");
		rbtnSave.setBounds(120,120,200,40);
		rbtnSave.setBackground(Color.BLACK);
		rbtnSave.setFont(new Font("Tahoma",Font.BOLD,16));
		rbtnSave.setForeground(Color.CYAN);
		add(rbtnSave);
		//radio button2 save
		rbtnFDA=new JRadioButton("Fix Deposit Account");
		rbtnFDA.setBounds(400,120,200,40);
		rbtnFDA.setBackground(Color.BLACK);
		rbtnFDA.setForeground(Color.CYAN);
		rbtnFDA.setFont(new Font("Tahoma",Font.BOLD,16));
		add(rbtnFDA);
		//radio button for Current Account 
		rbtnCurAcc=new JRadioButton("Current Account");
		rbtnCurAcc.setBounds(120,160,200,40);
		rbtnCurAcc.setBackground(Color.BLACK);
		rbtnCurAcc.setForeground(Color.CYAN);
		rbtnCurAcc.setFont(new Font("Tahoma",Font.BOLD,16));
		add(rbtnCurAcc);
		//radio button for Recurring Account 
		rbtnDepoAcc=new JRadioButton("Recurring Deposit Account");
		rbtnDepoAcc.setBounds(400,160,300,40);
		rbtnDepoAcc.setBackground(Color.BLACK);
		rbtnDepoAcc.setForeground(Color.CYAN);
		rbtnDepoAcc.setFont(new Font("Tahoma",Font.BOLD,16));
		add(rbtnDepoAcc);
		
		//label---Card number
		lCardNo=new JLabel("Card Number:");
		lCardNo.setBounds(70,200,150,30);
		lCardNo.setBackground(Color.BLACK);
		lCardNo.setForeground(Color.GREEN);
		lCardNo.setFont(new Font("Tahoma",Font.BOLD,18));
		add(lCardNo);
		
		//label--Example
		lCardEx=new JLabel("XXXX-XXXX-XXXX-8756");
		lCardEx.setBounds(200,200,400,30);
		lCardEx.setForeground(Color.WHITE);
		lCardEx.setFont(new Font("Tahoma",Font.BOLD,16));
		add(lCardEx);
		//labe;--desCard
		lCardDes=new JLabel("[Your 16 digit cardNumber]   Visible on ATM CARD");
		lCardDes.setBounds(120,240,900,30);
		lCardDes.setForeground(Color.CYAN);
		lCardDes.setBackground(Color.BLACK);
		lCardDes.setFont(new Font("Tahoma",Font.BOLD,16));
		add(lCardDes);
		
		//label--pin Number
		lPinNo=new JLabel("Pin Number:");
		lPinNo.setBounds(70,280,150,30);
		lPinNo.setBackground(Color.BLACK);
		lPinNo.setForeground(Color.YELLOW);
		lPinNo.setFont(new Font("Tahoma",Font.BOLD,18));
		add(lPinNo);
		lPinEx=new JLabel("XXXX");
		lPinEx.setBounds(200,280,100,30);
		lPinEx.setBackground(Color.BLACK);
		lPinEx.setForeground(Color.WHITE);
		lPinEx.setFont(new Font("Tahoma",Font.BOLD,16));
		add(lPinEx);
		//label ---- Pin Description 
		lPinDesc=new JLabel("[Your four Digit password]");
		lPinDesc.setBounds(120,320,500,30);
		lPinDesc.setForeground(Color.CYAN);
		lPinDesc.setBackground(Color.BLACK);
		lPinDesc.setFont(new Font("Tahoma",Font.BOLD,16));
		add(lPinDesc);
		
		//label  ---- service terms and condition 
		lService= new JLabel("Service Required for you");
		lService.setBounds(70,360,500,30);
		lService.setBackground(Color.BLACK);
		lService.setForeground(Color.BLUE);
		lService.setFont(new Font("Tahoma",Font.BOLD,18));
		add(lService);
		//Checkboxes----ATM CARD
		catm= new JCheckBox("ATM Card");
		catm.setBounds(120,400,200,30);
		catm.setFont(new Font("Tahoma",Font.BOLD,16));
		catm.setForeground(Color.CYAN);
		catm.setBackground(Color.BLACK);
		add(catm);
		//Checkboxes---Internet Banking 
		internetBanking=new JCheckBox("Internet Banking");
		internetBanking.setBounds(400,400,500,30);
		internetBanking.setForeground(Color.CYAN);
		internetBanking.setBackground(Color.BLACK);
		internetBanking.setFont(new Font("Tahoma",Font.BOLD,16));
		add(internetBanking);
		//Checkboxes----Email address
		emailAlerts=new JCheckBox("Email Alerts");
		emailAlerts.setBounds(120,440,250,30);
		emailAlerts.setForeground(Color.CYAN);
		emailAlerts.setBackground(Color.BLACK);
		emailAlerts.setFont(new Font("Tahoma",Font.BOLD,16));
		add(emailAlerts);
		//Checkboxes-----Mobile Banking
		mobileBanking=new JCheckBox("Mobile Banking");
		mobileBanking.setBounds(400,440,500,30);
		mobileBanking.setForeground(Color.CYAN);
		mobileBanking.setBackground(Color.BLACK);
		mobileBanking.setFont(new Font("Tahoma",Font.BOLD,16));
		add(mobileBanking);
		
		
		//button---cancel
		cancel=new JButton("Cancel");
		cancel.setBounds(70,500,150,30);
		cancel.setBackground(Color.RED);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Tahoma",Font.BOLD,16));
		add(cancel);
		//button---submit
		submit=new JButton("Submit");
		submit.setBounds(500,500,150,30);
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLUE);
		submit.setFont(new Font("Tahoma",Font.BOLD,16));
		add(submit);
		
		
		//interaction
		ButtonGroup group=new ButtonGroup();
		group.add(rbtnSave);
		group.add(rbtnFDA);
		group.add(rbtnCurAcc);
		group.add(rbtnDepoAcc);
		setVisible(true);	
		
		//attaching the actionListener
		cancel.addActionListener(this);
		submit.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String acctype="";
		String cardNo="";
		String pinNo="";
		String facility="";
		if(rbtnSave.isSelected()) {
			acctype="Saving Account";
		}
		else if(rbtnFDA.isSelected()) {
			acctype="Fix Deposit Account";
		}
		else if(rbtnCurAcc.isSelected()) {
			acctype="Current Account";
		}
		
		//Generating the cardNo
		Random number=new Random();
		long GcNO=(number.nextLong())%9000000L+736454374;
		cardNo=cardNo+Math.abs(GcNO);
		
		//Generating the pinNo
		Random pin=new Random();
		int Gpin=(number.nextInt())%767679978+786790;
		pinNo=pinNo+Math.abs(Gpin);
		
		//facility logic
		if(catm.isSelected()) {
			facility=facility+"ATM Card";
		}
		if(internetBanking.isSelected()) {
			facility=facility+"Internet Banking";
		}
		if(emailAlerts.isSelected()) {
			facility=facility+"Email Alerts";
		}
		if(mobileBanking.isSelected()) {
			facility=facility+"Mobile Banking";
		}
		
		//Logic for connectiong the database
		try {
			
			if(e.getSource()==submit) {
				if(acctype.equals("")) {
					JOptionPane.showMessageDialog(null,"Please select the option from acctype");
				}
				else {
					//connecting the database
					ConnectionFactory details3=new ConnectionFactory();
					String query1="insert into signUpdetails3 values('"+FormNo+"','"+acctype+"','"+cardNo+"','"+pinNo+"','"+facility+"');";
					String query2="insert into login values('"+FormNo+"','"+cardNo+"','"+pinNo+"');";
					details3.stmt.executeUpdate(query1);
					details3.stmt.executeUpdate(query2);
					System.out.println("Queries are successfully execute");
					JOptionPane.showMessageDialog(null,"Your form is submitted");
					JOptionPane.showMessageDialog(null,"CardNo:"+cardNo+"\n"+"pinNo:"+pinNo);
					new Deposit(pinNo).setVisible(true);
					setVisible(false);
				}
			}
			
		}
		catch(Exception ae) {
			//System.exit(0);
			setVisible(false);
			new Login().setVisible(true);
		}
		
	}
}
