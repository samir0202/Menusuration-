import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mens extends JFrame implements ActionListener
{
JLabel lb1=new JLabel("MENSURATION");
JButton btn9=new JButton("Date and Time");
JTextField tf1=new JTextField(10);
JTextField tf2=new JTextField(10);
JButton btn1=new JButton("Circle");
JButton btn2=new JButton("Cone");
JButton btn3=new JButton("Cylinder");
JButton btn4=new JButton("Sphera");
JButton btn5=new JButton("Square");
JButton btn6=new JButton("Cube");
JButton btn7=new JButton("Rectangle");
JButton btn8=new JButton("CLEAR");
Container cn;
Mens()
{
super("Area and Volume in Menusuration");
cn=getContentPane();
lb1.setFont(new Font("Forte",Font.BOLD,23));
lb1.setForeground(Color.red);
tf1.setForeground(Color.black);
tf1.setBackground(Color.cyan);
tf2.setBackground(Color.pink);
tf2.setForeground(Color.blue);
btn8.setForeground(Color.red);
tf1.setFont(new Font("arial",Font.BOLD,20));
tf2.setFont(new Font("arial",Font.BOLD,20));
setLayout(new GridLayout(6,2,10,10));
add(lb1); add(btn9);
add(tf1); add(tf2);
add(btn1); add(btn2);
add(btn3); add(btn4);
add(btn5); add(btn6);
add(btn7); add(btn8);
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);
btn5.addActionListener(this);
btn6.addActionListener(this);
btn7.addActionListener(this);
btn8.addActionListener(this);
btn9.addActionListener(this);
setSize(400,350);
setResizable(false);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}});
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn1)
{
String s1=JOptionPane.showInputDialog(null,"Enter Redious :");
double r=Float.parseFloat(s1);
double a=3.14*r*r;
tf1.setText("Area of Circle=");
tf2.setText(String.valueOf(a));
}
else if(e.getSource()==btn2)
{
String s1=JOptionPane.showInputDialog(null,"Enter Redious :");
String s2=JOptionPane.showInputDialog(null,"Enter Hight :");
double r=Float.parseFloat(s1);
double h=Float.parseFloat(s2);
double a=3.14*1/3*r*r*h;
tf1.setText("Area of Cone=");
tf2.setText(String.valueOf(a));
}
else if(e.getSource()==btn3)
{
String s1=JOptionPane.showInputDialog(null,"Enter Redious :");
String s2=JOptionPane.showInputDialog(null,"Enter Hight :");
double r=Float.parseFloat(s1);
double h=Float.parseFloat(s2);
double a=3.14*r*r*h;
tf1.setText("Area of Cylinder=");
tf2.setText(String.valueOf(a));
}
else if(e.getSource()==btn4)
{
String s1=JOptionPane.showInputDialog(null,"Enter Redious :");
double r=Float.parseFloat(s1);
double a=3.14*4/3*r*r*r;
tf1.setText("Area of Shepra=");
tf2.setText(String.valueOf(a));
}
else if(e.getSource()==btn5)
{
String s1=JOptionPane.showInputDialog(null,"Enter Side :");
double r=Float.parseFloat(s1);
double a=r*r;
tf1.setText("Area of Square=");
tf2.setText(String.valueOf(a));
}
else if(e.getSource()==btn6)
{
String s1=JOptionPane.showInputDialog(null,"Enter Side :");
double r=Float.parseFloat(s1);
double a=r*r*r;
tf1.setText("Area of Qube=");
tf2.setText(String.valueOf(a));
}
else if(e.getSource()==btn7)
{
String s1=JOptionPane.showInputDialog(null,"Enter Length :");
String s2=JOptionPane.showInputDialog(null,"Enter Breadth :");
double l=Float.parseFloat(s1);
double b=Float.parseFloat(s2);
double a=l*b;
tf1.setText("Area of Rectangle=");
tf2.setText(String.valueOf(a));
}
else if(e.getSource()==btn8)
{
tf1.setText("");
tf2.setText("");
}
else if(e.getSource()==btn9)
{
new DigitalWatch2();
}
}
public static void main(String k[])
{
new Mens();
}
}