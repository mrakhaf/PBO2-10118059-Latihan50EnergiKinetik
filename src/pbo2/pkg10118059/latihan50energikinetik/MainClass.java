/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan50energikinetik;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        
        bola.setMassa(145);
        bola.setKecepatan(25);
        
        System.out.println("Sebuah bola baseball dengan massa " + bola.getMassa() + " g dilempar dengan kecepatan " + bola.getKecepatan() + " m/s.");
        System.out.println("a. Berapakah energi Kinetiknya ? ");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini. jika dimulai dari keadaan diam ?");
        System.out.println("");
        System.out.println("Jawab : ");
        System.out.println("Diketahui ");
        System.out.println("Massa = m = " + bola.getMassa() + " g");
        System.out.println("Kecepatan = v = " + bola.getKecepatan() + " m/s");
        System.out.println("a. Energi Kinetik = Ek = " + bola.hitungEnergiKinetik());
        System.out.println("b. Usaha = W = " + bola.hitungUsaha());
    }
    
}
