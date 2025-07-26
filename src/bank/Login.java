package bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Login extends JFrame implements ActionListener{
	
	//Instance variables for frame property
	JLabel lblWelcome,lblCardNo,lblPinNo;
	JTextField tfCardNo;
	JPasswordField pfPinNo;
	JButton btnLogin,btnSignUp,btnClear;
	
	//constructor to design the Login page
	public Login(){
		
	//Frame designing
		setLayout(null);//To disable the  default layout
		setTitle("Banking Management System");
		setSize(800,700);
		setLocation(200,50);
		//setVisible(true);
		getContentPane().setBackground(Color.BLACK);
		
	//Greeting purpose
		lblWelcome=new JLabel("Welcome to Bank of Baroda");
		lblWelcome.setBounds(160,140,530,30);
		lblWelcome.setFont(new Font("Arial",Font.BOLD,32));
		lblWelcome.setForeground(Color.BLUE);
		add(lblWelcome);
		
	//Card-Details
		//label purpose
		lblCardNo=new JLabel("Enter the Card No:");
		lblCardNo.setBounds(120,230,400,30);
		lblCardNo.setFont(new Font("Tahoma",Font.BOLD,22));
		lblCardNo.setForeground(Color.GREEN);
		add(lblCardNo);
		//Text-Boxes purpose 
		 tfCardNo=new JTextField(20);
		 tfCardNo.setBounds(380,230,270,30);
		 tfCardNo.setFont(new Font("Tahoma",Font.BOLD,18));
		 tfCardNo.setForeground(Color.BLACK);
		add( tfCardNo);
		
	//password-Details
		//label purpose
		lblPinNo=new JLabel("Enter the Pin No:");
		lblPinNo.setBounds(120,330,400,30);
		lblPinNo.setFont(new Font("Tahoma",Font.BOLD,22));
		lblPinNo.setForeground(Color.ORANGE);
		add(lblPinNo);
		//password-text-box
		pfPinNo=new JPasswordField(20);
		pfPinNo.setBounds(380,330,270,30);
		pfPinNo.setFont(new Font("Tahoma",Font.BOLD,18));
		pfPinNo.setForeground(Color.BLACK);
		add(pfPinNo);
		
	//Button designing
		btnLogin=new JButton("Login");
		btnLogin.setBackground(Color.BLUE);
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Tahoma",Font.BOLD,16));
		btnLogin.setBounds(120,450,120,30);
		add(btnLogin);
		
		btnSignUp=new JButton("Sign Up");
		btnSignUp.setBackground(Color.GREEN);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Tahoma",Font.BOLD,16));
		btnSignUp.setBounds(320,450,120,30);
		add(btnSignUp);
		
		btnClear=new JButton("Clear");
		btnClear.setBackground(Color.red);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma",Font.BOLD,16));
		btnClear.setBounds(550,450,120,30);
		add(btnClear);
	//Java triggers the actionEvent so that we are connecting the buttons to the listeners
		btnLogin.addActionListener(this);
		btnSignUp.addActionListener(this);
		btnClear.addActionListener(this);
		setVisible(true);
	}
	
	
	//This method automatically calls whenever you click on the any button.
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			if(e.getSource()==btnLogin) {
				
				String pinNo=pfPinNo.getText();
				String CardNo=tfCardNo.getText();
				
				ConnectionFactory details=new ConnectionFactory();
				String query="Select * from login where CardNo='"+CardNo+"'and pin='"+pinNo+"'";
				ResultSet res=details.stmt.executeQuery(query);
				
				if(res.next()) {
					setVisible(false);
					new TransactionGUI(pinNo).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Sorry Incorrect pin or CardNo try again");
				}
				
			}
			else if(e.getSource()==btnSignUp) {
				System.out.println("Please Fill the Sign-Up form");
				this.setVisible(false);
				new SignUpForm1();
			}
			else {
				System.out.println("Your data is erased");
				tfCardNo.setText("");
				pfPinNo.setText("");
			}
		}
		catch(Exception ae) {
			ae.printStackTrace();
		}
		
	}
	

	public static void main(String args[]) {
		
		Login details=new Login();
		
	}
	
	
	
}
