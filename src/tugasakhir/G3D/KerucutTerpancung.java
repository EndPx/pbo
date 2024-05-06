/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;

import tugasakhir.Benda3D;

/**
 *
 * @author abaym
 */
public class KerucutTerpancung extends Kerucut implements Benda3D {
    private double jarijariKecil;
    public KerucutTerpancung(double jariJari, double tinggiKerucut, double jarijariKecil) {
        super(jariJari, tinggiKerucut);
        this.jarijariKecil = jarijariKecil;
    }
    
    @Override
    public double menghitungVolume() {
        return (1.0/3) * Math.PI * super.getTinggiKerucut() * ((Math.pow(super.getJariJari(),2)) + (super.getJariJari() * jarijariKecil) + (Math.pow(jarijariKecil,2)));
    }
    
    @Override
    public double menghitungLuasPermukaan() {
        return menghitungLuas() + menghitungLuas(jarijariKecil) + Math.PI * getTinggiKerucut() * (getJariJari() + jarijariKecil);
    }
    
    @Override
    public double menghitungLuasPermukaan(double luasAlasBawah) {
    double tinggi = super.getTinggiKerucut();
    double rAtas = super.getJariJari();
    double rBawah = jarijariKecil;
    double sisiMiring = Math.sqrt(Math.pow(rBawah - rAtas, 2) + tinggi * tinggi);
    double luasPermukaan = Math.PI * sisiMiring * (rAtas + rBawah) + luasAlasBawah;
    return luasPermukaan;
    }
}
