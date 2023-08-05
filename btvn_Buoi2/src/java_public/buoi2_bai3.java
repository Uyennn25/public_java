package java_public;

import java.util.Scanner;

public class buoi2_bai3 {

    public static boolean KiemTra(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        if (KiemTra(n) == true) {
            System.out.println("Kết quả: \n" + n + " là số nguyên tố");
        } else {
            System.out.println("Kết quả: \n" + n + " không phải là số nguyên tố");
        }

    }
}
