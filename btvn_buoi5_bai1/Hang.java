
package btvn_buoi5_bai1;
import java.util.Scanner;
public class Hang {
    private String MaHang; 
    private String TenHang;
    private NSX x;

    public Hang() {
    }

    public Hang(String MaHang, String TenHang, NSX x) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.x = new NSX();
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);  
        System.out.printf("Nhập mã hang: ");
        MaHang = sc.nextLine();
        System.out.printf("Nhập tên hàng: ");
        TenHang = sc.nextLine();
        
        System.out.println("Nhập thông tin NSX: ");
        
        x.Nhap();
    }
    public void Xuat(){
        System.out.println("THÔNG TIN MẶT HÀNG VỪA NHẬP: ");
        System.out.println("MaHang: " + MaHang );
        System.out.println("TenHang: " + TenHang );
        System.out.println("NSX của mặt hàng: ");
        x.Xuat();
    }
    public static void main(String[] args) {
        NSX x = new NSX("01","Samsung","Nghệ An");
        Hang a= new Hang("02","Điện thoại", x);
        a.Nhap();
        a.Xuat();
    }
}
