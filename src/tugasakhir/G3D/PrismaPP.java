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
public class PrismaPP extends PersegiPanjang implements Benda3D{

    private double tinggiPrismaPP;
    
    public PrismaPP(double panjang,double lebar,double tinggiPrismaPP) {
        super(panjang,lebar);
        this.tinggiPrismaPP = tinggiPrismaPP;
    }

    @Override
    public double menghitungVolume() {
        return PersegiPanjang.luasPersegiPanjang * tinggiPrismaPP;
    }
    
    public double menghitungVolume(double panjang, double lebar){
        return super.menghitungLuas(panjang, lebar) * tinggiPrismaPP;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasAlas = PersegiPanjang.luasPersegiPanjang;
        double luasSelimut1 = 2 * luasAlas;
        double luasSamping = super.lebar * tinggiPrismaPP;
        double luasSelimut2 = 2 * luasSamping;
        double luasDepan = super.panjang * tinggiPrismaPP;
        double luasSelimut3 = 2 * luasDepan;
        return luasSelimut1 + luasSelimut2 + luasSelimut3;
    }

    public double menghitungLuasPermukaan(double panjang, double lebar) {
        double luasSelimut1 = 2 * menghitungLuas(panjang, lebar);
        double luasSamping = super.lebar * tinggiPrismaPP;
        double luasSelimut2 = 2 * luasSamping;
        double luasDepan = super.panjang * tinggiPrismaPP;
        double luasSelimut3 = 2 * luasDepan;
        return luasSelimut1 + luasSelimut2 + luasSelimut3;
    }
    
}
