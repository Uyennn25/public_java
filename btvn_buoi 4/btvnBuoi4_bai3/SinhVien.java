
package btvnBuoi4_bai3;
import java.util.Scanner;
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    
    public SinhVien(){
        
    }
    public SinhVien(String maSinhVien, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.printf("\nNhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.printf("\nNhap diem toan: ");
        diemToan = sc.nextFloat();
        System.out.printf("\nNhap diem ly: ");
        diemLy = sc.nextFloat();
        System.out.printf("\nNhap diem hoa: ");
        diemHoa = sc.nextFloat();
    }
    public void xuat(){
        System.out.printf("%-20s %-20s %-8s %-8s %-8s", maSinhVien, hoTen, diemToan, diemLy, diemHoa);
        System.out.println("");
    }
    
}
