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
public class BelahKetupat implements Benda2D {
    private double d1;
    private double d2;
    public BelahKetupat(double d1, double d2) {
        this.d1=d1;
        this.d2=d2;
    }

    @Override
    public double menghitungLuas() {
        return 0.5 * this.d1 * this.d2;
    }
}
