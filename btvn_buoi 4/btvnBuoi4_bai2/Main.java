package btvnBuoi4_bai2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HCN a =new HCN();
        a.Nhap();
        System.out.println("Hinh ve cua HCN: ");
        a.Ve();
        System.out.println("Chu vi HCN: "+ a.chuVi());
        System.out.println("Dien tich HCN: "+a.dienTich());
        
    }
}
