
package btvnBuoi4_bai1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so luong sach: ");
        int n = sc.nextInt();
        Sach[] a = new Sach[n];
        for(int i=0 ; i< n; i++){
            System.out.println("Nhap thong tin sach thu: " +(i+1) );
            a[i]= new Sach();
            a[i].nhapThongTin();
            
        }
        System.out.println("Thong tin sach: ");
        System.out.printf("%-15s %-30s %-20s %-20s %-10s"," Ma sach", "Ten sach","Tac gia","Nha xuat ban","Nam xuat ban");
        for(int i=0 ; i<n; i++){
            a[i].xuatThongTin();
        }
    }
}
