package java_Slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Data extends JFrame implements ActionListener{
    JLabel yourName , yourClass , yourHobbies , name , Class , hobbies ;
    JTextField nameTextField , nameTF , classTF , hobbiesTF;
    JCheckBox music,dance,sports;

    JRadioButton fy , sy , ty;
    JButton Add , clear;

    Data(){

        setSize(1000 , 1000);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setSize(600 , 600);
        p.setBorder(BorderFactory.createLineBorder(Color.BLACK , 2));

        ButtonGroup g = new ButtonGroup();

        yourName = new JLabel("Enter Your Name");
        yourName.setBounds(10 , 10 , 100,100);

        nameTextField = new JTextField(30);
        nameTextField.setBounds(150 , 45 , 300,30);

        yourClass = new JLabel("Your Class");
        yourClass.setBounds(10, 100 , 100 , 100);

        yourHobbies = new JLabel("Your Hobbies");
        yourHobbies.setBounds(150 , 143 , 100,10);

        fy = new JRadioButton("FY");
        fy.setBounds(10 , 178 , 100,50);

        sy = new JRadioButton("SY");
        sy.setBounds(10 , 230 , 100,50);

        ty = new JRadioButton("TY");
        ty.setBounds(10 , 275 , 100,50);

        g.add(fy);
        g.add(sy);
        g.add(ty);

        music = new JCheckBox("Music");
        music.setBounds(150,190,100,20);

        dance = new JCheckBox("Dance");
        dance.setBounds(150,240,100,20);

        sports = new JCheckBox("Sports");
        sports.setBounds(150,290,100,20);

        JLabel hr = new JLabel();
        hr.setBounds(0,335,500,1);
        hr.setBorder(BorderFactory.createLineBorder(Color.black , 2));

        name = new JLabel("Name");
        name.setBounds(10,350,50,30);

        nameTF = new JTextField(30);
        nameTF.setBounds(50,350,100,30);
        nameTF.setEditable(false);

        Class = new JLabel("Class");
        Class.setBounds(180,350,50,30);

        classTF = new JTextField(30);
        classTF.setBounds(225,350,100,30);
        classTF.setEditable(false);

        hobbies = new JLabel("Hobbies");
        hobbies.setBounds(350,350,50,30);

        hobbiesTF = new JTextField(30);
        hobbiesTF.setBounds(400,350,100,30);
        hobbiesTF.setEditable(false);

        JLabel hr2 = new JLabel();
        hr2.setBounds(0,400,500,1);
        hr2.setBorder(BorderFactory.createLineBorder(Color.black , 2));

        Add = new JButton("Submit");
        Add.setBounds(10 , 450 , 250 , 50);
        Add.setForeground(Color.white);
        Add.setBackground(Color.black);
        Add.setFocusable(false);
        Add.addActionListener(this);

        clear = new JButton("Clear");
        clear.setBounds(280 , 450 , 250 , 50);
        clear.setForeground(Color.black);
        clear.setBackground(Color.green);
        clear.setFocusable(false);
        clear.addActionListener(this);

        p.add(yourName);
        p.add(nameTextField);
        p.add(yourClass);
        p.add(yourHobbies);
        p.add(fy);
        p.add(sy);
        p.add(ty);
        p.add(music);
        p.add(dance);
        p.add(sports);
        p.add(hr);
        p.add(name);
        p.add(nameTF);
        p.add(Class);
        p.add(classTF);
        p.add(hobbies);
        p.add(hobbiesTF);
        p.add(hr2);
        p.add(Add);
        p.add(clear);


        add(p);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Add){
            String Name = nameTextField.getText();
            nameTF.setText(Name);
            if (fy.isSelected()){
                classTF.setText(fy.getText());
            }
            else if(sy.isSelected()){
                classTF.setText(sy.getText());
            }
            else {
                classTF.setText(ty.getText());
            }

            if (music.isSelected() && dance.isSelected() && sports.isSelected()){
                hobbiesTF.setText(music.getText());
            }
        }
    }
}

public class slip25_q2 {
    public static void main(String[] args) {
        new Data();
    }
}
