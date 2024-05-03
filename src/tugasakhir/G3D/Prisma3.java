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
        double luasAlas = menghitungLuas();
        return menghitungLuas() * tinggiPrisma;
    }

    public double menghitungVolume(double luasAlas) {
        return luasAlas * tinggiPrisma;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasSegitigaSisiTegak = 0.5 * super.getAlas() * tinggiPrisma; // Menghitung luas segitiga sisi tegak
        double luasSelimut = luasSegitigaSisiTegak * 3;
        return  super.menghitungLuas() + luasSelimut;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double luasSegitigaSisiTegak = 0.5 * super.getAlas() * tinggiPrisma;
        double luasSelimut = luasSegitigaSisiTegak * 3;
        return luasAlas + luasSelimut;
    }
}
