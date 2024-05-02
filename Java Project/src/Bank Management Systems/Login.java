package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextfield;
    private final JTextField cardTextField;
    private final JPasswordField pinTextField;
    JPasswordField pinTextfield;
  
Login(){
   setTitle("Automatic Teller Machine");
   setLayout(null);
   ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("atm login logo/atm login.png"));
   Image i2= i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);
   JLabel label = new JLabel(i3);
   label.setBounds(70, 10, 80, 80);
   add(label);
   
   JLabel text = new JLabel("Welcome to ATM");
   text.setFont(new Font("Osward",Font.BOLD,38));
   text.setBounds(200,40,400,40);
   add(text);
   
   JLabel cardno = new JLabel("Card No:");
   cardno.setFont(new Font("Raleway",Font.BOLD,28));
   cardno.setBounds(80,150,150,30);
   add(cardno);
   
   cardTextField = new JTextField();
   cardTextField.setBounds(300,150,230,30);
   cardTextField.setFont(new Font("Raleway",Font.BOLD,15));
   add(cardTextField);

   JLabel pin = new JLabel("PIN No:");
   pin.setFont(new Font("Raleway",Font.BOLD,28));
   pin.setBounds(80,200,250,60);
   add(pin);
   
   pinTextField=new JPasswordField();
   pinTextField.setBounds(300,220,230,30);
   pinTextField.setFont(new Font("Raleway",Font.BOLD,15));
   add(pinTextField);

   login = new JButton("SIGN IN");
   login.setBounds(300,270,100,30);
   login.setBackground(Color.BLACK);
   login.setForeground(Color.WHITE);
   login.addActionListener(this);
   add(login);
           
   clear = new JButton("CLEAR");
   clear.setBounds(430,270,100,30);
   clear.setBackground(Color.BLACK);
   clear.setForeground(Color.WHITE);
   clear.addActionListener(this);
   add(clear);

   signup = new JButton("SIGN UP");
   signup.setBounds(300,320,230,30);
   signup.setBackground(Color.BLACK);
   signup.setForeground(Color.WHITE);
   signup.addActionListener(this);
   add(signup);
      
   getContentPane().setBackground(Color.white);
   setSize(850,450); 
   setVisible(true);
   setLocation(400,200);
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==clear){
        cardTextField.setText("");
        pinTextField.setText("");
    }else if(ae.getSource()==login){
        
    }else if (ae.getSource()==signup){
        
    }
}
       public static void main(String args[]) {
       Login L1 =new Login();
    }
}
