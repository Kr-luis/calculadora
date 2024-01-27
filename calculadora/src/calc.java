import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BiFunction;
import java.util.function.Function;

public class calc extends JFrame {
    private JTextField textField1, textField2, resultField;
    private JButton sumButton, subtractButton, multiplyButton, divideButton, sinButton, cosButton, tanButton,
            sqrtButton, cbrtButton, expButton, logButton, hypotenuseButton, powButton, rootButton, salirButton;

    public calc() {
        // Configuración del formulario
        setTitle("Calculadora");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Creación de componentes
        textField1 = new JTextField();
        textField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        sumButton = createOperationButton("Sumar", (a, b) -> a + b);
        subtractButton = createOperationButton("Restar", (a, b) -> a - b);
        multiplyButton = createOperationButton("Multiplicar", (a, b) -> a * b);
        divideButton = createOperationButton("Dividir", (a, b) -> b != 0 ? a / b : Double.NaN);
        sinButton = createFunctionButton("Sen", Math::sin);
        cosButton = createFunctionButton("Cos", Math::cos);
        tanButton = createFunctionButton("Tan", Math::tan);
        sqrtButton = createFunctionButton("Raíz cuadrada", Math::sqrt);
        cbrtButton = createFunctionButton("Raíz cúbica", Math::cbrt);
        expButton = createOperationButton("Exponente", Math::pow);
        logButton = createFunctionButton("Logaritmo", Math::log);
        hypotenuseButton = createOperationButton("Hipotenusa", Math::hypot);
        powButton = createOperationButton("Potencia", Math::pow);
        rootButton = createOperationButton("Raíz de", (a, b) -> b != 0 ? Math.pow(a, 1 / b) : Double.NaN);
        salirButton = new JButton("Salir");

        // Agregar componentes al formulario
        add(new JLabel("Número 1:"));
        add(textField1);
        add(new JLabel("Número 2:"));
        add(textField2);
        add(new JLabel("Resultado:"));
        add(resultField);
        add(sumButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(sinButton);
        add(cosButton);
        add(tanButton);
        add(sqrtButton);
        add(cbrtButton);
        add(expButton);
        add(logButton);
        add(hypotenuseButton);
        add(powButton);
        add(rootButton);
        add(salirButton);

        // Configuración de eventos
        salirButton.addActionListener(e -> exitApplication());
    }

    private JButton createOperationButton(String label, BiFunction<Double, Double, Double> operation) {
        JButton button = new JButton(label);
        button.addActionListener(e -> performOperation(operation));
        return button;
    }

    private JButton createFunctionButton(String label, Function<Double, Double> function) {
        JButton button = new JButton(label);
        button.addActionListener(e -> performFunction(function));
        return button;
    }

    private void performOperation(BiFunction<Double, Double, Double> operation) {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double result = operation.apply(num1, num2);
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void performFunction(Function<Double, Double> function) {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double result = function.apply(num1);
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exitApplication() {
        int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose(); // Cierra la ventana
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new calc().setVisible(true));
    }
}
