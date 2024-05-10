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
public class Prisma3 extends Segitiga implements Benda3D {

    private double tinggiPrisma;
    public Prisma3(double alas, double tinggi, double tinggiPrisma) {
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double menghitungVolume() {
        return Segitiga.luasSegitiga * tinggiPrisma;
    }

    public double menghitungVolume(double alas, double tinggi) {
        return super.menghitungLuas(alas, tinggi) * tinggiPrisma;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasSegitigaSisiTegak = 0.5 * Segitiga.luasSegitiga * tinggiPrisma; 
        double luasSelimut = luasSegitigaSisiTegak * 3;
        return  Segitiga.luasSegitiga + luasSelimut;
    }

    public double menghitungLuasPermukaan(double alas, double tinggi) {
        double luasSegitigaSisiTegak = 0.5 * super.menghitungLuas(alas, tinggi) * tinggiPrisma;
        double luasSelimut = luasSegitigaSisiTegak * 3;
        return super.menghitungLuas(alas, tinggi) + luasSelimut;
    }
}
