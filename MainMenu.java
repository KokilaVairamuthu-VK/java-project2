package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    JLabel ac;
    JLabel accountNumber;
    public MainMenu(int accNum) throws HeadlessException {
        setSize(1000,1000);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JLabel ac = new JLabel("ac");
        add(ac);
        ac.setBounds(300,100,50,30);

        JLabel accountNumber = new JLabel("Account Number");
        add(accountNumber);
        accountNumber.setBounds(100,100,50,50);

        ac.setText(String.valueOf(accNum));

        JButton checkBalance = new JButton("CHECK BALANCE");
        add(checkBalance);
        checkBalance.setBounds(200,400,100,50);

        JButton deposit = new JButton("DEPOSIT");
        add(deposit);
        deposit.setBounds(600,400,100,50);

        JButton withDraw = new JButton("WITHDRAW");
        add(withDraw);
        withDraw.setBounds(400,700,100,50);

        deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Deposit(accNum);
                dispose();
            }
        });
    }
}
