package java_Slips;


import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class slip12_q2 extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[][] buttons;
    private String[][] buttonTexts = {
            {"7", "8", "9", "/"},
            {"4", "5", "6", "*"},
            {"1", "2", "3", "-"},
            {"0", ".", "=", "+"}
    };

    public slip12_q2() {
        setLayout(new GridLayout(4, 4));

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField);

        buttons = new JButton[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buttons[i][j] = new JButton(buttonTexts[i][j]);
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = ((JButton) e.getSource()).getText();

        if (input.equals("=")) {
            try {
                textField.setText(String.valueOf(calculate(textField.getText())));
            } catch (Exception exception) {
                textField.setText("Error");
            }
        } else if (input.equals("C")) {
            textField.setText("");
        } else {
            textField.setText(textField.getText() + input);
        }
    }

    private double calculate(String input) {
        return 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            slip12_q2 calculator = new slip12_q2();
            calculator.setVisible(true);
        });
    }
}