/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;

import tugasakhir.Benda3D;
import tugasakhir.G2D.Segitiga;

/**
 *
 * @author abaym
 */
public class Limas3 extends Segitiga implements Benda3D {

    private double tinggiLimas;

    public Limas3(double alas, double tinggi, double tinggiLisma) {
        super(alas, tinggi);
        this.tinggiLimas = tinggiLisma;
    }

    @Override
    public double menghitungVolume() {
        return (1.0/3) * menghitungLuas() * tinggiLimas;
    }

    public double menghitungVolume(double luasAlas) {
        return (1.0/3) * luasAlas * tinggiLimas;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double sisiTegak = Math.sqrt(super.getAlas() * super.getTinggi() + Math.pow(tinggiLimas,2));
        double luasSelimut = 0.5 * sisiTegak * super.getAlas() * 3;
        return super.menghitungLuas() + luasSelimut;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double sisiTegak = Math.sqrt(super.getAlas() * super.getTinggi() + Math.pow(tinggiLimas,2));
        double luasSelimut = 0.5 * sisiTegak * super.getAlas() * 3;
        return luasAlas + luasSelimut;
    }
}
