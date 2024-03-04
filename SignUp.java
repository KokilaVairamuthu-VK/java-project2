package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static atm.UserCreation.isExist;
import static atm.UserCreation.userList;

public class SignUp extends JFrame {
        private JLabel accountNumber,name,fname,address,pinCode,education,occupation,phone,dob;
        private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
        private JButton signUp;

        public SignUp() throws HeadlessException {
            setSize(1000,1000);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setResizable(false);
            JLabel name = new JLabel("NAME");
            JLabel fname = new JLabel("FNAME");
            JLabel accountNumber = new JLabel("ACCOUNT NUMBER");
            JLabel address = new JLabel("ADDRESS");
            JLabel pinCode = new JLabel("PIN CODE");
            JLabel education = new JLabel("EDUCATION");
            JLabel occupation = new JLabel("OCCUPATION");
            JLabel phone = new JLabel("PHONE");
            JLabel dob = new JLabel("DOB");

            JTextField t1 = new JTextField(100);
            JTextField t2 = new JTextField(100);
            JTextField t3 = new JTextField(100);
            JTextField t4 = new JTextField(100);
            JTextField t5 = new JTextField(100);
            JTextField t6 = new JTextField(100);
            JTextField t7 = new JTextField(100);
            JTextField t8 = new JTextField(100);
            JTextArea t9 = new JTextArea();

            add(name);
            add(fname);
            add(accountNumber);
            add(address);
            add(pinCode);
            add(education);
            add(occupation);
            add(phone);
            add(dob);
            add(t1);
            add(t2);
            add(t3);
            add(t4);
            add(t5);
            add(t6);
            add(t7);
            add(t8);
            add(t9);

            accountNumber.setBounds(100,100,50,50);
            name.setBounds(100,200,50,50);
            fname.setBounds(100,300,50,50);
            address.setBounds(100,400,50,50);
            t1.setBounds(200,100,50,50);
            t2.setBounds(200,200,50,50);
            t3.setBounds(200,300,50,50);
            t9.setBounds(200,400,100,100);

            pinCode.setBounds(500,100,50,50);
            education.setBounds(500,200,50,50);
            occupation.setBounds(500,300,50,50);
            phone.setBounds(500,400,50,50);
            dob.setBounds(500,500,50,50);
            t4.setBounds(600,100,50,50);
            t5.setBounds(600,200,50,50);
            t6.setBounds(600,300,50,50);
            t7.setBounds(600,400,50,50);
            t8.setBounds(600,500,50,50);

            JButton signUp = new JButton("SignUp");
            add(signUp);
            signUp.setBounds(900,500,100,100);

            signUp.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int ac = Integer.parseInt(t1.getText());
                    String name = t2.getText();
                    String fname = t3.getText();
                    String address = t9.getText();
                    String pinCode = t4.getText();
                    String education = t5.getText();
                    String occupation = t6.getText();
                    String phone = t7.getText();
                    String dob = t8.getText();

                    UserCreation user =null;
                    if (ac==0|| name==null|| fname==null|| address==null||
                            pinCode==null|| education==null|| occupation==null|| phone==null||
                            dob==null){
                        System.out.println("Missing Information");
                    }
                    // create user object with above parameters.
                    else{
                        user = new UserCreation(ac, name, fname, address, pinCode, education,
                                occupation, phone, dob);
                    }
                    if (!isExist()){
                        userList.add(user);
                        System.out.println("ACCOUNT CREATED");
                    } else{
                        System.out.println("User Already Exist...try again with AC and PinCode");
                    }
                    clear();
                    System.out.println(userList.toString());




                }
            });

        }

        private void clear() {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
        }
    }