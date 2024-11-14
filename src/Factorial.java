/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author uriel
 */
public class Factorial {
    public static void main(String[] args) {
        short fact=1,x,resp,num;
        do{
        num=Short.parseShort(JOptionPane.showInputDialog("Ingrese el numero a calcular el factorial"));
        fact=1;
        for(x=num; x>=1; x--){
        fact*=x;
        }
        JOptionPane.showMessageDialog(null,"El factorial de "+ num + " es: "+fact);
            resp=Short.parseShort(JOptionPane.showInputDialog("Ingrese 1 para calcular otro factorial"));
        }while (resp==1);
    }
    
}
