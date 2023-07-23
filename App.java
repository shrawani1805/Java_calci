import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


class Cal extends JFrame   
{

    Container c;
    JLabel label,img,lab;
    JTextField txt;
    JRadioButton rbon,rboff;
    JButton btnadd,btnsub,btnmul,btndiv,btndec,btnequal,btndelete,btnclear,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnper,btnneg,btnsquare,btnsquareroot;
    double num1=0,num2=0,res=0;
    char operatotr;


    Cal()
    {
   

        c= getContentPane();
        c.setLayout(null);

        

        
        Font f2 = new Font("Arial",Font.BOLD,20);
        Font f3 = new Font("Arial",Font.BOLD,15);

        rbon = new JRadioButton("on");
        Font f = new Font("Arial",Font.BOLD,14);
        rbon.setFont(f);
        rbon.setBounds(105,220,48,30);
        rbon.setBackground(Color.black);
        rbon.setForeground(Color.white);
        c.add(rbon);


        rboff = new JRadioButton("off");
        rboff.setFont(f);
        rboff.setBounds(168,220,48,30);
        rboff.setBackground(Color.black);
        rboff.setForeground(Color.white);
        c.add(rboff);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rbon);
        bg2.add(rboff);

        lab= new JLabel("<html>Shrawani<br>fx-100</html>");
        Font f5 = new Font ("TIMES NEW ROMAN",Font.BOLD,10);
        lab.setBounds(100,30,200,50);
        lab.setFont(f5);
        lab.setForeground(Color.WHITE);
        c.add(lab);


        label= new JLabel();
        label.setBounds(300,35,200,50);
        Font f6= new Font ("TIMES NEW ROMAN",Font.BOLD,20);
        label.setFont(f6);
        c.add(label);


        txt = new JTextField();
        Font f1 = new Font ("TIMES NEW ROMAN",Font.BOLD,30);
        txt.setFont(f1);
        txt.setBounds(110,95,290,65);
        txt.setEditable(false);
        Border border=BorderFactory.createBevelBorder(1);
        txt.setBorder(border);
        txt.setOpaque(true);
        c.add(txt);
        


        btn0=new JButton("0");
        btn0.setFont(f2);
        btn0.setBounds(168,400,48,30);
        btn0.setBackground(Color.black);
        btn0.setForeground(Color.white);
        c.add(btn0);


        btn1=new JButton("1");
        btn1.setFont(f2);
        btn1.setBounds(105,355,48,30);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        c.add(btn1);

        btn2=new JButton("2");
        btn2.setFont(f2);
        btn2.setBounds(168,355,48,30);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        c.add(btn2);

        btn3=new JButton("3");
        btn3.setFont(f2);
        btn3.setBounds(231,355,48,30);
        btn3.setBackground(Color.black);
        btn3.setForeground(Color.white);
        c.add(btn3);

        btn4=new JButton("4");
        btn4.setFont(f2);
        btn4.setBounds(105,310,48,30);
        btn4.setBackground(Color.black);
        btn4.setForeground(Color.white);
        c.add(btn4);

        btn5=new JButton("5");
        btn5.setFont(f2);
        btn5.setBounds(168,310,48,30);
        btn5.setBackground(Color.black);
        btn5.setForeground(Color.white);
        c.add(btn5);

        btn6=new JButton("6");
        btn6.setFont(f2);
        btn6.setBounds(231,310,48,30);
        btn6.setBackground(Color.black);
        btn6.setForeground(Color.white);
        c.add(btn6);

        btn7=new JButton("7");
        btn7.setFont(f2);
        btn7.setBounds(105,265,48,30);
        btn7.setBackground(Color.black);
        btn7.setForeground(Color.white);
        c.add(btn7);

        btn8=new JButton("8");
        btn8.setFont(f2);
        btn8.setBounds(168,265,48,30);
        btn8.setBackground(Color.black);
        btn8.setForeground(Color.white);
        c.add(btn8);

        btn9=new JButton("9");
        btn9.setFont(f2);
        btn9.setBounds(231,265,48,30);
        btn9.setBackground(Color.black);
        btn9.setForeground(Color.white);
        c.add(btn9);

        btnadd=new JButton("+" );
        btnsub=new JButton("-");
        btnmul=new JButton("X");
        btndiv=new JButton("/");
        btndec=new JButton(".");
        btnper=new JButton("%" );
        btnequal=new JButton("=");
        btndelete=new JButton("D");
        btnclear=new JButton("C");
        btnneg=new JButton("(-)");
        btnsquare=new JButton("x\u00B2");
       btnsquareroot=new JButton("\u221A");


         btnadd.setFont(f2);
         btnsub.setFont(f2);
         btnmul.setFont(f2);
         btndiv.setFont(f2);
         btndec.setFont(f2);
         btnper.setFont(f2);
         btnequal.setFont(f2);
         btndelete.setFont(f3);
         btnclear.setFont(f2);
         btnneg.setFont(f3);
         btnsquare.setFont(f3);
         btnsquareroot.setFont(f2);

         btnadd.setBounds(294,220,48,30);
         btnsub.setBounds(294,265,48,30);
         btnmul.setBounds(294,310,48,30);
         btndiv.setBounds(294,355,48,30);
         btnper.setBounds(294,400,48,30);
         btndec.setBounds(357,310,48,30);
         btnequal.setBounds(357,355,50,78);
         btndelete .setBounds(231,400,48,30);
         btnclear.setBounds(105,400,48,30);
         btnneg.setBounds(231,220,48,30);
         btnsquare.setBounds(357,220,48,30);
         btnsquareroot.setBounds(357,265,48,30);

         
         btnequal.setBackground(Color.yellow);
         btnequal.setForeground(Color.black);

         btndec.setBackground(Color.yellow);
         btndec.setForeground(Color.black);

          btnsquare.setBackground(Color.yellow);
         btnsquare.setForeground(Color.black);

         btnsquareroot.setBackground(Color.yellow);
         btnsquareroot.setForeground(Color.black);



         btnper.setBackground(Color.yellow);
         btnper.setForeground(Color.black);


         btndiv.setBackground(Color.yellow);
         btndiv.setForeground(Color.black);

         btnsub.setBackground(Color.yellow);
         btnsub.setForeground(Color.black);

        btnadd.setBackground(Color.yellow);
         btnadd.setForeground(Color.black);

         btnneg.setBackground(Color.yellow);
         btnneg.setForeground(Color.black);

         btnequal.setBackground(Color.yellow);
         btnequal.setForeground(Color.black);

         btnmul.setBackground(Color.yellow);
         btnmul.setForeground(Color.black);

         btnclear.setBackground(Color.red);
         btnclear.setForeground(Color.black);

         btndelete.setBackground(Color.red);
         btndelete.setForeground(Color.black);

      
         c.add(btnadd);
         c.add(btnsub);
         c.add(btnmul);
         c.add(btndiv);
         c.add(btnper);
         c.add(btndec);
         c.add(btnequal);
         c.add(btndelete);
         c.add(btnclear);
         c.add(btnneg);
         c.add(btnsquare);
         c.add(btnsquareroot);

          ActionListener aa = (ae) ->{
            try
            {
            
             num1=Double.parseDouble(txt.getText());
             res=num1*num1;
               if(Double.toString(res).endsWith(".0"))
             {
                txt.setText(Double.toString(res).replace(".0", ""));
             }
             else
             {
             txt.setText(Double.toString(res));
             }
             }
         catch(NumberFormatException e)
         {
            JOptionPane.showConfirmDialog(c, "Enter valid and complte Input");
         }
            };
          btnsquare.addActionListener(aa);
 
          ActionListener aaa = (ae) ->{
            try
            {
             num1=Double.parseDouble(txt.getText());
             if(num1<=0)
             {
              JOptionPane.showConfirmDialog(c, "Enter positive number For square root");
             }
             else
             {
             res = Math.sqrt(num1);
             if(Double.toString(res).endsWith(".0"))
             {
                txt.setText(Double.toString(res).replace(".0", ""));
             }
             else
             {
             txt.setText(Double.toString(res));
             }
            }
             }
         catch(NumberFormatException e)
         {
            JOptionPane.showConfirmDialog(c, "Enter valid and complete Input ");
         }
            
            };
          btnsquareroot.addActionListener(aaa);
 

         ActionListener a = (ae) ->{
            label .setText("");
            txt.setText("");
          };
          btnclear.addActionListener(a);
 
 
          ActionListener a1 = (ae) ->{
              if(txt.getText().equals("0"))
             {
                 return;
             }
             else
             {
                 txt.setText(txt.getText() + "0");
             }
          };
          btn0.addActionListener(a1);
 
         ActionListener a2 = (ae) ->{
             txt.setText(txt.getText() + "1");
          };
          btn1.addActionListener(a2);
 
          ActionListener a3 = (ae) ->{
             txt.setText(txt.getText() + "2");
          };
          btn2.addActionListener(a3);
 
          ActionListener a4 = (ae) ->{
             txt.setText(txt.getText() + "3");
          };
          btn3.addActionListener(a4);
 
          ActionListener a5 = (ae) ->{
             txt.setText(txt.getText() + "4");
          };
          btn4.addActionListener(a5);
 
           ActionListener a6 = (ae) ->{
             txt.setText(txt.getText() + "5");
          };
          btn5.addActionListener(a6);
         
           ActionListener a7 = (ae) ->{
             txt.setText(txt.getText() + "6");
          };
          btn6.addActionListener(a7);
 
           ActionListener a8 = (ae) ->{
             txt.setText(txt.getText() + "7");
          };
          btn7.addActionListener(a8);
 
          ActionListener a9 = (ae) ->{
             txt.setText(txt.getText() + "8");
          };
          btn8.addActionListener(a9);
 
          ActionListener a10 = (ae) ->{
             txt.setText(txt.getText() + "9");
          };
          btn9.addActionListener(a10);
 
          ActionListener adec = (ae) ->{
             txt.setText(txt.getText() + ".");
          };
          btndec.addActionListener(adec);
 
         ActionListener a11 = (ae) ->{
            try
            {
             String str = txt.getText();
             num1=Double.parseDouble(txt.getText());
             operatotr = '+';
             txt.setText("");
             label.setText(str + '+');
             }
         catch(NumberFormatException e)
         {
            JOptionPane.showConfirmDialog(c, "Enter valid and complete Input ");
         }
          };
          btnadd.addActionListener(a11);
 
           ActionListener a12 = (ae) ->{
            try
            {
             String str = txt.getText();
             num1=Double.parseDouble(txt.getText());
             operatotr = '-';
             txt.setText("");
             label.setText(str + '-');
            }
         catch(NumberFormatException e)
         {
            JOptionPane.showConfirmDialog(c, "Enter valid and complete Input ");
         }
          };
          btnsub.addActionListener(a12);
 
           ActionListener a13= (ae) ->{
            try
            {
             String str = txt.getText();
             num1=Double.parseDouble(txt.getText());
             operatotr = '*';
             txt.setText("");
             label.setText(str + '*');
             }
         catch(NumberFormatException e)
         {
            JOptionPane.showConfirmDialog(c, "Enter valid and complete Input ");
         }

          };
          btnmul.addActionListener(a13);
 
          ActionListener a14= (ae) ->{
            try
            {
             String str = txt.getText();
             num1=Double.parseDouble(txt.getText());
             operatotr = '/';
             txt.setText("");
             label.setText(str + '/');
             }
         catch(NumberFormatException e)
         {
            JOptionPane.showConfirmDialog(c, "Enter valid and complete Input");
         }
          };
          btndiv.addActionListener(a14);

          ActionListener a144= (ae) ->{
            try
            {
             String str = txt.getText();
             num1=Double.parseDouble(txt.getText());
             operatotr = '%';
             txt.setText("");
             label.setText(str + '%');
             }
         catch(NumberFormatException e)
         {
            JOptionPane.showConfirmDialog(c, "Enter valid and complete Input ");
         }
          };
          btnper.addActionListener(a144);
 
 
 
           ActionListener a15 = (ae) ->{
            try
            {
             num2=Double.parseDouble(txt.getText());
             switch (operatotr) 
             {
            
                 case'+':
                  res=num1+num2;
                 break;
            
                 case'-':
                 res=num1-num2;
                 break; 
 
                 case'*':
                 res=num1*num2;
                 break; 
 
                 case'/':
                 if(num2==0)
                {
                JOptionPane.showConfirmDialog(c, "Divisor cannot be Zero ");
                }
                else
                {
                 res=num1/num2;
                }
                 break; 

                 case'%':
                  if(num2==0)
                {
                JOptionPane.showConfirmDialog(c, "% cannot be Zero ");
                }
                else
                {
                 res=num1%num2;
                }
                 break;

                 default:
                 break;
                 
             }
               
             if(Double.toString(res).endsWith(".0"))
             {
                txt.setText(Double.toString(res).replace(".0", ""));
             }
             else
             {
             txt.setText(Double.toString(res));
             }
             label.setText("");
             num1=res; 
             }
         
         catch(NumberFormatException e)
         {
            JOptionPane.showConfirmDialog(c, "Enter valid and complete Input ");
         }   
          };
          btnequal.addActionListener(a15);
         
        
            ActionListener a111= (ae) ->{
                txt.setText(txt.getText()+"-");  
          };
          btnneg.addActionListener(a111);
 
 
           ActionListener a16 = (ae) ->{
            enable();
          };
          rbon.addActionListener(a16);
 
          ActionListener a17 = (ae) ->{
            disable();
          };
          rboff.addActionListener(a17);

          ActionListener a18= (ae) ->{
            String str = txt.getText();
            txt.setText("");
            for(int i=0; i<str.length()-1;i++)
            {
                txt.setText(txt.getText()+str.charAt(i));

            } 
          };
          btndelete.addActionListener(a18);
 
 

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("calci.png"));
        Image i2= i1.getImage().getScaledInstance(512,512,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        img = new JLabel(i3);
        img.setBounds(0,0,512,512);
        c.add(img);
        
       
        setIconImage(new ImageIcon("th.JPG").getImage());
        setSize(512,550);
        setLocationRelativeTo(null);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void enable()
    {
        rbon.setEnabled(false);
        rboff.setEnabled(true);
        txt.setEnabled(true);
        btnclear.setEnabled(true);
        btndelete.setEnabled(true);
        btn1.setEnabled(true);
        btn0.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btnadd.setEnabled(true);
        btnsub.setEnabled(true);
        btnmul.setEnabled(true);
        btndiv.setEnabled(true);
        btndec.setEnabled(true);
        btnequal.setEnabled(true);
        btnneg.setEnabled(true);
        btnper.setEnabled(true);
         btnsquare.setEnabled(true);
        btnsquareroot.setEnabled(true);


    }
     public void disable()
    {
        rbon.setEnabled(true);
        rboff.setEnabled(false);
        txt.setEnabled(false);
        btnclear.setEnabled(false);
        btndelete.setEnabled(false);
        btn1.setEnabled(false);
        btn0.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btnadd.setEnabled(false);
        btnsub.setEnabled(false);
        btnmul.setEnabled(false);
        btndiv.setEnabled(false);
        btndec.setEnabled(false);
        btnequal.setEnabled(false);
        btnneg.setEnabled(false);
        btnper.setEnabled(false);
        btnsquare.setEnabled(false);
        btnsquareroot.setEnabled(false);

    }
           
}
class App
{
    public static void main(String args[])
    {
        Cal c = new Cal();
    }
}

