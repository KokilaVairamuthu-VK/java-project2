package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame {
    JButton depositProcess;
    JLabel depositAmount;
    public Deposit(int accNum) throws HeadlessException {
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JLabel depositAmount = new JLabel("Deposit Amount");
        add(depositAmount);
        depositAmount.setBounds(200,200,100,50);

        JTextField t1 = new JTextField(100);
        add(t1);
        t1.setBounds(350,200,100,50);

        JButton depositProcess = new JButton("Deposit");
        add(depositProcess);
        depositProcess.setBounds(300,400,100,50);

        depositProcess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(t1.getText());
                Account.deposit(amount,accNum);

            }
        });

    }
}
