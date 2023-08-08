package java_public;

import java.util.Scanner;

public class buoi2_bai5 {

    public static int timMin(int a, int b) {

        if (a < b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("chanh: ");
        int a = sc.nextInt();
        System.out.print("Tao: ");
        int b = sc.nextInt();
        System.out.print("Le: ");
        int c = sc.nextInt();
//        for (int i = a; i > 0; i--) {
//            
//            if (b>=2*i && c >=4*i) {
//                b=2*i;
//                c=4*i;
//                System.out.println("=> Tong so qua toi da: " + 7*i + "(Chanh: " + i + " ,Tao: " + b  + ", Le: " + c+")");
//                break;
//            }
//            
//        }
        int B = b / 2;
        int C = c / 4;
        int min = timMin(a, (timMin(B, C)));
        System.out.println("=>Tong qua toi da: " + 7 * min + " (Chanh: " + min + " ,Tao: " + 2 * min + ", Le: " + 4 * min + ")");
    }
}
