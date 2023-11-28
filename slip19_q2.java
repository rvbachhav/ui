package java_Slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class slip19_q2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JComboBox");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        String[] data = {"Select Subject","java","jdbc","html","css","js"};
        JComboBox<String> cd = new JComboBox<>(data);

        JTextField text = new JTextField(20);
        text.setEditable(false);

        cd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String comboData = (String) cd.getSelectedItem();
                text.setText(comboData);
            }
        });

        frame.add(cd);
        frame.add(text);
        frame.setVisible(true);
    }
}
