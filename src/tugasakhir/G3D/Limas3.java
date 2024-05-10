/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;

import tugasakhir.Benda3D;
import tugasakhir.G2D.Segitiga;

/**
 *
 * @author abaym
 */
public class Limas3 extends Segitiga implements Benda3D {

    private double tinggiLimas;

    public Limas3(double alas, double tinggi, double tinggiLisma) {
        super(alas, tinggi);
        this.tinggiLimas = tinggiLisma;
    }

    @Override
    public double menghitungVolume() {
        return (1.0/3) * Segitiga.luasSegitiga * tinggiLimas;
    }

    public double menghitungVolume(double alas, double tinggi) {
        return (1.0/3) * super.menghitungLuas(alas, tinggi) * tinggiLimas;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double sisiTegak = Math.sqrt(Segitiga.luasSegitiga * super.tinggi + Math.pow(tinggiLimas,2));
        double luasSelimut = 0.5 * sisiTegak * Segitiga.luasSegitiga * 3;
        return super.menghitungLuas() + luasSelimut;
    }

    public double menghitungLuasPermukaan(double alas, double tinggi) {
        double sisiTegak = Math.sqrt(super.menghitungLuas(alas, tinggi) * tinggi + Math.pow(tinggiLimas,2));
        double luasSelimut = 0.5 * sisiTegak * super.menghitungLuas(alas, tinggi) * 3;
        return super.menghitungLuas(alas, tinggi) + luasSelimut;
    }
}
