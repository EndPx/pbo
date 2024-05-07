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

public class Tembereng implements Benda3D{
    public Tembereng(double jariJari) {
        this.jariJari = jariJari;
    }
    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double menghitungVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(getJariJari(), 3);
    }

    @Override
    public double menghitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(getJariJari(), 2);
    }
}
