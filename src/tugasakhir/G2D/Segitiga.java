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
    public double alas;
    public double tinggi;
    public static double luasSegitiga;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double menghitungLuas() {
        luasSegitiga = 0.5 * alas * tinggi;
        return luasSegitiga;
    }
    
    public double menghitungLuas(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }

    @Override
    public double menghitungKeliling() {
       return alas + tinggi + (Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)));
    }
}
