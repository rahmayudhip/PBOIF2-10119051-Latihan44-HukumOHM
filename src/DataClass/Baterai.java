/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass;

/**
 *
 * @author RYP
 */
public class Baterai {
     private float kuatArus, hambatan;

    public Baterai() {
        System.out.println("=================== Hukum Ohm ===================");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial"); 
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.hambatan = hambatan;
        this.kuatArus = kuatArus;
        
        System.out.println("Kuat Arus : " + getKuatArus());
        System.out.println("Hambatan : " + getHambatan());
        System.out.println("Hasil Tegangan : " + hitungTegangan());
        
    }
    
    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return hambatan * kuatArus;
    }
}
