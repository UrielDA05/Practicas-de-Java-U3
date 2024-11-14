import javax.swing.JOptionPane;
public class CicloFor {
    public static void main(String[] args) {
        float estatura, peso, imc;
        short nPersonas=Short.parseShort(JOptionPane.showInputDialog("Ingresa el numero de personas para"
                + "calcular el imc"));
        // Pide el peso y altura de cada persona
        for (int i = 0; i <= nPersonas; i++) {
            peso = Float.parseFloat(JOptionPane.showInputDialog("Captura tu peso en kilogramos"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Captura tu estatura en metros"));
            imc=(peso/(estatura*estatura));
            JOptionPane.showMessageDialog(null,"Tu imc es de "+imc);
        }

    }
}
    

    

