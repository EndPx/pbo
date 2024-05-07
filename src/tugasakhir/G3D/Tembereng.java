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

public class Tembereng extends Bola implements Benda3D{
    public Tembereng(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }
    private double tinggi;
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double menghitungVolume() {
        return Math.PI * Math.pow(getJariJari(), 2) * tinggi;
    }

    @Override
    public double menghitungLuasPermukaan() {
        return 2 * Math.PI * getJariJari() * (getJariJari() + tinggi);
    }
}
