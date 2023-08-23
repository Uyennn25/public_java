
package btvnBuoi4_bai1;
import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String NSX;
    private int namSB;
    
    public Sach(){
        
    }

    public Sach(int id, String tenSach, String tacGia, String NSX, int namSB) {
        this.maSach = "SV" + String.format("%003d", id);
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.NSX = NSX;
        this.namSB = namSB;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public int getNamSB() {
        return namSB;
    }

    public void setNamSB(int namSB) {
        this.namSB = namSB;
    }
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        NSX = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        namSB = sc.nextInt();
        
    }
    public void xuatThongTin(){
        System.out.printf("\n");
        System.out.printf("%-15s %-30s %-20s %-20s %-10s",maSach, tenSach, tacGia, NSX, namSB);
    }
}
