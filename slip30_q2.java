package java_Slips;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip30_q2 extends JFrame implements ActionListener {

    private JTextField number1Field, number2Field, resultField;

    public slip30_q2() {
        setTitle("Integer Division");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("first:");
        number1Field = new JTextField();
        JLabel label2 = new JLabel("second:");
        number2Field = new JTextField();
        JLabel label3 = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(this);

        panel.add(label1);
        panel.add(number1Field);
        panel.add(label2);
        panel.add(number2Field);
        panel.add(label3);
        panel.add(resultField);
        panel.add(new JLabel()); // empty cell
        panel.add(divideButton);

        add(panel);

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(number1Field.getText());
            int num2 = Integer.parseInt(number2Field.getText());

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            int result = num1 / num2;
            resultField.setText(Integer.toString(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers for Number1 and Number2.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new slip30_q2());
    }
}
