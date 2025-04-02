package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
     
    SignupTwo(String formno){                   
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Raleway", Font.BOLD, 20));
        Religion.setBounds(100,140,100,30);
        add(Religion);
        
        String valReligion[] = {"Hindu]", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel Category = new JLabel("Category:");
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100,190,200,30);
        add(Category);
        
        String valcategory[] = {"General","OBC","SC","ST","OTHER"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190,400,30);
        category.setBackground(Color.WHITE);
        add(category );
        
        JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100,240,200,30);
        add(Income);
        
        String incomecategory[] = {"Null","<1,50,000","< 2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
       
        JLabel Educationa = new JLabel("Educational");
        Educationa.setFont(new Font("Raleway", Font.BOLD, 20));
        Educationa.setBounds(100,290,200,30);
        add(Educationa);
       
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
        education= new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);      
        
        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation.setBounds(100,390,200,30);
        add(Occupation); 
        
        String occupationValues[] = {"Salaried","Self-Employed","Bussiness","Student","Retired"};
        occupation= new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);  
        
        JLabel PanNumber = new JLabel("PAN Number:");
        PanNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        PanNumber.setBounds(100,440,200,30);
        add(PanNumber);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD, 14));
        pan.setBounds(300, 440,400,30);
        add(pan);
        
        JLabel AadharNumber = new JLabel("Aadhar Number:");
        AadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        AadharNumber.setBounds(100,490,200,30);
        add(AadharNumber);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD, 14));
        aadhar.setBounds(300, 490,400,30);
        add(aadhar);
        
        JLabel SeniorCitizen = new JLabel("Senior Citizen:");
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        SeniorCitizen.setBounds(100,540,200,30);
        add(SeniorCitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
 
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
     
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
             
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
 
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }   
    public void actionPerformed(ActionEvent ae)
    {     
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){
            seniorcitizen = "No";
        }
      
        String exisitingaccount = null;
        if(eyes.isSelected()){
            exisitingaccount  = "Yes";
        }else if(eno.isSelected()){
            exisitingaccount  = "No";
        }
     
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"','"+exisitingaccount+"')";
                c.s.executeUpdate(query); 
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }   
    }   
    public static void main(String args[])
    {
        new SignupTwo("");
    }
}
