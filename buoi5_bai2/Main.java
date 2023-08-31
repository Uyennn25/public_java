
package buoi5_bai2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        Student[] x = new Student[n];
        System.out.println("Nhap thong tin: ");
        for ( int i=0; i<n ; i++){
            Student a = new Student();
            System.out.println("Nhap thong tin sv thu "+ (i+1) + ": ");
            a.Input();
            x[i] = a;
            
           
        }
        System.out.println("Thong tin SV vua nhap: ");
        for(int i=0 ; i< n ; i++){
            x[i].Output();
        }
    }
}
