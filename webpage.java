import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.*;
//import java.util.Arrays;

class portal extends Frame {
    String name,email,blood,gender,dep,stay,caste,relegion;
    String fname,mname,gname;
    String group,address,dob;
    String stno,fno,mno,gno,aadhaar,mark;
    int count=0;
    portal() {

        Label l0 = new Label("Student Detail Form");
        l0.setBounds(550, 50, 150, 25);

        Label l1 = new Label("Student Name *");
        l1.setBounds(200, 90, 90, 25);
        TextField t1 = new TextField();
        t1.setBounds(300, 90, 150, 25);


        Label l2 = new Label("Date of Birth * ");
        l2.setBounds(200, 120, 90, 25);
        TextField t2 = new TextField();
        t2.setBounds(300, 120, 150, 25);
//        String str=t2.getText();
//        char ch= str.charAt(0);
//        if(Character.isAlphabetic(ch))
//        {
//            t1.setText("invalid input");
//        }


        Label l3 = new Label("E-Mail *");
        l3.setBounds(200, 150, 90, 25);
        TextField t3 = new TextField();
        t3.setBounds(300, 150, 150, 25);


        Label l4 = new Label("Contact no *");
        l4.setBounds(200, 180, 100, 25);
        TextField t4 = new TextField();
        t4.setBounds(300, 180, 150, 25);

        Label l5 = new Label("Blood Group *");
        l5.setBounds(200, 210, 90, 25);
        TextField t5 = new TextField();
        t5.setBounds(300, 210, 150, 25);

        CheckboxGroup cg = new CheckboxGroup();
        Label l6 = new Label("Gender *");
        l6.setBounds(200, 240, 90, 25);
        Checkbox c1 = new Checkbox("Male",cg,false);
        c1.setBounds(300, 240, 90, 25);
        Checkbox c2 = new Checkbox("Female",cg,false);
        c2.setBounds(400, 240, 90, 25);
        Checkbox c3 = new Checkbox("Others",cg,false);
        c3.setBounds(500, 240, 90, 25);
        add(c1);add(c2);add(c3);


        Label l7 = new Label("Department *");
        l7.setBounds(200, 270, 90, 25);
        Choice C = new Choice();
        C.setBounds(300, 270, 90, 25);
        add(C);
        C.add("CSE");C.add("IT");C.add("MECH");C.add("ECE");C.add("EEE");C.add("CIVIL");C.add("AIDS");C.add("CHEM");


        CheckboxGroup cgc = new CheckboxGroup();
        Label l8 = new Label("Stay *");
        l8.setBounds(200, 300, 90, 25);
        Checkbox c4 = new Checkbox("Hosteler",cgc,false);
        c4.setBounds(300, 300, 90, 25);
        Checkbox c5 = new Checkbox("Day Scholar",cgc,false);
        c5.setBounds(400, 300, 90, 25);
        add(c4);add(c5);


        Label l9 = new Label("Aadhaar no *");
        l9.setBounds(200, 330, 90, 25);
        TextField t6 = new TextField();
        t6.setBounds(300, 330, 150, 25);


        Label l10 = new Label("Caste *");
        l10.setBounds(200, 360, 90, 25);
        TextField t7 = new TextField();
        t7.setBounds(300, 360, 150, 25);


        Label l11 = new Label("Religion *");
        l11.setBounds(200, 390, 90, 25);
        TextField t8 = new TextField();
        t8.setBounds(300, 390, 150, 25);


        Label l12 = new Label("Father Name *");
        l12.setBounds(200, 420, 90, 25);
        TextField t9 = new TextField();
        t9.setBounds(300, 420, 150, 25);


        Label l13 = new Label("Contact no *");
        l13.setBounds(200, 450, 90, 25);
        TextField t10 = new TextField();
        t10.setBounds(300, 450, 150, 25);


        Label l14 = new Label("Occupation *");
        l14.setBounds(200, 480, 90, 25);
        TextField t11 = new TextField();
        t11.setBounds(300, 480, 150, 25);

        Label l15 = new Label("Mother Name *");
        l15.setBounds(200, 510, 90, 25);
        TextField t12 = new TextField();
        t12.setBounds(300, 510, 150, 25);


        Label l16 = new Label("Contact no *");
        l16.setBounds(200, 540, 90, 25);
        TextField t13 = new TextField();
        t13.setBounds(300, 540, 150, 25);


        Label l17 = new Label("Occupation *");
        l17.setBounds(200, 570, 90, 25);
        TextField t14 = new TextField();
        t14.setBounds(300, 570, 150, 25);

        Label l18 = new Label("Guardian Name ");
        l18.setBounds(200, 600, 90, 25);
        TextField t15 = new TextField();
        t15.setBounds(300, 600, 150, 25);


        Label l19 = new Label("Guardian no ");
        l19.setBounds(200, 630, 100, 25);
        TextField t16 = new TextField();
        t16.setBounds(300, 630, 150, 25);

        Label l20 = new Label("School name *");
        l20.setBounds(620, 90, 90, 25);
        TextField t17 = new TextField();
        t17.setBounds(720, 90, 150, 25);

        CheckboxGroup cgc1 = new CheckboxGroup();
        Label l21 = new Label("12th Group *");
        l21.setBounds(620, 120, 90, 25);
        Checkbox c6 = new Checkbox("Bio-Maths",cgc1,false);
        c6.setBounds(720, 120, 90, 25);
        Checkbox c7 = new Checkbox("Math-Com",cgc1,false);
        c7.setBounds(820, 120, 90, 25);
        add(c6);add(c7);

        Label l22 = new Label("12th Mark *");
        l22.setBounds(620, 150, 90, 25);
        TextField t18 = new TextField();
        t18.setBounds(720, 150, 150, 25);

        Label l23 = new Label("Percentage *");
        l23.setBounds(620, 180, 90, 25);
        TextField t19 = new TextField();
        t19.setBounds(720, 180, 150, 25);

        Label l24 = new Label("Address *");
        l24.setBounds(620, 210, 90, 25);
        TextArea t20 = new TextArea();
        t20.setBounds(720, 210, 500, 200);

        add(l0);add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(l10);add(l11);add(l12);
        add(l13);add(l14);add(l15);add(l16);add(l17);add(l18);add(l19);add(l20);add(l21);add(l22);add(l23);add(l24);
        add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);add(t8);add(t9);add(t10);add(t11);
        add(t12);add(t13);add(t14);add(t15);add(t16);add(t17);add(t18);add(t19);add(t20);

        Button b1 = new Button("Submit");
        b1.setBounds(690, 510, 90, 25);
        Button b2 = new Button("View Student Details");
        b2.setBounds(638, 540, 200, 25);
        add(b1);add(b2);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //pint p =
                new pint();
                //p.repaint();
                setVisible(false);
                webpage w = new webpage();
                name=t1.getText();
                dob=t2.getText();
                email=t3.getText();
                stno=t4.getText();
                blood=t5.getText();
                dep=C.getSelectedItem();
                aadhaar=t6.getText();
                caste=t7.getText();
                relegion=t8.getText();
                fname=t9.getText();
                fno=t10.getText();
                mname=t12.getText();
                mno=t13.getText();
                gname=t15.getText();
                gno=t16.getText();
                mark=t18.getText();
                address=t20.getText();
                if(cg.getSelectedCheckbox()!=null)
                {
                    gender=cg.getSelectedCheckbox().getLabel();
                }
                else
                {
                    gender="";
                }
                if(cgc.getSelectedCheckbox()!=null)
                {
                    stay=cgc.getSelectedCheckbox().getLabel();
                }
                else
                {
                    stay="";
                }
                if(cgc1.getSelectedCheckbox()!=null)
                {
                    group=cgc1.getSelectedCheckbox().getLabel();
                }
                else
                {
                    group="";
                }

                try {
                    w.sqldatabase(name,dob,email,stno,blood,gender,dep,stay,aadhaar,caste,relegion,fname,fno,mname,mno,gname,gno,group,mark,address);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //count++;
                //view v =new view(count);
                webpage web = new webpage();
                try {
                    web.view();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                setVisible(false);
            }
        });

        setTitle("Form");
        setBackground(Color.LIGHT_GRAY);
        setSize(2000, 2000);
        setLayout(null);
        setVisible(true);
    }
}
class pint extends Frame {
    pint()
    {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Label l09 = new Label("You Have Been Registered Successfully");
        l09.setBounds(500,300,300,60);
        add(l09);
        setTitle("Form Closed");
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setSize(2000,2000);
        setVisible(true);
    }
}
/*class view extends Frame
{
    view(int count)
    {
        try
        {
            Label L1 = new Label("Student Name");
            L1.setBounds(30, 90, 90, 25);

            Label L2 = new Label("Date of Birth  ");
            L2.setBounds(30, 120, 90, 25);

            Label L3 = new Label("E-Mail ");
            L3.setBounds(30, 150, 90, 25);

            Label L4 = new Label("Contact no ");
            L4.setBounds(30, 180, 100, 25);

            Label L5 = new Label("Blood Group ");
            L5.setBounds(30, 210, 90, 25);

            Label L6 = new Label("Gender ");
            L6.setBounds(30, 240, 90, 25);

            Label L7 = new Label("Department ");
            L7.setBounds(30, 270, 90, 25);

            Label L8 = new Label("Stay ");
            L8.setBounds(30, 300, 90, 25);

            Label L9 = new Label("Aadhaar no ");
            L9.setBounds(30, 330, 90, 25);

            Label L10 = new Label("Caste ");
            L10.setBounds(30, 360, 90, 25);

            Label L11 = new Label("Religion ");
            L11.setBounds(30, 390, 90, 25);

            Label L12 = new Label("Father Name ");
            L12.setBounds(30, 420, 90, 25);

            Label L13 = new Label("Contact no ");
            L13.setBounds(30, 450, 90, 25);

            Label L14 = new Label("Mother Name ");
            L14.setBounds(30, 480, 90, 25);

            Label L15 = new Label("Contact no ");
            L15.setBounds(30, 510, 90, 25);

            Label L16 = new Label("Guardian Name ");
            L16.setBounds(30, 540, 90, 25);

            Label L17 = new Label("Guardian no ");
            L17.setBounds(30, 570, 100, 25);

            Label L18= new Label("12th Group ");
            L18.setBounds(30, 600, 90, 25);

            Label L19 = new Label("12th Mark ");
            L19.setBounds(30, 630, 90, 25);

            Label L20 = new Label("Address ");
            L20.setBounds(30, 660, 90, 25);

            add(L1);add(L2);add(L3);add(L4);add(L5);add(L6);add(L7);add(L8);add(L9);add(L10);
            add(L11);add(L12);add(L13);add(L14);add(L15);add(L16);add(L17);add(L18);add(L19);add(L20);

            setBackground(Color.LIGHT_GRAY);
            setSize(2000,2000);
            setLayout(null);
            setVisible(true);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

//            String url = "jdbc:mysql://localhost:3306/sri";
//            String uname = "root";
//            String password = "srikannan";
//            String query1 = "SELECT name FROM Student1 ";//ORDER BY studentname";
//            Connection con = DriverManager.getConnection(url, uname, password);
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(query1);
//            System.out.println(rs.getString(1));
//            String[] nam=new String[10];
//            int x=150;
//            while(rs.next())
//            {
//
//                System.out.println("Name :"+ rs.getString(1));
//                Label l1 = new Label(rs.getString(1));
//                l1.setBounds(x,90,90,25);
//                add(l1);
//                x+=100;
//            }
//            for(int i=0;i<count;i++)
//            {
//                System.out.println(nam[i]);
//            }
//            int x=150;
//            for(int i=0;i<10;i++)
//            {
//                Label l1=new Label(nam[i]);
//                l1.setBounds(x,90,90,25);
//                add(l1);
//                x+=100;
//            }
            //Label ll1= new Label(rs.getString(1));
            //ll1.setBounds(150,90,90,25);
            //add(ll1);


        }
        catch(Exception e)
        {}
    }
}*/
class webpage
{
    public void sqldatabase(String name,String dob,String email,String stno,String blood,String gender,String dep,String stay,
                                String aadhaar,String caste,String relegion,String fname,String fno,String mname,String mno,
                                String gname,String gno,String group,String mark,String address) throws Exception
    {
        String url="";// Jdbc:mysql://localhost:3306/location
        String uname="root";
        String password="";  //mysql pass
        String query="INSERT INTO Student1 VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

        Connection con = DriverManager.getConnection(url,uname,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1,name);
        pst.setString(2,dob);
        pst.setString(3,email);
        pst.setString(4,stno);
        pst.setString(5,blood);
        pst.setString(6,gender);
        pst.setString(7,dep);
        pst.setString(8,stay);
        pst.setString(9,aadhaar);
        pst.setString(10,caste);
        pst.setString(11,relegion);
        pst.setString(12,fname);
        pst.setString(13,fno);
        pst.setString(14,mname);
        pst.setString(15,mno);
        pst.setString(16,gname);
        pst.setString(17,gno);
        pst.setString(18,group);
        pst.setString(19,mark);
        pst.setString(20,address);

        int rows = pst.executeUpdate();
        System.out.println(rows);

        con.close();
    }
    public void view() throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/sri";
        String uname = "root";
        String password = "srikannan";
        String query1 = "SELECT * FROM Student1 ";//ORDER BY studentname";
        Connection con = DriverManager.getConnection(url, uname, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);

        while(rs.next())
        {
            System.out.println("Name         :"+ rs.getString(1));
            System.out.println("DOB          :"+ rs.getString(2));
            System.out.println("E-Mail       :"+ rs.getString(3));
            System.out.println("Mobile num   :"+ rs.getString(4));
            System.out.println("BloodGroup   :"+ rs.getString(5));
            System.out.println("Gender       :"+ rs.getString(6));
            System.out.println("Department   :"+ rs.getString(7));
            System.out.println("Stay         :"+ rs.getString(8));
            System.out.println("Aadhaar num  :"+ rs.getString(9));
            System.out.println("Caste        :"+ rs.getString(10));
            System.out.println("Religion     :"+ rs.getString(11));
            System.out.println("Father name  :"+ rs.getString(12));
            System.out.println("Mobile num   :"+ rs.getString(13));
            System.out.println("Mother name  :"+ rs.getString(14));
            System.out.println("Mobile num   :"+ rs.getString(15));
            System.out.println("Guardian name:"+ rs.getString(16));
            System.out.println("Guardian num :"+ rs.getString(17));
            System.out.println("Group        :"+ rs.getString(18));
            System.out.println("Mark         :"+ rs.getString(19));
            System.out.println("Address      :"+ rs.getString(20));

        }
    }

    public static void main(String[] args)
    {
        new portal();
    }
}
