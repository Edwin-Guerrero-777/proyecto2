import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JLabel respuesta;
    private JButton restar;
    private JTextField Numero2;
    private JButton sumar;
    private JButton multiplicar;
    private JButton division;
    private JTextField Numero1;

    public calculadora() {
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                double suma = num1 + num2;
                respuesta.setText(String.format("%.2f", sumar));

            }
        });

        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                double resta = num1 - num2;
                respuesta.setText(String.format("%.2f", restar));

            }
        });
        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                double multiplicar = num1 * num2;
                respuesta.setText(String.format("%.2f", calculadora.this.multiplicar));

            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
               if(num2==0){
                   respuesta.setText("imposible");
                   JOptionPane.showMessageDialog(null, "division por cero no es posible.");
               } else {
                   double div =num1/num2;
                   respuesta.setText(String.format("%.2f",div));
               }

            }
        });
    }
}

