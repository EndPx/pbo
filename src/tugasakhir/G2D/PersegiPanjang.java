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
public class PersegiPanjang implements Benda2D {

    private double panjang;
    private double lebar;
    private double luas;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar
    }
    public double getLuas(){
        return luas;
    }
    
    @Override
    public double menghitungLuas() {
        luas = panjang * lebar;
        return luas;
    }
    
}
