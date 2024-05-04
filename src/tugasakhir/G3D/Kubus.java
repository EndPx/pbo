/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;

import tugasakhir.Benda3D;
import tugasakhir.G2D.Persegi;

/**
 *
 * @author abaym
 */
public class Kubus extends Persegi implements Benda3D {
    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public double menghitungVolume() {
        return Math.pow(super.getSisi(), 3);
    }
    
    public double menghitungVolume(double luasAlas){
        return luasAlas*super.getSisi();
    }

    @Override
    public double menghitungLuasPermukaan() {
        return 6 * super.menghitungLuas();
    }
    
    public double menghitungLuasPermukaan(double luasAlas) {
        return 6 * luasAlas;
    }
}
