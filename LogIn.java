package atm;

//import atm.SighUp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static atm.UserCreation.map;

public class LogIn extends JFrame {
    private Double accountNumber;
    private int pinCode;

    public LogIn() throws HeadlessException {
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JLabel accountNumber = new JLabel("ACCOUNT NUMBER");
        JLabel pinCode = new JLabel("PIN CODE");
        JTextField t1 = new JTextField(100);
        JTextField t2 = new JTextField(100);
        accountNumber.setBounds(100,100,200,60);
        pinCode.setBounds(100,200,200,60);
        t1.setBounds(250,120,60,30);
        t2.setBounds(250,220,60,30);
        JButton logIn = new JButton("LogIn");
        logIn.setBounds(300,300,200,70);
        JButton signUp = new JButton("SignUP");
        signUp.setBounds(300,400,100,70);
        add(accountNumber);
        add(signUp);
        add(pinCode);
        add(t1);
        add(t2);
        add(logIn);
//       final int i=0;
//       JProgressBar p = new JProgressBar(0,5);
//       add(p);
//       Timer t = new Timer(100,new );
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new SignUp();
                dispose();
            }
        });

        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ac =  Integer.parseInt(t1.getText());
                String pinCode = t2.getText();
                if (ac==0|| pinCode==null){
                    System.out.println("Enter Account Number and PinCode");
                }else{
                  String check =(String) map.get(ac);
                  if (check==null){
                      System.out.println("Enter valid Account Number or Create a new Account");
                  } else if (check!=pinCode) {
                      System.out.println("Enter valid PinCode");
                  }else{
                      new MainMenu(ac);
                      dispose();
                  }
                }
            }
        });
    }
}
