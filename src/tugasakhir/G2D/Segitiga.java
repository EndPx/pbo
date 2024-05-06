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
public class Segitiga implements Benda2D {
    private double alas;
    private double tinggi;
    private double luas;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }

    @Override
    public double menghitungLuas() {
        return 0.5 * alas * tinggi;
    }
    
}
