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
public class KerucutTerpancung extends Kerucut implements Benda3D {

  public double jarijariKecil, tinggiKerucutKecil;
  public static double volumeKerucutTerpancung;
  public static double luasPermukaanKerucutTerpancung;

  public KerucutTerpancung(double jariJari, double tinggiKerucut, double jarijariKecil, double tinggiKerucutKecil) {
    super(jariJari, tinggiKerucut);
    this.jarijariKecil = jarijariKecil;
    this.tinggiKerucutKecil = tinggiKerucutKecil;
  }

  @Override
  public double menghitungVolume() {
    //volumeKerucutTerpancung = Kerucut.volumeKerucut + super.getJariJari() * jarijariKecil + Math.pow(jarijariKecil, 2);
    volumeKerucutTerpancung = Kerucut.volumeKerucut - super.menghitungVolume(jarijariKecil, tinggiKerucutKecil);
    return volumeKerucutTerpancung;
  }

  public double menghitungVolume(double jarijariBesar, double T, double jarijariKecil, double t) {
    //return super.menghitungVolume(jarijariBesar, T) + jarijariBesar * jarijariKecil + Math.pow(jarijariKecil, 2);
    return super.menghitungVolume(jarijariBesar,T) - super.menghitungVolume(jarijariKecil, t);
  }

  @Override
  public double menghitungLuasPermukaan() {

    luasPermukaanKerucutTerpancung = Kerucut.luasPermukaanKerucut - super.menghitungLuasPermukaan(jarijariKecil, tinggiKerucutKecil) + super.menghitungLuas(jarijariKecil);
    return luasPermukaanKerucutTerpancung;
  }

  public double menghitungLuasPermukaan(double jarijariBesar, double T , double jarijariKecil, double t) {
    return super.menghitungLuasPermukaan(jarijariBesar, T) - super.menghitungLuasPermukaan(jarijariKecil, t) + super.menghitungLuas(jarijariKecil);
  }
}
