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
        return (sudut/360) * super.menghitungVolume();
    }
    
    public double menghitungVolume(double volumeBola) {
        return (sudut/360) * volumeBola;
    }

    @Override
    public double menghitungLuasPermukaan() {
        return (sudut/360) * super.menghitungLuasPermukaan();
    }
    
    public double menghitungLuasPermukaan(double luasPermukaanBola) {
        return (sudut/360) * luasPermukaanBola;
    }
}
