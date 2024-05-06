/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;
import tugasakhir.Benda3D;
import tugasakhir.G2D.Lingkaran;
/**
 *
 * @author abaym
 */
public class Cincin extends Bola implements Benda3D {

    private double tinggiCincin;
    private double jarijariDalam;
    
    public Tabung(double jariJari, double tinggiCincin, double jarijariDalam) {
        super(jariJari);
        this.tinggiCincin = tinggiCincin;
        this.jarijariDalam = jarijariDalam;
    }

     @Override
    public double menghitungVolume() {
        double volumeBesar = menghitungLuas() * tinggiCincin;
        double volumeKecil = Math.PI * Math.pow(jarijariDalam,2) * tinggiCincin;
        return volumeBesar - volumeKecil;
    }

    public double menghitungVolume(double luasAlas) {
        double volumeBesar = luasAlas * tinggiCincin;
        double volumeKecil = Math.PI * Math.pow(jarijariDalam,2) * tinggiCincin;
        return volumeBesar - volumeKecil;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasPenutup = (menghitungLuas() - Math.PI * Math.pow(jarijariDalam,2)) * 2;
        double luasSelimutBesar = 2 * Math.PI * super.getJariJari() * tinggiCincin;
        double luasSelimutKecil = 2 * Math.PI * jarijariDalam * tinggiCincin;
        double luasPermukaan = luasPenutup + luasSelimutBesar + luasSelimutKecil;
        return luasPermukaan;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double luasPenutup = (menghitungLuas() - Math.PI * Math.pow(jarijariDalam,2)) * 2;
        double luasSelimutBesar = 2 * Math.PI * super.getJariJari() * tinggiCincin;
        double luasSelimutKecil = 2 * Math.PI * jarijariDalam * tinggiCincin;
        double luasPermukaan = luasPenutup + luasSelimutBesar + luasSelimutKecil;
        return luasPermukaan;
    }
}
