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

    private double tinggiKerucut;
    
    public Tabung(double jariJari, double tinggiKerucut) {
        super(jariJari);
        this.tinggiKerucut = tinggiKerucut;
    }

     @Override
    public double menghitungVolume() {
        return (1.0/3) * menghitungLuas() * tinggiKerucut;
    }

    public double menghitungVolume(double luasAlas) {
        return (1.0/3) * luasAlas * tinggiKerucut;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double sisiMiring = Math.sqrt(Math.pow(super.getJariJari(),2) + Math.pow(tinggiKerucut,2));
        double luasSelimut = Math.PI * super.getJariJari() * sisiMiring;
        return super.menghitungLuas() + luasSelimut;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double sisiMiring = Math.sqrt(Math.pow(super.getJariJari(),2) + Math.pow(tinggiKerucut,2));
        double luasSelimut = Math.PI * super.getJariJari() * sisiMiring;
        return luasAlas + luasSelimut;
    }
}
