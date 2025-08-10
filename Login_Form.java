import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login_Form extends JFrame implements ActionListener
{
    JLabel lb1,lb2,lb3,lb4,lbtitle,lbusername,lbpassword;
    JTextField tfusername;
    JPasswordField tfpassword;
    JButton butlogin,butcancel;  
    public Login_Form() 
     {
        setSize(1380,900);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.PINK);
        Font f1 = new Font("Arial Black",Font.BOLD,26);
        Font f2 = new Font("Arial ",Font.PLAIN,22);
        Font f3 = new Font("Arial Black",Font.PLAIN,20);
        lb1 = new JLabel("A Mini Project");
        lb2 = new JLabel("Students Campus Placement Information System");
        lb3 = new JLabel("Developed for");
        lb4 = new JLabel("TNP Section, P.E.S Modern College of engineering");
        
        lbtitle = new JLabel("Enter your username and Password");
        lbusername = new JLabel("Username");
        lbpassword = new JLabel("Password");
        tfusername = new JTextField();
        tfpassword = new JPasswordField("");
        butlogin = new JButton("Login");
        butcancel = new JButton("Cancel");
        lb1.setFont(f3);
        lb2.setFont(f1);
        lb3.setFont(f3);
        lb4.setFont(f2);
        lbtitle.setFont(f3);
        lbusername.setFont(f3);
        tfusername.setFont(f3);
        lbpassword.setFont(f3);
        tfpassword.setFont(f3);
        butlogin.setFont(f3);
        butcancel.setFont(f3);
        butlogin.addActionListener(this);
        butcancel.addActionListener(this);
        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lbtitle);
        add(lbusername);
        add(tfusername);
        add(lbpassword);
        add(tfpassword);
        add(butlogin);
        add(butcancel);
        
        lb1.setBounds(550,50,1200,20);
        lb2.setBounds(300,90,1200,35);
        lb3.setBounds(550,130,1200,25);
        lb4.setBounds(400,170,1200,25);
        lbtitle.setBounds(800,470,450,25);
        lbusername.setBounds(850,535,120,25);
        tfusername.setBounds(1000,535,200,25);
        lbpassword.setBounds(850,575,125,25);
        tfpassword.setBounds(1000,575,200,25);
        butlogin.setBounds(850,615,120,20);
        butcancel.setBounds(1000,615,120,20);
        ImageIcon ii=new ImageIcon("Image_Login.jpeg");
        JLabel lbimage=new JLabel(ii);
        add(lbimage); 
         lbimage.setBounds(50,250,750,450);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == butlogin)
        { 
            
           if(tfusername.getText().equals("Preksha") || tfusername.getText().equals("Sitara") && tfpassword.getText().equals("Pesmodern"))
           {
            JOptionPane.showMessageDialog(this,"You are authorised user,please continue the project");
            new Menu_Project();
            dispose();
           }
           else{
            JOptionPane.showMessageDialog(this,"You are unauthorised user");
           }
        }
        else if(ae.getSource()== butcancel){
            dispose();
        }
    }
    
    public static void main(String args[]){
         Login_Form obj = new Login_Form();
    }
}