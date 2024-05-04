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
public class Tabung extends Lingkaran implements Benda3D {

    private double tinggiTabung;
    
    public Tabung(double jariJari, double tinggiTabung) {
        super(jariJari);
        this.tinggiTabung = tinggiTabung;
    }

    @Override
    public double menghitungVolume() {
        return menghitungLuas() * tinggiTabung;
    }

    public double menghitungVolume(double luasAlas) {
        return luasAlas * tinggiTabung;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasPermukaan = 2 * Math.PI * super.getJariJari() * (super.getJariJari() + tinggiTabung);
        return luasPermukaan;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double luasPermukaan = 2 * Math.PI * super.getJariJari() * (super.getJariJari() + tinggiTabung);
        return luasPermukaan;
    }
    
}
