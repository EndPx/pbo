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
public class Kerucut extends Lingkaran implements Benda3D {

    public double tinggiKerucut;
    public static double luasPermukaanKerucut;
    public static double volumeKerucut;
    
    public Kerucut(double jariJari, double tinggiKerucut) {
        super(jariJari);
        this.tinggiKerucut = tinggiKerucut;
    }

     @Override
    public double menghitungVolume() {
        volumeKerucut = (1.0/3) * Lingkaran.luasLingkaran * tinggiKerucut;
        return volumeKerucut;
    }

    public double menghitungVolume(double r, double tinggiKerucut) {
        return (1.0/3) * super.menghitungLuas(r) * tinggiKerucut;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double sisiMiring = Math.sqrt(Math.pow(super.jariJari,2) + Math.pow(tinggiKerucut,2));
        double luasSelimut = Math.PI * super.jariJari * sisiMiring;
        luasPermukaanKerucut = Lingkaran.luasLingkaran + luasSelimut;
        return luasPermukaanKerucut;
    }

    public double menghitungLuasPermukaan(double r, double tinggiKerucut) {
        double sisiMiring = Math.sqrt(Math.pow(r,2) + Math.pow(tinggiKerucut,2));
        double luasSelimut = Math.PI * r * sisiMiring;
        return super.menghitungLuas(r) + luasSelimut;
    }
}
