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
public class Cincin extends Bola implements Benda3D {

    private double jarijariKecil;
    private double sudutCincin;
    
    public Cincin(double jariJari, double jarijariKecil, double sudutCincin) {
        super(jariJari);
        this.sudutCincin = sudutCincin;
        this.jarijariKecil = jarijariKecil;
    }

     @Override
    public double menghitungVolume() {
        return (sudutCincin / 360.0) * (Bola.volumeBola - super.menghitungVolume(jarijariKecil));
    }

    public double menghitungVolume(double sudutCincin, double r, double jarijariKecil) {
        return (sudutCincin / 360.0) * (super.menghitungVolume(r) - super.menghitungVolume(jarijariKecil));
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasPermukaan = (sudutCincin / 360.0) * (Bola.luasPermukaanBola - super.menghitungLuasPermukaan(jarijariKecil));
        return luasPermukaan;
    }

    public double menghitungLuasPermukaan(double sudutCincin, double jariJari, double jarijariKecil) {
        double luasPermukaan = (sudutCincin / 360.0) * (super.menghitungLuasPermukaan(jariJari) - super.menghitungLuasPermukaan(jarijariKecil));
        return luasPermukaan;
    }
}
