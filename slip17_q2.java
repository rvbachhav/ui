package java_Slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class framing extends JFrame implements ActionListener{

    JTextField t1 , t2 , t3;
    JButton bt1 , bt2;
    public framing(){
        setSize(1000 , 800);

        t1 = new JTextField(50);
        t1.setBounds(50, 50,  200, 30);

        t2 = new JTextField("Enter Something..." ,50);
        t2.setBounds(50, 100, 200, 30);

        t3 = new JTextField(100);
        t3.setBounds(50, 150, 200, 30);
        t3.setEditable(false);


        bt1 = new JButton("Concat");
        bt1.setBounds(50 , 200 , 150 , 30);
        bt1.addActionListener(this);
        bt1.setFocusable(false);

        bt2 = new JButton("Reverse");
        bt2.setBounds(50 , 250 , 150 , 30);
        bt2.addActionListener(this);
        bt2.setFocusable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(t1);
        add(t2);
        add(t3);
        add(bt1);
        add(bt2);


        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bt1){
            String first = t1.getText();
            String second = t2.getText();
            String combine = first + second;
            t3.setText(combine);
            System.out.println(combine);
        }
        if(e.getSource() == bt2){
            String string = t1.getText();
            String str="";
            char ch;
            for (int i = 0; i < string.length(); i++){
                ch = string.charAt(i);
                str = ch+str;
            }
            t3.setText(str);
        }
    }
}

public class slip17_q2 {
    public static void main(String[] args) {
        new framing();
    }
}
