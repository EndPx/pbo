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
        return (1.0 / 3) * Persegi.luasPersegi * tinggiLimas;
    }

    public double menghitungVolume(double sisi) {
        return (1.0 / 3) * super.menghitungLuas(sisi) * tinggiLimas;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasSelimut = 0.5 * Persegi.kelilingPersegi * Math.sqrt(Math.pow(super.sisi,2) + Math.pow(tinggiLimas,2));
        return Persegi.luasPersegi + luasSelimut;
    }

    public double menghitungLuasPermukaan(double sisi) {
        double luasSelimut = 0.5 * super.menghitungKeliling(sisi) * Math.sqrt(Math.pow(super.sisi,2) + Math.pow(tinggiLimas,2));
        return menghitungLuas(sisi) + luasSelimut;
    }
}
