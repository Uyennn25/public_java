
package buoi3_btvn;
import java.util.Scanner;

public class buoi3_bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n=");
        int n= sc.nextInt();
        int[] a = new int[n];
        System.out.println("nhap các phần tử của mạng: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Mang săp xếp tăng dần: ");
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                if(a[i]>a[j]){
                    int tg= a[j];
                    a[j]=a[i];
                    a[i]=tg;
                }
            }
            System.out.print(a[i] +" ");
        }
        
    }
}
