
package buoi5_bai3;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String Hoten;

    public QuanLy() {
    }

    public QuanLy(String MaQL, String Hoten) {
        this.MaQL = MaQL;
        this.Hoten = Hoten;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma quan ly: ");
        MaQL = sc.nextLine();
        System.out.printf("Nhap ho ten: ");
        Hoten = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma QL: " + MaQL );
        System.out.println("Ho ten: " + Hoten);
    }
}
