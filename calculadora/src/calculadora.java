import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BiFunction;
import java.util.function.Function;

public class calculadora extends JFrame {

    private JPanel calculadora;
    private JTextField val1;
    private JTextField val2;
    private JTextField resultField;
    private JButton sumar;
    private JButton logButton;
    private JButton x2Button;
    private JButton restar;
    private JButton mult;
    private JButton dividir;
    private JButton expButton;
    private JButton cosButton;
    private JButton senButton;
    private JButton tanButton;
    private JButton hypButton;
    private JButton xNButton;
    private JButton a2NButton;
    private JButton a3NButton;
    private JButton nXButton;
    private JButton salirButton;
    private JPanel op;
    private JPanel resul;

    public calculadora () {
        super("Calculadora");
        setSize(500, 600);
        setContentPane(calculadora);

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(null,
                        "¿Estás seguro de que deseas salir?",
                        "Salir", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    dispose(); // Cierra la ventana
                }
            }
        });
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float suma = num1 + num2;
                    resultField.setText(String.valueOf(suma));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });
        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float suma = num1 - num2;
                    resultField.setText(String.valueOf(suma));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float suma = num1 * num2;
                    resultField.setText(String.valueOf(suma));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());

                    if (num1 == 0 || num2 == 0) {
                        resultField.setText("Error: Ingresa números distintos de 0");
                    } else {
                        float suma = num1 / num2;
                        resultField.setText(String.valueOf(suma));
                    }
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        expButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.pow(num1,2);
                    float exp2 = (float) Math.pow(num2,2);
                    resultField.setText("Valor1: " + String.valueOf(exp1) + " Valor2: " + String.valueOf(exp2));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.log(num1);
                    float exp2 = (float) Math.log(num2);
                    resultField.setText("Valor1: " + String.valueOf(exp1) + " Valor2: " + String.valueOf(exp2));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.PI/num1;
                    float exp2 = (float) Math.PI/num2;
                    float res1 = (float) Math.cos(exp1);
                    float res2 = (float) Math.cos(exp2);
                    resultField.setText("Valor1: " + String.valueOf(res1) + " Valor2: " + String.valueOf(res2));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.PI/num1;
                    float exp2 = (float) Math.PI/num2;
                    float res1 = (float) Math.sin(exp1);
                    float res2 = (float) Math.sin(exp2);
                    resultField.setText("Valor1: " + String.valueOf(res1) + " Valor2: " + String.valueOf(res2));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.PI/num1;
                    float exp2 = (float) Math.PI/num2;
                    float res1 = (float) Math.tan(exp1);
                    float res2 = (float) Math.tan(exp2);
                    resultField.setText("Valor1: " + String.valueOf(res1) + " Valor2: " + String.valueOf(res2));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        hypButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.sqrt(Math.pow(num1,2) + Math.pow(num2,2));
                    resultField.setText(String.valueOf(exp1));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        x2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.pow(num1,num2);
                    resultField.setText(String.valueOf(exp1));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });
        xNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.pow(num1,num2);
                    resultField.setText(String.valueOf(exp1));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });

        a2NButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.sqrt(num1);
                    resultField.setText(String.valueOf(exp1));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });
        a3NButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.pow(num1, 1.0/3.0);
                    resultField.setText(String.valueOf(exp1));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });
        nXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(val1.getText());
                    float num2 = Float.parseFloat(val2.getText());
                    float exp1 = (float) Math.pow(num1, 1.0/num2);
                    resultField.setText(String.valueOf(exp1));
                } catch (NumberFormatException error) {
                    resultField.setText("Error: Ingresa números válidos");
                }
            }
        });
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
            double num1 = Double.parseDouble(val1.getText());
            double num2 = Double.parseDouble(val2.getText());
            double result = operation.apply(num1, num2);
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void performFunction(Function<Double, Double> function) {
        try {
            double num1 = Double.parseDouble(val1.getText());
            double result = function.apply(num1);
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }
}
