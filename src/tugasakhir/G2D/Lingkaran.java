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
    private double luas;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double getJariJari(){
        return jariJari;
    }
    public double getLuas(){
        return luas;
    }
    
    @Override
    public double menghitungLuas() {
        luas = Math.PI * Math.pow(jariJari, 2);
        return luas;
    }
    
}
