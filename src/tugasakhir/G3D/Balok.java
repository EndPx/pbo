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
    
    public Balok(double panjang,double lebar,double tinggiBalok) {
        super(panjang,lebar);
        this.tinggiBalok = tinggiBalok;
    }
    
    @Override
    public double menghitungVolume() {
        return PersegiPanjang.luasPersegiPanjang * tinggiBalok;
    }
    
    public double menghitungVolume(double panjang, double lebar){
        return super.menghitungLuas(panjang, lebar) * tinggiBalok;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasPPbawah = PersegiPanjang.luasPersegiPanjang;
        double luasSelimut1 = 2 * luasPPbawah;
        double luasPPsamping = super.lebar * tinggiBalok;
        double luasSelimut2 = 2 * luasPPsamping;
        double luasPPdepan = super.panjang * tinggiBalok;
        double luasSelimut3 = 2 * luasPPdepan;
        return luasSelimut1 + luasSelimut2 + luasSelimut3;
    }

    public double menghitungLuasPermukaan(double panjang, double lebar) {
        double luasSelimut1 = 2 * menghitungLuas(panjang, lebar);
        double luasPPsamping = super.lebar * tinggiBalok;
        double luasSelimut2 = 2 * luasPPsamping;
        double luasPPdepan = super.panjang * tinggiBalok;
        double luasSelimut3 = 2 * luasPPdepan;
        return luasSelimut1 + luasSelimut2 + luasSelimut3;
    }

}
