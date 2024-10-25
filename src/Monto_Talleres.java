
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uriel
 */
public class Monto_Talleres {
    public static void main(String[] args) {
        double basket , voli ,artes ,fut ,taek ,aje ,mus ,atle ;
        short mBask=9000 , mVoli=15000, mFut=15000;
        short mAje=25000 , mMus=12000 , mAtl=13000 ;
        int montoT=189000, mTaek=50000, mArt=50000;
        basket = (mBask/(montoT/100));
        voli = (mVoli/(montoT/100));
        artes= (mArt/(montoT/100));
        fut =(mFut/(montoT/100));
        taek=(mTaek/(montoT/100));
        aje=(mAje/(montoT/100));
        mus=(mMus/(montoT/100));
        atle=(mAtl/(montoT/100));
        JOptionPane.showMessageDialog(null,"Taller basketball: $"+mBask+", porcentaje: %"+basket);
        JOptionPane.showMessageDialog(null,"Taller voliball: $"+mVoli+", porcentaje: %"+voli);
        JOptionPane.showMessageDialog(null,"Taller artes: $"+mArt+", porcentaje: %"+artes);
        JOptionPane.showMessageDialog(null,"Taller futball: $"+mFut+", porcentaje: %"+fut);
        JOptionPane.showMessageDialog(null,"Taller taekwondo: $"+mTaek+", porcentaje: %"+taek);
        JOptionPane.showMessageDialog(null,"Taller ajedrez: $"+mAje+", porcentaje: %"+aje);
        JOptionPane.showMessageDialog(null,"Taller musica: $"+mMus+", porcentaje: %"+mus);
        JOptionPane.showMessageDialog(null,"Taller atletismo: $"+mAtl+", porcentaje: %"+atle);
        
        
        
    }
}

