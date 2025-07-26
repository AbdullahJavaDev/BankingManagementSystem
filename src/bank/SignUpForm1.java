package bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUpForm1 extends JFrame implements ActionListener {
	
	//Instance variables 
	JLabel lFormNo,lPDetails,lName,lFName,lGender,lEmail,lDOB,lMaritalStatus,lPin,lCity,lState,lDate,lMonth,lYear;
	JTextField tfName,tfFName,tfEmail,tfPin,tfCity,tfState,tfaddress,tf8;
	JRadioButton rMale,rFemale,rMarried,rUnMarried,rOther;
	JButton btnNext;
	JDateChooser dateChooser;
	
	//Random number generator--Application number
	static Random random=new Random();
	static long num=random.nextLong()%9000+1000;
	static String number=""+Math.abs(num);
	
	
	//creating a constructor
	public SignUpForm1() {
		
	//Frame designing
		setLayout(null);
		setTitle("New Application Form");
		setSize(800,700);
		setFont(new Font("Arial",Font.BOLD,32));
		getContentPane().setBackground(Color.BLACK);
		setLocation(250,50);
		//setVisible(true);
		
	//Greeting
		lFormNo=new JLabel("Application Form:"+number);
		lFormNo.setFont(new Font("RaleWay",Font.BOLD,30));
		lFormNo.setBounds(200,20,700,30);
		lFormNo.setForeground(Color.BLUE);
		add(lFormNo);
		
	//Person Details of the customer 
		lPDetails=new JLabel("Personal Details of the customer");
		lPDetails.setFont(new Font("Arial",Font.BOLD,22));
		lPDetails.setBounds(200,60,600,30);
		lPDetails.setForeground(Color.GREEN);
		add(lPDetails);
		
		//Name of the candidate
		//Label
		lName=new JLabel("Name of the Accountant:");
		lName.setFont(new Font("Arial",Font.BOLD,18));
		lName.setBounds(60,120,300,30);
		lName.setForeground(Color.ORANGE);
		add(lName);
		//text-box
		tfName=new JTextField(20);
		tfName.setFont(new Font("Arial",Font.BOLD,16));
		tfName.setForeground(Color.BLACK);
		tfName.setBounds(300,120,420,20);
		add(tfName);
		
		//Father-Name
		//label
		lFName=new JLabel("Father Name:");
		lFName.setBounds(60,160,300,30);
		lFName.setFont(new Font("Arial",Font.BOLD,18));
		lFName.setForeground(Color.BLUE);
		add(lFName);
		//text_box
		tfFName=new JTextField(20);
		tfFName.setFont(new Font("Arial",Font.BOLD,16));
		tfFName.setForeground(Color.BLACK);
		tfFName.setBounds(300,160,420,20);
		add(tfFName);
		
		//Gender
		//Label
		lGender=new JLabel("Gender:");
		lGender.setBounds(60,200,300,30);
		lGender.setFont(new Font("Arial",Font.BOLD,18));
		lGender.setForeground(Color.GREEN);
		add(lGender);
		//radio buttoon1
		rMale=new JRadioButton("Male");
		rMale.setBounds(300,190,100,40);
		rMale.setBackground(Color.BLACK);
		rMale.setForeground(Color.CYAN);
		add(rMale);
		//radio butoon2
		rFemale=new JRadioButton("Female");
		rFemale.setBounds(400,190,100,40);
		rFemale.setBackground(Color.BLACK);
		rFemale.setForeground(Color.CYAN);
		add(rFemale);
		//group the radiobuttons
		ButtonGroup bgGender=new ButtonGroup();
		bgGender.add(rMale);
		bgGender.add(rFemale);
		
		//emailAddress
		//label
		lEmail=new JLabel("E-mail address:");
		lEmail.setBounds(60,240,300,30);
		lEmail.setFont(new Font("Arial",Font.BOLD,18));
		lEmail.setForeground(Color.YELLOW);
		add(lEmail);
		//textField 
		tfEmail=new JTextField(20);
		tfEmail.setFont(new Font("Arial",Font.BOLD,16));
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setBounds(300,240,420,20);
		add(tfEmail);
		
		//Date of Birth
		//label
		lDOB=new JLabel("Date of Birth:");
		lDOB.setBounds(60,280,300,30);
		lDOB.setFont(new Font("Arial",Font.BOLD,18));
		lDOB.setForeground(Color.WHITE);
		add(lDOB);
		//dateChooser
		dateChooser=new JDateChooser();
		dateChooser.setBounds(300,280,300,20);
		add(dateChooser);
		
		//Marritial Status
		//label
		lMaritalStatus=new JLabel("Marritial Status:");
		lMaritalStatus.setBounds(60,320,300,30);
		lMaritalStatus.setFont(new Font("Arial",Font.BOLD,18));
		lMaritalStatus.setForeground(Color.YELLOW);
		add(lMaritalStatus);
		//radio button1
		rMarried=new JRadioButton("Married");
		rMarried.setBounds(300,320,100,40);
		rMarried.setBackground(Color.BLACK);
		rMarried.setForeground(Color.CYAN);
		add(rMarried);
		//radio button2
		rUnMarried=new JRadioButton("UnMarried");
		rUnMarried.setBounds(400,320,100,40);
		rUnMarried.setForeground(Color.CYAN);
		rUnMarried.setBackground(Color.BLACK);
		add(rUnMarried);
		//radio button3 
		rOther=new JRadioButton("Other");
		rOther.setBounds(500,320,100,40);
		rOther.setForeground(Color.CYAN);
		rOther.setBackground(Color.BLACK);
		add(rOther);
		//grouping the Radio buttons
		ButtonGroup MaritalStatus=new ButtonGroup();
		MaritalStatus.add(rMarried);
		MaritalStatus.add(rUnMarried);
		MaritalStatus.add(rOther);
		
		
		//PinCode
		//label
		lPin=new JLabel("PinCode:");
		lPin.setBounds(60,360,300,30);
		lPin.setFont(new Font("Arial",Font.BOLD,18));
		lPin.setForeground(Color.GREEN);
		add(lPin);
		//textField 
		tfPin=new JTextField(20);
		tfPin.setBounds(300,360,420,20);
		tfPin.setFont(new Font("Arial",Font.BOLD,16));
		add(tfPin);
		
		//city 
		//label
		lCity=new JLabel("City:");
		lCity.setFont(new Font("Arial",Font.BOLD,18));
		lCity.setBounds(60,400,300,30);
		lCity.setForeground(Color.BLUE);
		add(lCity);
		//texField 
		tfCity=new JTextField(20);
		tfCity.setBounds(300,400,420,20);
		tfCity.setFont(new Font("Arial",Font.BOLD,16));
		add(tfCity);
		
		//state 
		//label
		lState=new JLabel("State:");
		lState.setBounds(60,440,300,30);
		lState.setForeground(Color.ORANGE);
		lState.setFont(new Font("Arial",Font.BOLD,18));
		add(lState);
		//textField
		tfState=new JTextField(20);
		tfState.setBounds(300,440,420,20);
		tfState.setFont(new Font("Arial",Font.BOLD,16));
		add(tfState);
		
		//address
		lDate=new JLabel("Address:");
		lDate.setBounds(60,480,300,30);
		lDate.setForeground(Color.RED);
		lDate.setFont(new Font("Arial",Font.BOLD,18));
		add(lDate);
		//textField
		tfaddress=new JTextField(20);
		tfaddress.setBounds(300,480,420,40);
		tfaddress.setFont(new Font("Arial",Font.BOLD,16));
		add(tfaddress);
		
		/*//Month
		lMonth=new JLabel("Month:");
		lMonth.setBounds(60,520,300,30);
		lMonth.setForeground(Color.WHITE);
		lMonth.setFont(new Font("Arial",Font.BOLD,18));
		add(lMonth);
		
		//Year 
		lYear=new JLabel("Year:");
		lYear.setBounds(60,560,300,30);
		lYear.setForeground(Color.CYAN);
		lYear.setFont(new Font("Arial",Font.BOLD,18));
		add(lYear);*/
		
		//add the nextButton 
		btnNext=new JButton("Next");
		btnNext.setBackground(Color.CYAN);
		btnNext.setForeground(Color.WHITE);
		btnNext.setBounds(400,550,100,30);
		add(btnNext);
		setVisible(true);

		//Attaching the listeners to this button\
		btnNext.addActionListener(this);
		
		
		
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//fetching the details from the signUp form
		
		System.out.println("Your form is submitted");
		String name=tfName.getText();
		String fName=tfName.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();//classCasting is to be done
		String gender=null;//radio button interaction
		if(rMale.isSelected()) {
			gender="male";
		}
		else if(rFemale.isSelected()){
			gender="Female";
		}
		else {
			gender="";
		}
		String email=tfEmail.getText();
		String maritialStatus=null;
		if(rMarried.isSelected()) {
			maritialStatus="married";
		}
		else if(rUnMarried.isSelected()) {
			maritialStatus="unmarried";
		}
		else if(rOther.isSelected()) {
			maritialStatus="Other";
		}
		String address=tfaddress.getText();
		String pinCode=tfPin.getText();
		String city=tfCity.getText();
		String state=tfState.getText();
		
		try {
			if(tfName.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Please Enter your name");
			}
			else {
				//creating the object for driver class 
				ConnectionFactory cf=new ConnectionFactory();
				//writing a Query
				String query="insert into signUpDetails values('"+ number+"','"+name+"','"+fName+"','"+gender+"','"+email+"','"+dob+"','"+maritialStatus+"','"+pinCode+"','"+address+"','"+city+"','"+state+"');";
				cf.stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Congrates your form is submitted");
				new SignUpForm2(number).setVisible(true);
				setVisible(false);
			}
		}
		catch(Exception ae) {
			ae.printStackTrace();
		}
		
		
	}

}
