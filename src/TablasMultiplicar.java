/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uriel
 */
public class TablasMultiplicar {
    public static void main(String[] args) {
        for(int a=1; a<=10;a++){
            System.out.println("Tabla del : "+a );
            for(int b=1;b<=10;b++){
                int r=a*b;
                System.out.println(a+"*"+b+"="+r);
            }
            System.out.println("");
        }
    }      
}
