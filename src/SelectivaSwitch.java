/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
import java.lang.Math;
public class SelectivaSwitch {
    public static void main(String[] uriel) {
        // declaracion de variables
        byte opcion;
        float b,h,r;
        double a;
        final double PI=3.1416;
        opcion=Byte.parseByte(JOptionPane.showInputDialog("MENU DE OPCIONES\n 1.- Triangulo\n 2.- Rectangulo\n 3.- Circulo\n"
                +"Escribe el numero de tu eleccion"));
        switch (opcion){
            case 1:
                b=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la base"));
                h=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la altura"));
                a=(b*h)/2;
                JOptionPane.showMessageDialog(null,"El area del triangulo es "+ a);
                   break;
            case 2:
                b=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la base"));
                h=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la altura"));
                a=b*h;
                JOptionPane.showMessageDialog(null,"El area del rectangulo es "+ a);    
                   break;
            case 3: 
                r=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida del radio"));
                a= PI*(r*r);
                JOptionPane.showMessageDialog(null,"El area del circulo es "+ a); 
                   break;
            default:
                JOptionPane.showMessageDialog(null, "Solo es posible seleccionar 1,2 o 3\n Intente nuevamente");
            
                
        }
        
    }
    
}
