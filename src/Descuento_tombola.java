/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

        
/**
 *
 * @author tene
 */
public class Descuento_tombola {
    public static void main(String[] args) {
        double precioI , precioF ,descuento;
        precioI=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor de su compra"));
        String C;
        C=JOptionPane.showInputDialog(null,"Ingres el color de la bola que le toco (rojo,verde,amarillo,azul)");
        if (C.equals("rojo")){
           JOptionPane.showInternalMessageDialog(null,"Color de bola rojo y tu descuento es de un 40%" ); 
           descuento=0.4;
        }else if (C.equals("verde")){
            JOptionPane.showInternalMessageDialog(null,"Color de bola verde y tu descuento es de un 28%" );
            descuento=0.28;
        }else if (C.equals("amarillo")){
            JOptionPane.showInternalMessageDialog(null,"Color de bola amarillo y tu descuento es de un 15%" );
            descuento=0.15;
        }else if (C.equals("azul")){
            JOptionPane.showInternalMessageDialog(null,"Color de bola azul y tu descuento es de un 5%" );
            descuento=0.05;
        }else{
            JOptionPane.showInternalMessageDialog(null,"Color no existente" );
            descuento=0;
        }
        precioF=precioI - (precioI *descuento);
        JOptionPane.showMessageDialog(null, "El precio final a pagar es: $" + precioF);
        
                    }
        }
    
    
