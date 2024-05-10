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
public class Bola extends Lingkaran implements Benda3D{
    public static double luasPermukaanBola;
    public static double volumeBola;
    public Bola(double jariJari) {
        super(jariJari);
    }
    @Override
    public double menghitungVolume() {
        volumeBola = (4.0 / 3.0) * Lingkaran.luasLingkaran * super.jariJari;
        return volumeBola;
    }
    
    public double menghitungVolume(double r){
        return (4.0 / 3.0) * menghitungLuas(r) * r;
    }
    
    @Override
    public double menghitungLuasPermukaan() {
        luasPermukaanBola = 4 * Lingkaran.luasLingkaran;
        return luasPermukaanBola;
    }
    
    public double menghitungLuasPermukaan(double r){
        return 4 * menghitungLuas(r);
    }
}
