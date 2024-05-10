/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;
import tugasakhir.Benda3D;
/**
 *
 * @author abaym
 */
public class Juring extends Bola implements Benda3D {
    private double sudut;
    public Juring(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }
    
    @Override
    public double menghitungVolume() {
        return (sudut/360.0) * super.volumeBola;
    }
    
    public double menghitungVolume(double r) {
        return (sudut/360.0) * super.menghitungVolume(r);
    }

    @Override
    public double menghitungLuasPermukaan() {
        return (sudut/360.0) * super.luasPermukaanBola;
    }
    
    public double menghitungLuasPermukaan(double r) {
        return (sudut/360.0) * super.menghitungLuasPermukaan(r);
    }
}
