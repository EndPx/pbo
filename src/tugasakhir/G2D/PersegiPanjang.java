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
    public double panjang;
    public double lebar;
    public static double luasPersegiPanjang;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double menghitungLuas() {
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }
    
    public double menghitungLuas(double panjang, double lebar){
        return panjang * lebar;
    }
    
    public double menghitungKeliling(double panjang, double lebar){
        return 2 *(panjang + lebar);
    }
}
