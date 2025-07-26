package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUpForm2 extends JFrame implements ActionListener{
	JLabel  lTitle, lReligion,lCategory,lIncome,lEdQualification,lOcc,lPAN,lAdhar,lSen_Cit,lExAcc;
	JComboBox jcbreligion,jcbcategory,jcbincome,jcbEd,jcbsal;
	JTextField tfPAN,tfAdhar;
	JRadioButton jrd1citizen,jrd2citizen,jrd3Account,jrd4Account;
	String formNo="";
	//constructor for Designing the form2 
	public SignUpForm2(String formNo){
		this.formNo=formNo;
		System.out.println(this.formNo);
		//Frame Designing
		setTitle("New Account Application Form");
		setLayout(null);
		setSize(800,800);
		setLocation(250,50);
		getContentPane().setBackground(Color.BLACK);
	
		
		//Form Details 
		//label--title
		lTitle=new JLabel("Addition Details of the Accountant");
		lTitle.setBounds(130,25,530,40);
		lTitle.setFont(new Font("Arial",Font.BOLD,30));
		lTitle.setForeground(Color.BLUE);
		add(lTitle);
		
		//label--Religion 
		lReligion=new JLabel("Religion:");
		lReligion.setBounds(70,100,300,30);
		lReligion.setFont(new Font("Tahoma",Font.BOLD,18));
		lReligion.setForeground(Color.ORANGE);
		add(lReligion);
		//drop-down box--religion 
		String religion1[]= {"Hindu","Muslim","Sikh","Christian","Other"};
		jcbreligion=new JComboBox(religion1);
		jcbreligion.setBounds(300,100,300,30);
		jcbreligion.setFont(new Font("Arial",Font.BOLD,16));
		jcbreligion.setBackground(Color.BLACK);
		jcbreligion.setForeground(Color.CYAN);
		add(jcbreligion);
				
		//label--Category 
		lCategory=new JLabel("Category:");
		lCategory.setBounds(70,150,300,30);
		lCategory.setFont(new Font("Tahoma",Font.BOLD,18));
		lCategory.setForeground(Color.BLUE);
		lCategory.setForeground(Color.GREEN);
		add(lCategory);
		//drop-down box---category 
		String categories[]= {"General","OBC","SC","ST","Other"};
		jcbcategory=new JComboBox(categories);
		jcbcategory.setBounds(300,150,300,30);
		jcbcategory.setFont(new Font("Tahoma",Font.BOLD,16));
		jcbcategory.setBackground(Color.BLACK);
		jcbcategory.setForeground(Color.CYAN);
		add(jcbcategory);
		
		
		//label---Income
		lIncome=new JLabel("Income:");
		lIncome.setBounds(70,200,300,30);
		lIncome.setFont(new Font("Tahoma",Font.BOLD,18));
		lIncome.setForeground(Color.YELLOW);
		add(lIncome);
		//JcomboBox--income
		String income[]= {"Null","<1,50,000>","<2,50,000","<5,00,000",">5,00,000"};
		jcbincome=new JComboBox(income);
		jcbincome.setBounds(300,200,300,30);
		jcbincome.setFont(new Font("Tahoma",Font.BOLD,16));
		jcbincome.setForeground(Color.CYAN);
		jcbincome.setBackground(Color.BLACK);
		add(jcbincome);
		
		
		//label--EducationQualification
		lEdQualification=new JLabel("Education Qualification:");
		lEdQualification.setBounds(70,250,500,30);
		lEdQualification.setFont(new Font("Tahoma",Font.BOLD,18));
		lEdQualification.setForeground(Color.WHITE);
		add(lEdQualification);
		//JcomboBox--Education
		String Educational[]= {"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
		jcbEd=new JComboBox(Educational);
		jcbEd.setBounds(300,250,300,30);
		jcbEd.setFont(new Font("Tahoma",Font.BOLD,16));
		jcbEd.setForeground(Color.black.CYAN);
		jcbEd.setBackground(Color.BLACK);
		add(jcbEd);
		
		
		//label--Occupation 
		lOcc=new JLabel("Occupation:");
		lOcc.setBounds(70,300,300,30);
		lOcc.setFont(new Font("Tahoma",Font.BOLD,18));
		lOcc.setForeground(Color.YELLOW);
		add(lOcc);
		//JcomboBox--Occupation
		String occupation[]= {"Self-Employed","Business","Student","Retried","Others"};
		jcbsal=new JComboBox(occupation);
		jcbsal.setBounds(300,300,300,30);
		jcbsal.setFont(new Font("Tahoma",Font.BOLD,16));
		jcbsal.setBackground(Color.BLACK);
		jcbsal.setForeground(Color.CYAN);
		add(jcbsal);
		
		
		//label--PAN Number 
		lPAN=new JLabel("PAN Number:");
		lPAN.setBounds(70,350,300,30);
		lPAN.setFont(new Font("Tahoma",Font.BOLD,18));
		lPAN.setForeground(Color.GREEN);
		add(lPAN);
		//textfield--PAN
		tfPAN=new JTextField(20);
		tfPAN.setBounds(300,350,300,30);
		tfPAN.setBackground(Color.BLACK);
		tfPAN.setForeground(Color.CYAN);
		tfPAN.setFont(new Font("Tahoma",Font.BOLD,16));
		add(tfPAN);
		
		//label--Adhar Number 
		lAdhar=new JLabel("Adhar NUmber:");
		lAdhar.setBounds(70,400,300,30);
		lAdhar.setFont(new Font("Tahoma",Font.BOLD,18));
		lAdhar.setForeground(Color.BLUE);
		add(lAdhar);
		//textField--Adhar Number
		tfAdhar=new JTextField(20);
		tfAdhar.setBounds(300,400,300,30);
		tfAdhar.setBackground(Color.BLACK);
		tfAdhar.setForeground(Color.CYAN);
		tfAdhar.setFont(new Font("Tahoma",Font.BOLD,16));
		add(tfAdhar);
		
		
		//label--Senior Citizen 
		lSen_Cit=new JLabel("Senior Citizen:");
		lSen_Cit.setBounds(70,450,300,30);
		lSen_Cit.setFont(new Font("Tahoma",Font.BOLD,18));
		lSen_Cit.setForeground(Color.ORANGE);
		add(lSen_Cit);
		//fixing the radio button--yes 
		jrd1citizen=new JRadioButton("Yes");
		jrd1citizen.setBounds(300,450,100,40);
		jrd1citizen.setBackground(Color.BLACK);
		jrd1citizen.setForeground(Color.CYAN);
		jrd1citizen.setFont(new Font("Tahoma",Font.BOLD,16));
		add(jrd1citizen);
		//radio button--No
		jrd2citizen=new JRadioButton("No");
		jrd2citizen.setBounds(450,450,100,40);
		jrd2citizen.setFont(new Font("Tahoma",Font.BOLD,16));
		jrd2citizen.setBackground(Color.BLACK);
		jrd2citizen.setForeground(Color.CYAN);
		add(jrd2citizen);
		//rradiobutton--interaction
		ButtonGroup btngroup=new ButtonGroup();
		btngroup.add(jrd1citizen);
		btngroup.add(jrd2citizen);
		
		//label--ExistingAccount 
		lExAcc=new JLabel("Existing Account:");
		lExAcc.setBounds(70,500,300,30);
		lExAcc.setFont(new Font("Tahoma",Font.BOLD,18));
		lExAcc.setForeground(Color.CYAN);
		add(lExAcc);
		//radiobutton--yes
		jrd3Account=new JRadioButton("Yes");
		jrd3Account.setBounds(300,500,100,40);
		jrd3Account.setBackground(Color.BLACK);
		jrd3Account.setForeground(Color.CYAN);
		jrd3Account.setFont(new Font("Tahoma",Font.BOLD,16));
		add(jrd3Account);
		//radiobutton--No
		jrd4Account=new JRadioButton("No");
		jrd4Account.setBounds(450,500,100,40);
		jrd4Account.setBackground(Color.BLACK);
		jrd4Account.setForeground(Color.CYAN);
		jrd4Account.setFont(new Font("Tahoma",Font.BOLD,16));
		add(jrd4Account);
		//button--interaction 
		ButtonGroup btngroup1=new ButtonGroup();
		btngroup1.add(jrd3Account);
		btngroup1.add(jrd4Account);
		//button 
		JButton btn1=new JButton("Next");
		btn1.setBounds(350,550,100,30);
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.ORANGE);
		add(btn1);
		setVisible(true);
		btn1.addActionListener(this);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String religion;
		String category;
		String income;
		String edQualifications;
		String occupation;
		String pan;
		String adhar;
		String seCit="";
		String exstAcc="";
		
		religion=(String)jcbreligion.getSelectedItem();
		category=(String)jcbcategory.getSelectedItem();
		income=(String)jcbincome.getSelectedItem();
		edQualifications=(String)jcbEd.getSelectedItem();
		occupation=(String)jcbsal.getSelectedItem();
		pan=(String)tfPAN.getText();
		adhar=(String)tfAdhar.getText();
		if(jrd1citizen.isSelected()) {
			seCit="Yes";
		}
		else if(jrd2citizen.isSelected()) {
			seCit="No";
		}
		
		if(jrd3Account.isSelected()) {
			exstAcc="Yes";
		}
		else if(jrd4Account.isSelected()) {
			exstAcc="No";
		}
	
		//writing the query 
		try {
			ConnectionFactory details2=new ConnectionFactory();
			String query="insert into signUpDetails2 values('"+formNo+"','"+religion+"','"+category+"','"+income+"','"+edQualifications+"','"+occupation+"','"+pan+"','"+adhar+"','"+seCit+"','"+exstAcc+"');";
			details2.stmt.executeUpdate(query);
			System.out.println("your query is successfully executed");
			//navigate to the signUpForm3
			new SignUpForm3(formNo).setVisible(true);
			setVisible(false);
							
			
		}
		catch(Exception ae) {
			ae.printStackTrace();
		}
		
	}
	
}
