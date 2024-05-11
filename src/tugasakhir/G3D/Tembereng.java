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

public class Tembereng extends Bola implements Benda3D{
    
    private double tinggiTembereng;
    private double sudutTembereng;
    
    public Tembereng(double jariJari, double tinggiTembereng, double sudutTembereng) {
        super(jariJari);
        this.tinggiTembereng = tinggiTembereng;
        this.sudutTembereng = sudutTembereng;
    }
    

    @Override
    public double menghitungVolume() {
        return (sudutTembereng/360.0) * (super.volumeBola - (1 / 3) * Math.PI * Math.pow(super.getJariJari(), 2));
    }
    public double menghitungVolume(double r) {
        return (sudutTembereng/360.0) * (super.menghitungVolume(r) - (1 / 3) * Math.PI * Math.pow(super.getJariJari(), 2));
    }


    @Override
    public double menghitungLuasPermukaan() {
        return (sudutTembereng/360.0) * (super.luasPermukaanBola - Math.PI * Math.pow(super.getJariJari(), 2));
    }
    public double menghitungLuasPermukaan(double r) {
        return (sudutTembereng/360.0) * (super.menghitungLuasPermukaan(r) - Math.PI * Math.pow(super.getJariJari(), 2));
    }
}
