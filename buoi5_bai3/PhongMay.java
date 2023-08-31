
package buoi5_bai3;

import java.util.Scanner;

public class PhongMay {
   private String MaPhong;
   private String TenPhong;
   private double DienTich;
   private QuanLy x = new QuanLy();
   private int n;
   private May[] y;

    public PhongMay() {
    }

    public PhongMay(String MaPhong, String TenPhong, double DienTich, int n, May[] y) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.n = n;
        this.y = y;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double DienTich) {
        this.DienTich = DienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }
    
   public void Nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.printf("Nhap ma phong: ");
       MaPhong = sc.nextLine();
       System.out.printf("Nhap ten phong: ");
       TenPhong = sc.nextLine();
       System.out.printf("Nhap dien tich:  ");
       DienTich = sc.nextDouble();
       sc.nextLine();
       x.Nhap();
       System.out.printf("Nhap so luong may: ");
       n= sc.nextInt();
       May[] y = new May[n];
       for(int i=0; i<n ; i++){
           System.out.println("Nhap thong tin may thu" +(i+1) + ": ");
           May a = new May();
           a.Nhap();
           y[i] =a;
       }
   }
    public void Xuat(){
        System.out.println("Ma phong: " + MaPhong );
        System.out.println("Ten phong: " + TenPhong );
        System.out.println("Dien tich: " + DienTich );
        x.xuat();
        System.out.printf("%-20s %-20s %-20s" , "Ma May" , "Ten May" , "Tinh Trang" );
        System.out.println(" ");
        for ( int i=0 ; i< n ; i++){
            y[i].Xuat();
        }
   }
   
}
