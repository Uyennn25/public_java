
package buoi3_btvn;

public class buoi3_bai1 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {1, 2, 3, 1, 2};

        // Đếm số lần xuất hiện của từng phần tử trong mảng
        int[] count = new int[n];
        boolean[] counted = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!counted[i]) {
                count[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == a[i]) {
                        count[i]++;
                        counted[j] = true;
                    }
                }
                System.out.println("* Số " + a[i] + " xuất hiện " + count[i] + " lần");
            }
        }
    }
}
