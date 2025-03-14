import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame implements ActionListener {
    private JTextField display = new JTextField();
    private StringBuilder currentInput = new StringBuilder();

    public Demo() {
        setTitle("Dynamic Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(this);
            buttonsPanel.add(button);
        }
        add(buttonsPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("=")) {
            try {
                display.setText(String.valueOf(evaluate(currentInput.toString())));
            } catch (Exception ex) {
                display.setText("Error");
            }
            currentInput.setLength(0);
        } else {
            currentInput.append(command);
            display.setText(currentInput.toString());
        }
    }

    private double evaluate(String expression) {
        String[] tokens = expression.split(" ");
        double a = Double.parseDouble(tokens[0]);
        double b = Double.parseDouble(tokens[2]);
        return switch (tokens[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Demo calculator = new Demo();
            calculator.setVisible(true);
        });
    }
}
