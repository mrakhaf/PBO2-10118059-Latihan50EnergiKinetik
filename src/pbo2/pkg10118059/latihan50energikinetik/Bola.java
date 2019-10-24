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
public class Bola {
    private int massa, kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik(){
        return massa*kecepatan*kecepatan/2/1000;
    }
    
    public double hitungUsaha(){
        return massa*((kecepatan*kecepatan)-0)/2/1000;
    }
}
