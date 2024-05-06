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
public class KerucutTerpancung extends Kerucut implements Benda3D {

    private double tinggiKerucutT;
    private double jarijariKecil;
    
    public Tabung(double jariJari, double tinggiKerucutT, double jarijariKecil) {
        super(jariJari);
        this.tinggiKerucutT = tinggiKerucutT;
        this.jarijariKecil = jarijariKecil;
    }

    @Override
    public double menghitungVolume() {
        return (1.0/3) * Math.PI * tinggiKerucutT * ((Math.pow(super.getJariJari(),2)) + (super.getJariJari() * jarijariKecil) + (Math.pow(jarijariKecil,2)));
    }

    public double menghitungVolume(double luasAlas) {
        return (1.0/3) * Math.PI * tinggiKerucutT * ((Math.pow(super.getJariJari(),2)) + (super.getJariJari() * jarijariKecil) + (Math.pow(jarijariKecil,2)));
    }

    @Override
    public double menghitungLuasPermukaan() {
        double sisiMiring = Math.sqrt(Math.pow(super.getJariJari() - jarijariKecil,2) + Math.pow(tinggiKerucutT,2));
        double luasPermukaan = Math.PI * sisiMiring  * (super.getJariJari() + jarijariKecil);
        return luasPermukaan;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double sisiMiring = Math.sqrt(Math.pow(super.getJariJari() - jarijariKecil,2) + Math.pow(tinggiKerucutT,2));
        double luasPermukaan = Math.PI * sisiMiring  * (super.getJariJari() + jarijariKecil);
        return luasPermukaan;
    }
}
