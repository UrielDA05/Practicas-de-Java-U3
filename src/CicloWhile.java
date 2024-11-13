import javax.swing.JOptionPane;
public class CicloWhile {
    public static void main(String[] args) {
        Float estatura, imc;
        Short peso;
        String resp;
        resp = JOptionPane.showInputDialog("¿Quieres saber que peso tienes?\n Si es asi escribe: si\n Si no escribe: no");
        while(resp.equals("si")){
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estatura en metros"));
            peso = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu peso en kilogramos"));
            imc=(peso/(estatura*estatura));
            if(imc<18.49){
                JOptionPane.showMessageDialog(null, "Peso bajo");
            } else if (imc>=18.50 && imc<=24.99){
                JOptionPane.showMessageDialog(null, "Peso normal");
            }else if (imc>=25 && imc<=29.99){
                JOptionPane.showMessageDialog(null, "Sobrepeso");
            }else if (imc>=30 && imc<=34.99){
                JOptionPane.showMessageDialog(null, "Obesidad leve");
            }else if (imc>=35 && imc<=39.99){
                JOptionPane.showMessageDialog(null, "Obesidad media");
            }else if (imc>=40){
                JOptionPane.showMessageDialog(null, "Obesidad morbida");
            }else {
                JOptionPane.showMessageDialog(null, "Programa terminado");
            }
            resp = JOptionPane.showInputDialog("¿Quieres volver a intentarlo?\n Si es asi escribe: si\n Si no escribe: no");
        }
    }
}

