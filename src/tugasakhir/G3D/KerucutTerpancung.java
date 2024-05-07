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
    private double tinggiKerucutTerpancung;
    public KerucutTerpancung(double jariJari, double tinggiKerucutTerpancung, double jarijariKecil) {
        super(jariJari);
        this.jarijariKecil = jarijariKecil;
        this.tinggiKerucutTerpancung = tinggiKerucutTerpancung;
    }
    
    @Override
    public double menghitungVolume() {
        return (1.0/3) * Math.PI * tinggiKerucutTerpancung * ((Math.pow(super.getJariJari(),2)) + (super.getJariJari() * jarijariKecil) + (Math.pow(jarijariKecil,2)));
    }
    
    @Override
    public double menghitungLuasPermukaan() {
        return menghitungLuas() + menghitungLuas(jarijariKecil) + Math.PI * tinggiKerucutTerpancung * (getJariJari() + jarijariKecil);
    }
    
    @Override
    public double menghitungLuasPermukaan(double luasAlasBawah) {
    double tinggi = tinggiKerucutTerpancung;
    double rAtas = super.getJariJari();
    double rBawah = jarijariKecil;
    double sisiMiring = Math.sqrt(Math.pow(rBawah - rAtas, 2) + tinggi * tinggi);
    double luasPermukaan = Math.PI * sisiMiring * (rAtas + rBawah) + luasAlasBawah;
    return luasPermukaan;
    }
}
