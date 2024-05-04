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
    public Kubus(double panjang,double lebar) {
        super(panjang,lebar);
    }
    @Override
    public double menghitungVolume() {
        return Math.pow(super.getSisi(), 3);
    }
    
    public double menghitungVolume(double luasAlas){
        return luasAlas*super.getSisi();
    }

}
