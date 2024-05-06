/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;

import tugasakhir.Benda3D;
import tugasakhir.G2D.Persegi;

/**
 *
 * @author abaym
 */
public class LimasP extends Persegi implements Benda3D {

    private double tinggiLimas;

    public LimasP(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double menghitungVolume() {
        return (1.0 / 3) * menghitungLuas() * tinggiLimas;
    }

    public double menghitungVolume(double luasAlas) {
        return (1.0 / 3) * luasAlas * tinggiLimas;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasSelimut = 0.5 * menghitungKeliling() * Math.sqrt(Math.pow(super.getSisi(),2) + Math.pow(tinggiLimas,2));
        return super.menghitungLuas() + luasSelimut;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double luasSelimut = 0.5 * menghitungKeliling() * Math.sqrt(Math.pow(super.getSisi(),2) + Math.pow(tinggiLimas,2));
        return luasAlas + luasSelimut;
    }
}
