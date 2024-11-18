import javax.swing.JOptionPane;
public class CicloFor {
    public static void main(String[] args) {
        float estatura, peso, imc;
        short nPersonas=Short.parseShort(JOptionPane.showInputDialog("Ingresa el numero de personas para"
                + "calcular el imc"));
        // Pide el peso y altura de cada persona
        for (int i = 1; i <= nPersonas; i++) {
            peso = Float.parseFloat(JOptionPane.showInputDialog("Captura tu peso en kilogramos"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Captura tu estatura en metros"));
            imc=(peso/(estatura*estatura));
            if (imc < 18.49) {
                JOptionPane.showMessageDialog(null, "Peso bajo");
            } else if (imc >= 18.50 && imc <= 24.99) {
                JOptionPane.showMessageDialog(null, "Peso normal");
            } else if (imc >= 25 && imc <= 29.99) {
                JOptionPane.showMessageDialog(null, "Sobrepeso");
            } else if (imc >= 30 && imc <= 34.99) {
                JOptionPane.showMessageDialog(null, "Obesidad leve");
            } else if (imc >= 35 && imc <= 39.99) {
                JOptionPane.showMessageDialog(null, "Obesidad media");
            } else if (imc >= 40) {
                JOptionPane.showMessageDialog(null, "Obesidad mórbida");
            }

        }

    }
}
    

    

