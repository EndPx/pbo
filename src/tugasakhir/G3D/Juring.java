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
public class Juring extends Lingkaran implements Benda3D {
    public Juring(double jariJariBawah, double jariJariAtas, double tinggi) {
        super(jariJariBawah);
        this.jariJariAtas = jariJariAtas;
        this.tinggi = tinggi;
    }

    private double jariJariAtas;
    private double tinggi;

    public double getJariJariAtas() {
        return jariJariAtas;
    }

    public void setJariJariAtas(double jariJariAtas) {
        this.jariJariAtas = jariJariAtas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double menghitungVolume() {
        return (1.0 / 3.0) * Math.PI * tinggi * (Math.pow(getJariJari(), 2) + Math.pow(getJariJariAtas(), 2) + (getJariJari() * getJariJariAtas()));
    }

    @Override
    public double menghitungLuasPermukaan() {
        double r = getJariJari();
        double R = getJariJariAtas();
        double l = Math.sqrt(tinggi * tinggi + (R - r) * (R - r));
        return Math.PI * (r + R) * l + Math.PI * r * r;
    }
}
