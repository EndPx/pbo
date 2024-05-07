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

public class Tembereng extends Bola implements Benda3D{
    
    private double tinggiTembereng;
    
    public Tembereng(double jariJari, double tinggiTembereng) {
        super(jariJari);
        this.tinggiTembereng = tinggiTembereng;
    }
    

    @Override
    public double menghitungVolume() {
        return 1 / 3 * Math.PI * Math.pow(tinggiTembereng, 2) * (3 * super.getJariJari() - tinggiTembereng);
    }

    @Override
    public double menghitungLuasPermukaan() {
        return 2 * Math.PI * getJariJari() * (getJariJari() + tinggi);
    }
}
