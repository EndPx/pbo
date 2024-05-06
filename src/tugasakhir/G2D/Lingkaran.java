/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G2D;

import tugasakhir.Benda2D;

/**
 *
 * @author abaym
 */
public class Lingkaran implements Benda2D {
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double getJariJari(){
        return jariJari;
    }
    
    @Override
    public double menghitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }
    
    public double menghitungLuas(double r){
        return Math.PI * Math.pow(r, 2);
    }
    
}
