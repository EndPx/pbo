/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G2D;

import tugasakhir.Benda2D;

/**
 *
 * @author abaym
 */
public class Persegi implements Benda2D {
    public double sisi;
    public static double luasPersegi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double menghitungLuas() {
        luasPersegi = Math.pow(sisi, 2);
        return luasPersegi;
    }
    
    public double menghitungLuas(double sisi){
        return Math.pow(sisi, 2);
    }
    
    public double menghitungKeliling(){
        return this.sisi*4;
    }
}
