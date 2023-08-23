
package btvnBuoi4_bai3;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        SinhVien[] x = new SinhVien[n];
        for(int i=0; i< n; i++){
            System.out.println("Nhap thong tin sinh vien thu "+(i+1) +": ");
            x[i].nhap();
        }
        System.out.println("THONG TIN SINH VIEN: ");
        System.out.printf("%-20s %-20s %-8s %-8s %-8s", "Ma Sinh Vien", "Ho Ten", "Diem Toan", "Diem Ly", "Diem Hoa");
        for(int i=0; i<n; i++){
           x[i].xuat();
        }
    }
}
