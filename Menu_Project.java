import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menu_Project extends JFrame implements ActionListener
{
      JMenuBar jmn;
      JMenu menu1,menu2,menu3,menu4;
      JMenuItem mi11,mi12,mi13,mi14,mi21,mi22,mi23,mi24,mi31,mi32,mi33,mi34,mi35,mi36,mi37,mi38,mi39,mi40,mi41;
    public Menu_Project() 
     {
        setSize(1380,900);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        Font f1 = new Font("Arial Black",Font.BOLD,26);
        Font f2 = new Font("Arial ",Font.PLAIN,22);
        Font f3 = new Font("Arial Black",Font.PLAIN,20);
        jmn = new JMenuBar();
        menu1 = new JMenu("Primary Data retrieval Module");
        menu2 = new JMenu("Placement Transaction Data Entry Module");
        menu3 = new JMenu("Online reports menu");
        menu4 = new JMenu("Close the Project");
        mi11 = new JMenuItem("Student Registration for Job Placement ");
        mi12 = new JMenuItem("Registered Students Academic Results data retrieval");
        mi13 = new JMenuItem("Registered Students Certified Courses data retrieval");
        mi14 = new JMenuItem("Job Provider Companies data retrieval");
        mi21 = new JMenuItem("Scheduled Campus Interview's Data entry form");
        mi22 = new JMenuItem("Interviews Appeared Students Data entry form");
        mi23 = new JMenuItem("Interview Rounds Qualified Student's Data entry form");
        mi24 = new JMenuItem("Interview Wise Selected Student's Data entry form");
        mi31 = new JMenuItem("Registered Students Information Report");
        mi32 = new JMenuItem("Students Academic Results Information Report");
        mi33 = new JMenuItem("Student Certified Courses Information Report");
        mi34 = new JMenuItem("Job Provider Companies Information Report");
        mi35 = new JMenuItem("Scheduled Campus Interview's Transaction Report");
        mi36 = new JMenuItem("Company Interviews Appeared Student's Report");
        mi37 = new JMenuItem("Interview Rounds Qualified Student's Transaction Report");
        mi38 = new JMenuItem("Interview/Company Wise Selected Student's Report");
        mi41 = new JMenuItem("Exit");
        mi11.addActionListener(this);
        mi12.addActionListener(this);
        mi13.addActionListener(this);
        mi14.addActionListener(this);
        mi21.addActionListener(this);
        mi22.addActionListener(this);
        mi23.addActionListener(this);
        mi24.addActionListener(this);
        mi31.addActionListener(this);
        mi32.addActionListener(this);
        mi33.addActionListener(this);
        mi34.addActionListener(this);
        mi35.addActionListener(this);
        mi36.addActionListener(this);
        mi37.addActionListener(this);
        mi38.addActionListener(this);
        mi41.addActionListener(this);

        menu1.add(mi11);
        menu1.add(mi12);
        menu1.add(mi13);
        menu1.add(mi14);
        menu2.add(mi21);
        menu2.add(mi22);
        menu2.add(mi23);
        menu2.add(mi24);
        menu3.add(mi31);
        menu3.add(mi32);
        menu3.add(mi33);
        menu3.add(mi34);
        menu3.add(mi35);
        menu3.add(mi36);
        menu3.add(mi37);
        menu3.add(mi38);
        menu4.add(mi41);

        jmn.add(menu1);
        jmn.add(menu2);
        jmn.add(menu3);
        jmn.add(menu4);
        setJMenuBar(jmn);
        
        ImageIcon ii=new ImageIcon("College_Photo1.jpeg");
       JLabel lbimage=new JLabel(ii);
       add(lbimage); 
       lbimage.setBounds(50,50,1300,800);

    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == mi11)
           new Students_Registration_Form();
       else if(ae.getSource() == mi12)
           new Academic_Results_Form();
       else if(ae.getSource() == mi13)
           new Certified_Courses_Form();
       else if(ae.getSource() == mi14)
           new Associated_Companies_Form();
       else if(ae.getSource() == mi21)
           new Scheduled_Interview_DEF();
       else if(ae.getSource() == mi22)
           new Appeared_Students_DEF();
       else if(ae.getSource() == mi23)
           new Interview_Rounds_DEF();
       else if(ae.getSource() == mi24)
           new Selected_Students_DEF();
      else if(ae.getSource() == mi31)
           new Report_Students_Registration();
      else if(ae.getSource() == mi32)
           new Report_Academic_Results();
      else if(ae.getSource() == mi33)
           new Report_Certified_Courses();
      else if(ae.getSource() == mi34)
           new Report_Job_Companies();
      else if(ae.getSource() == mi35)
           new Read_Period_Form(1);
       else if(ae.getSource() == mi36)
           new Read_Period_Form(2);
       else if(ae.getSource() == mi37)
           new Read_Period_Form(3);
       else if(ae.getSource() == mi38)
           new Read_Period_Form(4);
       else if(ae.getSource() == mi41)
       dispose();
    }
    
    public static void main(String args[]){
         Menu_Project obj = new Menu_Project();
    }
}