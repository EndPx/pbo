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
public class LimasPP extends PersegiPanjang implements Benda3D {

    private double tinggiLimasPP;

    public LimasPP(double panjang, double lebar, double tinggiLimasPP) {
        super(panjang,lebar);
        this.tinggiLimasPP = tinggiLimasPP;
    }

    @Override
    public double menghitungVolume() {
        return (1.0 / 3) * menghitungLuas() * tinggiLimasPP;
    }

    public double menghitungVolume(double luasAlas) {
        return (1.0 / 3) * luasAlas * tinggiLimasPP;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double sisiTegak1 = Math.sqrt(Math.pow(0.5 * super.getPanjang(),2) + Math.pow(tinggiLimasPP,2));
        double luasSelimut1 = 0.5 * sisiTegak1 * super.getPanjang() * 2;
        double sisiTegak2 = Math.sqrt(Math.pow(0.5 * super.getLebar(),2) + Math.pow(tinggiLimasPP,2));
        double luasSelimut2 = 0.5 * sisiTegak2 * super.getLebar() * 2;
        return super.menghitungLuas() + luasSelimut1 + luasSelimut2;
    }

    public double menghitungLuasPermukaan(double luasAlas) {
        double sisiTegak1 = Math.sqrt(Math.pow(0.5 * super.getPanjang(),2) + Math.pow(tinggiLimasPP,2));
        double luasSelimut1 = 0.5 * sisiTegak1 * super.getPanjang() * 2;
        double sisiTegak2 = Math.sqrt(Math.pow(0.5 * super.getLebar(),2) + Math.pow(tinggiLimasPP,2));
        double luasSelimut2 = 0.5 * sisiTegak2 * super.getLebar() * 2;
        return luasAlas + luasSelimut1 + luasSelimut2;
    }
}
