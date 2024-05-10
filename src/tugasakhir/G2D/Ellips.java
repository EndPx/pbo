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
public class Ellips implements Benda2D {
    private double sumbuMayor;
    private double sumbuMinor;
    public Ellips(double sumbuMayor, double sumbuMinor) {
        this.sumbuMayor = sumbuMayor;
        this.sumbuMinor = sumbuMinor;
    }

    @Override
    public double menghitungLuas() {
        return Math.PI * (sumbuMayor/2) * (sumbuMinor/2);
    }

    @Override
    public double menghitungKeliling() {
        return Math.PI * Math.sqrt(2 * (sumbuMayor/2) * (sumbuMayor/2) + (sumbuMinor/2) * (sumbuMinor/2));
    }
}
