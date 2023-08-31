
package btvn_buoi5_bai1;
import java.util.Scanner;
public class NSX {
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;

    public NSX() {
    }

    public NSX(String MaNSX, String TenNSX, String DcNSX) {
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getDcNSX() {
        return DcNSX;
    }

    public void setDcNSX(String DcNSX) {
        this.DcNSX = DcNSX;
    }
    
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhập mã nhà sx: ");
        MaNSX = sc.nextLine();
        System.out.printf("Nhập tên nhà sx: ");
        TenNSX = sc.nextLine();
        System.out.printf("Nhập địa chỉ nhà sx: ");
        DcNSX = sc.nextLine();
        System.out.println("");
    }
    public void Xuat(){
        System.out.println("MaNSX: "+ MaNSX );
        System.out.println("TenNSX: " + TenNSX );
        System.out.println("DcNSX: "+ DcNSX );
    }
}
