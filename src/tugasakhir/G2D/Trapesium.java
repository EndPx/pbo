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
public class Trapesium implements Benda2D{
    private double alasBawah;
    private double alasAtas;
    private double tinggi;
    public Trapesium(double alasBawah, double alasAtas, double tinggi) {
        this.alasBawah=alasBawah;
        this.alasAtas=alasAtas;
        this.tinggi=tinggi;
    }

    @Override
    public double menghitungLuas() {
        return 0.5 * ((this.alasAtas+this.alasBawah)*this.tinggi);
    }

    @Override
    public double menghitungKeliling() {
        double sisiA = Math.sqrt(Math.pow(alasBawah - alasAtas, 2) + Math.pow(tinggi, 2));
        double sisiB = Math.sqrt(Math.pow(alasBawah + alasAtas, 2) + Math.pow(tinggi, 2));
        return alasBawah + alasAtas + sisiA + sisiB;
    }
    
}
