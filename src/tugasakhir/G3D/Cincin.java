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
public class Cincin extends Bola implements Benda3D {

    private double jarijariKecil;
    private double sudutCincin;
    public Tabung(double jariJari, double jarijariKecil, double sudutCincin) {
        super(jariJari);
        this.sudutCincin = sudutCincin;
        this.jarijariKecil = jarijariKecil;
    }

     @Override
    public double menghitungVolume() {
        return (sudutCincin / 360.0) * (super.volumeBola - super.menghitungVolume(jarijariKecil));
    }

    public double menghitungVolume(double r) {
        return (sudutCincin / 360.0) * (super.menghitungVolume(r) - super.menghitungVolume(jarijariKecil));
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
