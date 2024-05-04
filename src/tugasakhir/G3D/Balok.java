/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;
import tugasakhir.Benda3D;
import tugasakhir.G2D.PersegiPanjang;
/**
 *
 * @author abaym
 */
public class Balok extends PersegiPanjang implements Benda3D {

    private double tinggiBalok;
    
    public Kubus(double panjang,double lebar,double tinggiBalok) {
        super(panjang,lebar);
        this.tinggiBalok = tinggiBalok;
    }
    
    @Override
    public double menghitungVolume() {
        return menghitungLuas() * tinggiBalok;
    }
    
    public double menghitungVolume(double luasAlas){
        return luasAlas * tinggiBalok;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasPPbawah = super.menghitungLuas();
        double luasSelimut = 4 * luasPPbawah;
        double luasPPsamping = super.getLebar() * tinggiBalok;
        double luasPenutup = 2 * luasPPsamping;
        return luasSelimut + luasPenutup;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double luasPPbawah = super.menghitungLuas();
        double luasSelimut = 4 * luasPPbawah;
        double luasPPsamping = super.getLebar() * tinggiBalok;
        double luasPenutup = 2 * luasPPsamping;
        return luasSelimut + luasPenutup;
    }

}
