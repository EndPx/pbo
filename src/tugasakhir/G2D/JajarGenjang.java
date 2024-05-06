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
public class JajarGenjang implements Benda2D{
    private double alas;
    private double tinggi;
    public JajarGenjang(double alas, double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }
    
    @Override
    public double menghitungLuas() {
        return alas * tinggi;
    }
    
}
