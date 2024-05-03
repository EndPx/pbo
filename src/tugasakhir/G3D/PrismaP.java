/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G3D;

import tugasakhir.Benda3D;
import tugasakhir.G2D.Persegi;

/**
 *
 * @author abaym
 */
public class PrismaP extends Persegi implements Benda3D {

    public PrismaP(double sisi) {
        super(sisi);
    }

    @Override
    public double menghitungVolume() {
        return Math.pow(super.getSisi(), 3);
    }

    @Override
    public double menghitungLuasPermukaan() {
        return 6 * super.menghitungLuas();
    }
}
