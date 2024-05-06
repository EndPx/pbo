/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.util.Scanner;
import tugasakhir.G2D.*;
import tugasakhir.G3D.*;

/**
 *
 * @author abaym
 */
public class TugasAkhir {
    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuInput();
    }
    
    private static void displayMenu(){
        System.out.println("| Menu Bangun 2D Dan 3D |");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Belah Ketupat");
        System.out.println("7. Layang-Layang");
        System.out.println("8. Ellips");
        System.out.println("9. Lingkaran");
        System.out.println("10. Limas Segitiga");
        System.out.println("11. Prisma Segitiga");
        System.out.println("12. Kubus");
        System.out.println("13. Limas Persegi");
        System.out.println("14. Prisma Persegi");
        System.out.println("15. Balok");
        System.out.println("16. Limas Persegi Panjang");
        System.out.println("17. Prisma Persegi Panjang");
        System.out.println("18. Tabung");
        System.out.println("19. Bola");
        System.out.println("20. Kerucut");
        System.out.println("21. Tembereng");
        System.out.println("22. Juring");
        System.out.println("23. Cincin");
        System.out.println("24. Kerucut Terpancung");
        System.out.println("0. Exit");
    }
    
    private static void menuInput(){
        int pilihan = 0;

        displayMenu();
        System.out.print("Pilih bangun (1-24): ");
        try {
            pilihan = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            sc.nextLine();
        }
        switch (pilihan) {
            case 1:
                segitiga();
                break;
            case 2:
                persegi();
                break;
            case 3:
                persegiPanjang();
                break;
            case 4: 
                jajarGenjang();
                break;
            case 5:
                trapesium();
                break;
            case 6:
                belahKetupat();
                break;
            case 7:
                layangLayang();
                break;
            case 8:
                ellips();
                break;
            case 9:
                lingkaran();
                break;
            case 10:
                limasSegitiga();
                break;
            case 11:
                prismaSegitiga();
                break;
            case 12:
                kubus();
                break;
            case 13:
                limasPersegi();
                break;
            case 14:
                prismaPersegi();
                break;
            case 15:
                balok();
                break; 
            case 16:
                limasPersegiPanjang();
                break;
            case 17:
                prismaPersegiPanjang();
                break;
            case 18:
                tabung();
                break; 
            case 19:
                bola();
                break;
            case 20:
                kerucut();
                break;
            case 21:
                tembereng();
                break;
            case 22:
                juring();
                break;
            case 23:
                cincin();
                break;
            case 24:
                kerucutTerpancung();
                break;
            case 0:
                System.out.println("Keluar dari program.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
    
    private static void menuPersegi(){
        System.out.println("\n1. Kubus");
        System.out.println("2. Limas Persegi");
        System.out.println("3. Prisma Persegi");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.print("Pilihan: ");
    }
    
    private static void menuSegitiga(){
        System.out.println("\n1. Limas Segitiga");
        System.out.println("2. Prisma Persegi");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.print("Pilihan: ");
    }
    
    private static void menuLingkaran(){
        System.out.println("\n1. Tabung");
        System.out.println("2. Bola");
        System.out.println("3. Kerucut");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.print("Pilihan: ");
    }
    
    private static void menuPersegiPanjang(){
        System.out.println("\n1. Balok");
        System.out.println("2. Limas Persegi Panjang");
        System.out.println("3. Prisma Persegi Panjang");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.print("Pilihan: ");
    }
    
    private static void menuBola(){
        System.out.println("\n1. Tembereng");
        System.out.println("2. Juring");
        System.out.println("3. Cincin");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.print("Pilihan: ");
    }
    
    private static void menuKerucut(){
        System.out.println("\n1. Kerucut Terpancung");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.print("Pilihan: ");
    }
    
    private static void menuAkhir(){
        int i;
        System.out.print("\nKetik 1 jika mau kembali ke menu utama.  ? ");
        i = sc.nextInt();
        if(i==1){
            menuInput();
        }else{
            System.out.println("Keluar dari program.");
        }
    }
    
    private static void segitiga(){
        double alas, tinggi, luas;
        int i;
        System.out.print("\nMasukan alas segitiga: ");
        alas = sc.nextDouble();
        System.out.print("Masukan tinggi segitiga: ");
        tinggi = sc.nextDouble();
        Segitiga s3=new Segitiga(alas, tinggi);
        luas = s3.menghitungLuas();
        System.out.println("\nLuas Segitiga : " + luas);
        menuSegitiga();
        i = sc.nextInt();
        if(i==1){
            limasSegitiga(luas, alas, tinggi);
        }else if(i==2){
            prismaSegitiga(luas, alas, tinggi);
        }else{
            menuInput();
        }
    }
    
    private static void limasSegitiga(){
        double alas, tinggi, tinggiLimas;
        System.out.print("\nMasukkan alas segitiga: ");
        alas = sc.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = sc.nextDouble();
        System.out.print("Masukkan tinggi limas segitiga: ");
        tinggiLimas = sc.nextDouble();
        Limas3 l3=new Limas3(alas, tinggi, tinggiLimas);
        System.out.println("\nLuas Permukaan Limas Segitiga : " + l3.menghitungLuasPermukaan());
        System.out.println("Volume Limas Segitiga : " + l3.menghitungVolume());
        menuAkhir();
    }
    
    private static void limasSegitiga(double luasAlas, double alas, double tinggi){
        double tinggiLimas;
        System.out.print("\nMasukkan tinggi limas segitiga: ");
        tinggiLimas = sc.nextDouble();
        Limas3 l3=new Limas3(alas, tinggi, tinggiLimas);
        System.out.println("\nLuas Permukaan Limas Segitiga : " + l3.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Limas Segitiga : " + l3.menghitungVolume(luasAlas));
        menuAkhir();
    }
    
    private static void prismaSegitiga(){
        double alas, tinggi, tinggiPrisma;
        System.out.print("\nMasukkan alas segitiga: ");
        alas = sc.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = sc.nextDouble();
        System.out.print("Masukkan tinggi prisma segitiga: ");
        tinggiPrisma = sc.nextDouble();
        Prisma3 l3=new Prisma3(alas, tinggi, tinggiPrisma);
        System.out.println("\nLuas Permukaan Prisma Segitiga : " + l3.menghitungLuasPermukaan());
        System.out.println("Volume Prisma Segitiga : " + l3.menghitungVolume());
        menuAkhir();
    }
    
    private static void prismaSegitiga(double luasAlas, double alas, double tinggi){
        double tinggiPrisma;
        System.out.print("\nMasukkan tinggi Prisma segitiga: ");
        tinggiPrisma = sc.nextDouble();
        Prisma3 l3=new Prisma3(alas, tinggi, tinggiPrisma);
        System.out.println("\nLuas Permukaan Prisma Segitiga : " + l3.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Prisma Segitiga : " + l3.menghitungVolume(luasAlas));
        menuAkhir();
    }

    private static void persegi(){
        double sisi, luas;
        int i;
        System.out.print("\nMasukkan Panjang Sisi: ");
        sisi = sc.nextDouble();
        Persegi p4 = new Persegi(sisi);
        luas = p4.menghitungLuas();
        System.out.println("Luas Persegi : " + luas);
        menuPersegi();
        i = sc.nextInt();
        if(i==1){
            kubus(luas, sisi);
        }else if(i==2){
            limasPersegi(luas, sisi);
        }else if(i==3){
            prismaPersegi(luas, sisi);
        }else{
            menuInput();
        }
    }
    
    private static void kubus(){
        double sisi;
        System.out.print("Masukkan panjang sisi: ");
        sisi= sc.nextDouble();
        Kubus k4 = new Kubus(sisi);
        System.out.println("\nLuas Permukaan Kubus : " + k4.menghitungLuasPermukaan());
        System.out.println("Volume Kubus : " + k4.menghitungVolume());
        menuAkhir();
    }
    
    private static void kubus(double luasAlas, double sisi){
        Kubus k4=new Kubus(sisi);
        System.out.println("\nLuas Permukaan Kubus : " + k4.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Kubus : " + k4.menghitungVolume(luasAlas));
        menuAkhir();
    }
    
    private static void limasPersegi(){
        double tinggiLimas, sisi;
        System.out.print("Masukkan panjang sisi: ");
        sisi= sc.nextDouble();
        System.out.print("Masukkan tinggi limas: ");
        tinggiLimas = sc.nextDouble();
        LimasP l4 = new LimasP(sisi, tinggiLimas);
        System.out.println("\nLuas Permukaan Limas Persegi : " + l4.menghitungLuasPermukaan());
        System.out.println("Volume Limas Persegi : " + l4.menghitungVolume());
        menuAkhir();
    }
    
    private static void limasPersegi(double luasAlas, double sisi){
        double tinggiLimas;
        System.out.print("Masukkan tinggi limas : ");
        tinggiLimas = sc.nextDouble();
        LimasP l4 = new LimasP(sisi, tinggiLimas);
        System.out.println("\nLuas Permukaan Limas Persegi : " + l4.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Limas Persegi : " + l4.menghitungVolume(luasAlas));
        menuAkhir();
    }
    
    private static void prismaPersegi(){
        double tinggiPrisma,sisi;
        System.out.print("Masukkan panjang sisi : ");
        sisi= sc.nextDouble();
        System.out.print("Masukkan tinggi Prisma : ");
        tinggiPrisma = sc.nextDouble();
        PrismaP p4= new PrismaP(sisi, tinggiPrisma);
        System.out.println("\nLuas Permukaan Prisma Persegi : " + p4.menghitungLuasPermukaan());
        System.out.println("Volume Prisma Persegi : " + p4.menghitungVolume());
        menuAkhir();
    }
    
    private static void prismaPersegi(double luasAlas, double sisi){
        double tinggiPrisma;
        System.out.print("Masukkan tinggi Prisma : ");
        tinggiPrisma = sc.nextDouble();
        PrismaP p4= new PrismaP(sisi, tinggiPrisma);
        System.out.println("\nLuas Permukaan Prisma Persegi : " + p4.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Prisma Persegi : " + p4.menghitungVolume(luasAlas));
        menuAkhir();
    }
    
    private static void persegiPanjang(){
        double panjang, lebar, luas;
        int i;
        System.out.print("Masukkan panjang persegi panjang : ");
        panjang = sc.nextDouble();
        System.out.print("Masukkan lebar persegi panjang : ");
        lebar = sc.nextDouble();
        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
        luas = pp.menghitungLuas();
        System.out.println("\nLuas Persegi Panjang : " + luas);
        menuPersegiPanjang();
        i = sc.nextInt();
        if(i==1){
            balok(luas, lebar, panjang);
        }else if(i==2){
            limasPersegiPanjang(luas, lebar, panjang);
        }else if(i==3){
            prismaPersegiPanjang(luas, lebar, panjang);
        }else{
            menuInput();
        }
    }
    
    private static void balok(){
        double panjang, lebar, tinggiBalok;
        System.out.print("Masukkan panjang persegi panjang : ");
        panjang = sc.nextDouble();
        System.out.print("Masukkan lebar persegi panjang : ");
        lebar = sc.nextDouble();
        System.out.print("Masukkan tinggi balok : ");
        tinggiBalok=sc.nextDouble();
        Balok b=new Balok(panjang, lebar, tinggiBalok);
        System.out.println("\nLuas Permukaan Balok : " + b.menghitungLuasPermukaan());
        System.out.println("Volume Balok : " + b.menghitungVolume());
        menuAkhir();
    }
    
    private static void balok(double luas, double panjang, double lebar){
        double tinggiBalok;
        System.out.print("Masukkan tinggi balok : ");
        tinggiBalok=sc.nextDouble();
        Balok b=new Balok(panjang, lebar, tinggiBalok);
        System.out.println("\nLuas Permukaan Balok : " + b.menghitungLuasPermukaan(luas));
        System.out.println("Volume Balok : " + b.menghitungVolume(luas));
        menuAkhir();
    }
    
    private static void limasPersegiPanjang(){
        double panjang, lebar, tinggiLimas;
        System.out.print("Masukkan panjang persegi panjang : ");
        panjang = sc.nextDouble();
        System.out.print("Masukkan lebar persegi panjang : ");
        lebar = sc.nextDouble();
        System.out.print("Masukkan tinggi limas");
        tinggiLimas=sc.nextDouble();
        LimasPP LPP=new LimasPP(panjang, lebar, tinggiLimas);
        System.out.println("\nLuas Permukaan Limas persegi panjang : " + LPP.menghitungLuasPermukaan());
        System.out.println("Volume Limas persegi panjang : " + LPP.menghitungVolume());
        menuAkhir();
    }
    
    private static void limasPersegiPanjang(double luasAlas, double panjang, double lebar){
        double tinggiLimas;
        System.out.print("Masukkan tinggi limas persegi panjang : ");
        tinggiLimas=sc.nextDouble();
        LimasPP LPP=new LimasPP(panjang, lebar, tinggiLimas);
        System.out.println("\nLuas Permukaan Limas persegi panjang : " + LPP.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Limas persegi panjang : " + LPP.menghitungVolume(luasAlas));
        menuAkhir();
    }
    
    private static void prismaPersegiPanjang(){
        double panjang, lebar, tinggiPrisma;
        System.out.print("Masukkan panjang persegi panjang : ");
        panjang = sc.nextDouble();
        System.out.print("Masukkan lebar persegi panjang : ");
        lebar = sc.nextDouble();
        System.out.print("Masukkan tinggi prisma persegi panjang : ");
        tinggiPrisma=sc.nextDouble();
        PrismaPP PPP=new PrismaPP(panjang, lebar, tinggiPrisma);
        System.out.println("\nLuas Permukaan Prisma persegi panjang : " + PPP.menghitungLuasPermukaan());
        System.out.println("Volume Prisma persegi panjang : " + PPP.menghitungVolume());
        menuAkhir();
    }
    
    private static void prismaPersegiPanjang(double luasAlas, double panjang, double lebar){
        double tinggiPrisma;
        System.out.print("Masukkan tinggi prisma persegi panjang : ");
        tinggiPrisma=sc.nextDouble();
        PrismaPP PPP=new PrismaPP(panjang, lebar, tinggiPrisma);
        System.out.println("\nLuas Permukaan Prisma persegi panjang : " + PPP.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Prisma persegi panjang : " + PPP.menghitungVolume(luasAlas));
        menuAkhir();
    }
    
    private static void jajarGenjang(){
        double alas, tinggi;
        System.out.print("\nMasukkan alas jajar genjang: ");
        alas = sc.nextDouble();
        System.out.print("Masukkan tinggi jajar genjang: ");
        tinggi = sc.nextDouble();
        JajarGenjang jg = new JajarGenjang(alas, tinggi);
        System.out.println("\nLuas Jajar Genjang: " + jg.menghitungLuas());
        menuAkhir();
    }

    private static void trapesium(){
        double alasBawah, alasAtas, tinggi;
        System.out.print("Masukkan alas bawah trapesium: ");
        alasBawah=sc.nextDouble();
        System.out.print("Masukkan alas atas trapesium: ");
        alasAtas=sc.nextDouble();
        System.out.print("Masukkan tinggi trapesium: ");
        tinggi=sc.nextDouble();
        Trapesium t=new Trapesium(alasBawah, alasAtas, tinggi);
        System.out.println("\nLuas Trapesium: " + t.menghitungLuas());
        menuAkhir();
    }
    
    private static void belahKetupat(){
        double d1, d2;
        System.out.print("Masukkan Diagonal 1: ");
        d1=sc.nextDouble();
        System.out.print("Masukkan Diagonal 2: ");
        d2=sc.nextDouble();
        BelahKetupat bk=new BelahKetupat(d1, d2);
        System.out.println("\nLuas Belah Ketupat : " + bk.menghitungLuas());
        menuAkhir();
    }
    
    private static void layangLayang(){
        double d1, d2;
        System.out.print("Masukkan Diagonal 1: ");
        d1=sc.nextDouble();
        System.out.print("Masukkan Diagonal 2: ");
        d2=sc.nextDouble();
        LayangLayang ll=new LayangLayang(d1, d2);
        System.out.println("\nLuas Layang-Layang : " + ll.menghitungLuas());
        menuAkhir();
    }
    
    private static void ellips(){
        double sumbuMayor, sumbuMinor;
        System.out.print("Masukkan sumbu mayor: ");
        sumbuMayor=sc.nextDouble();
        System.out.print("Masukkan sumbu minor: ");
        sumbuMinor=sc.nextDouble();
        Ellips e=new Ellips(sumbuMayor, sumbuMinor);
        System.out.println("\nLuas Ellips : " + e.menghitungLuas());
        menuAkhir();
    }
    
    private static void lingkaran(){
        double jariJari, luas;
        int i;
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        jariJari=sc.nextDouble();
        Lingkaran l=new Lingkaran(jariJari);
        luas=l.menghitungLuas();
        System.out.println("\nLuas Lingkaran : " + luas);
        menuLingkaran();
        i = sc.nextInt();
        if(i==1){
            tabung(luas, jariJari);
        }else if(i==2){
            bola(luas, jariJari);
        }else if(i==3){
            kerucut(luas, jariJari);
        }else{
            menuInput();
        }
    }
    
    private static void tabung(){
        double jariJari, tinggiTabung;
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        jariJari=sc.nextDouble();
        System.out.print("Masukkan Tinggi Tabung: ");
        tinggiTabung=sc.nextDouble();
        Tabung t=new Tabung(jariJari, tinggiTabung);
        System.out.println("\nLuas Permukaan Tabung : " + t.menghitungLuasPermukaan());
        System.out.println("Volume Tabung : " + t.menghitungVolume());
        menuAkhir();
    }
    
    private static void tabung(double luasAlas, double jariJari){
        double tinggiTabung;
        System.out.print("Masukkan Tinggi Tabung: ");
        tinggiTabung=sc.nextDouble();
        Tabung t=new Tabung(jariJari, tinggiTabung);
        System.out.println("\nLuas Permukaan Tabung : " + t.menghitungLuasPermukaan());
        System.out.println("Volume Tabung : " + t.menghitungVolume(luasAlas));
        menuAkhir();
    }
    
    private static void bola(){
        double jariJari, luasLingkaran;
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        jariJari=sc.nextDouble();
        Bola b=new Bola(jariJari);
        double luasPermukaanBola=b.menghitungLuasPermukaan();
        double volumeBola=b.menghitungVolume();
        System.out.println("\nLuas Permukaan Bola : " + luasPermukaanBola);
        System.out.println("Volume Bola : " + volumeBola);
        int i;
        menuBola();
        i=sc.nextInt();
        if(i==1){
        }else if(i==2){
        }else if(i==3){
        }else{
            menuInput();
        }
    }
    
    private static void bola(double luasLingkaran, double jariJari){
        int i;
        Bola b=new Bola(jariJari);
        double luasPermukaanBola=b.menghitungLuasPermukaan(luasLingkaran);
        double volumeBola=b.menghitungVolume();
        System.out.println("\nLuas Permukaan Bola : " + luasPermukaanBola);
        System.out.println("Volume Bola : " + volumeBola);
        menuBola();
        i=sc.nextInt();
        if(i==1){
            tembereng();
        }else if(i==2){
            juring(luasPermukaanBola, volumeBola, jariJari);
        }else if(i==3){
            cincin(luasLingkaran, jariJari);
        }else{
            menuInput();
        }
    }
    
    private static void tembereng(){
        menuAkhir();
    }
    
    private static void juring(){
        double jariJari, sudut;
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        jariJari=sc.nextDouble();
        System.out.print("Masukkan sudut derajat juring(0-360)");
        sudut=sc.nextDouble();
        Juring j=new Juring(jariJari, sudut);
        System.out.println("\nLuas Permukaan Juring : " + j.menghitungLuasPermukaan());
        System.out.println("Volume Juring : " + j.menghitungVolume());
        menuAkhir();
    }
    
    private static void juring(double luasPermukaanBola, double volumeBola, double jariJari){
        double sudut;
        System.out.print("Masukkan sudut derajat juring(0-360)");
        sudut=sc.nextDouble();
        Juring j=new Juring(jariJari, sudut);
        System.out.println("\nLuas Permukaan Juring : " + j.menghitungLuasPermukaan(luasPermukaanBola));
        System.out.println("Volume Juring : " + j.menghitungVolume(volumeBola));
        menuAkhir();
    }
    
    private static void cincin(){
        double jariJari, tinggiCincin, jariJariDalam;
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        jariJari=sc.nextDouble();
        System.out.print("Masukkan tinggi cincin : ");
        tinggiCincin=sc.nextDouble();
        System.out.print("Masukkan jari-jari Dalam cincin : ");
        jariJariDalam=sc.nextDouble();
        Cincin c=new Cincin(jariJari, tinggiCincin, jariJariDalam);
        System.out.println("\nLuas Permukaan Cincin : " + c.menghitungLuasPermukaan());
        System.out.println("Volume Cincin : " + c.menghitungVolume());
        menuAkhir();
    }
    
    private static void cincin(double luasLingkaran, double jariJari){
        double tinggiCincin, jariJariDalam;
        System.out.print("Masukkan tinggi cincin : ");
        tinggiCincin=sc.nextDouble();
        System.out.print("Masukkan jari-jari Dalam cincin : ");
        jariJariDalam=sc.nextDouble();
        Cincin c=new Cincin(jariJari, tinggiCincin, jariJariDalam);
        System.out.println("\nLuas Permukaan Cincin : " + c.menghitungLuasPermukaan(luasLingkaran));
        System.out.println("Volume Cincin : " + c.menghitungVolume(luasLingkaran));
        menuAkhir();
    }
    
    private static void kerucut(){
        double jariJari, tinggiKerucut, luasAlas;
        int i;
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        jariJari=sc.nextDouble();
        System.out.print("Masukkan Tinggi Kerucut: ");
        tinggiKerucut=sc.nextDouble();
        Kerucut k=new Kerucut(jariJari, tinggiKerucut);
        luasAlas=k.menghitungLuas();
        System.out.println("\nLuas Permukaan Kerucut : " + k.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Kerucut : " + k.menghitungVolume());
        menuKerucut();
        i=sc.nextInt();
        if(i==1){
            kerucutTerpancung(luasAlas, jariJari, tinggiKerucut);
        }else{
            menuInput();
        }
    }
    
    private static void kerucut(double luasAlas, double jariJari){
        double tinggiKerucut;
        int i;
        System.out.print("Masukkan Tinggi Kerucut: ");
        tinggiKerucut=sc.nextDouble();
        Kerucut k=new Kerucut(jariJari, tinggiKerucut);
        System.out.println("\nLuas Permukaan Kerucut : " + k.menghitungLuasPermukaan(luasAlas));
        System.out.println("Volume Kerucut : " + k.menghitungVolume(luasAlas));
        menuKerucut();
        i=sc.nextInt();
        if(i==1){
            kerucutTerpancung(luasAlas, jariJari, tinggiKerucut);
        }else{
            menuInput();
        }
    }
    
    private static void kerucutTerpancung(){
        double jariJariBawah, jariJariAtas, tinggiKerucut;
        System.out.print("Masukkan Jari-Jari Lingkaran Alas Bawah: ");
        jariJariBawah=sc.nextDouble();
        System.out.print("Masukkan Jari-Jari Lingkaran Alas Atas: ");
        jariJariAtas=sc.nextDouble();
        System.out.print("Masukkan Tinggi Kerucut Terpancung: ");
        tinggiKerucut=sc.nextDouble();
        KerucutTerpancung kt=new KerucutTerpancung(jariJariBawah, tinggiKerucut, jariJariAtas);
        System.out.println("\nLuas Permukaan Kerucut Terpancung : " + kt.menghitungLuasPermukaan());
        System.out.println("Volume Kerucut Terpancung : " + kt.menghitungVolume());
        menuAkhir();
    }
    
    private static void kerucutTerpancung(double luasAlasBawah, double jariJariBawah, double tinggiKerucut){
        double jariJariAtas, tinggiKerucutTerpancung;
        System.out.print("Masukkan Jari-Jari Lingkaran Alas Atas: ");
        jariJariAtas=sc.nextDouble();
        System.out.print("Masukkan Tinggi Kerucut Terpancung: ");
        tinggiKerucutTerpancung=sc.nextDouble();
        KerucutTerpancung kt=new KerucutTerpancung(jariJariBawah, tinggiKerucut, jariJariAtas);
        System.out.println("\nLuas Permukaan Kerucut Terpancung : " + kt.menghitungLuasPermukaan(luasAlasBawah));
        System.out.println("Volume Kerucut Terpancung : " + kt.menghitungVolume());
        menuAkhir();
    }
}
