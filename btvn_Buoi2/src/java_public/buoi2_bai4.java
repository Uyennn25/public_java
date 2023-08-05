package java_public;

import java.util.Scanner;

public class buoi2_bai4 {

    public static void giaiPhuongTrinh(float a, float b, float c) {
        float delta = b * b - 4 * a * c;
        if (a != 0) {
            if (delta > 0) {
                float y = (float) ((-b + Math.sqrt(delta)) * 1 / (2 * a));
                float z = (float) ((-b - Math.sqrt(delta)) * 1 / (2 * a));
                if (y > 0) {
                    System.out.println("x1= " + Math.sqrt(y));
                    System.out.println("x2= " + "-" + Math.sqrt(y));
                } else if (y == 0) {
                    System.out.println("x1= " + 0);
                }
                if (z > 0) {
                    System.out.println("x3= " + Math.sqrt(z));
                    System.out.println("x4= " + " - " + Math.sqrt(z));
                } else if (z == 0) {
                    System.out.println("x3= " + 0);
                }

            } else if (delta == 0) {
                float x = -b / (2 * a);
                if (x > 0) {
                    System.out.println("phuong trinh co 2 nghiem: ");
                    System.out.println("x1= " + Math.sqrt(x));
                    System.out.println(" x2= " + " - " + Math.sqrt(x));
                } else if (x == 0 && a != 0) {
                    System.out.println("x1=" + x);
                }

            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            if (b == 0 && c == 0) {
                System.out.println("phuong trinh co VSN");
            } else if (b == 0 && c != 0) {
                System.out.println("phuong trinh vo nghiem");
            } else {
                float n = (float) -c / b;
                if (n > 0) {
                    System.out.println("phuong trinh co nghiem: ");
                    System.out.println("x1= " + Math.sqrt(n));
                    System.out.println("x2= " + -Math.sqrt(n));
                } else if (n == 0) {
                    System.out.println("phuong tinh co nghiem la x= " + n);
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập số b: ");
        float b = sc.nextFloat();
        System.out.print("Nhập số c: ");
        float c = sc.nextFloat();
        System.out.println("=> Phương trình " + a + "x^4" + b + "x^2" + "+ " + c);
        giaiPhuongTrinh(a, b, c);
    }
}
