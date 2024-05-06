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
    public Bola(double jariJari) {
        super(jariJari);
    }
    @Override
    public double menghitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(super.getJariJari(), 3);
    }
    
    public double menghitungVolume(double luasLingkaran){
        return (4.0 / 3.0) * luasLingkaran * super.getJariJari();
    }
    
    @Override
    public double menghitungLuasPermukaan() {
        return 4 * menghitungLuas();
    }
    
    public double menghitungLuasPermukaan(double luasLingkaran){
        return 4 * luasLingkaran;
    }
}
