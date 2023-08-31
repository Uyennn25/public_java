
package buoi5_bai3;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May() {
    }

    public May(String MaMay, String TenMay, String TinhTrang) {
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma may: ");
        MaMay = sc.nextLine();
        System.out.printf("\nNhap ten may: ");
        TenMay = sc.nextLine();
        System.out.printf("\nNhap tinh trang: ");
        TinhTrang = sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("%-10s %-10s %-10s" , MaMay , TenMay , TinhTrang );
        System.out.println(" ");
    }
}
