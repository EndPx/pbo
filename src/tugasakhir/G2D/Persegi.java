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
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
   
    public double getSisi() {
        return this.sisi;
    }

    @Override
    public double menghitungLuas() {
        return Math.pow(sisi, 2);
    }
    
    public double menghitungKeliling(){
        return this.sisi*4;
    }
}
