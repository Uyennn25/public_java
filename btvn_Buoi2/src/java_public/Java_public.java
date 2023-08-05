package java_public;

import java.util.Scanner;

public class Java_public {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("hello word");
//        int n= scanner.nextInt();
        // char c=scanner.next().charAt(0)
//       boolean t=true;
//       boolean f=false;
//        scanner.nextLine();
//         String s=scanner.nextLine();
//         
//         System.out.println(s);
//        System.out.println(n);
//        int a=n+n;
//        System.out.println(a);
//        int t=0;
//      
//        for(int i=0; i< n; i++){
//            t=t+i;
//        }
//        System.out.println("tong="+t);
        // int a=scanner.nextInt();
//        int b=scanner.nextInt();
//        int sum= a+b;
//        if(sum %3 ==0)
//            System.out.println("tong 2 so chia het cho 3");
//        else
//         System.out.println("tong 2 so khong chia het cho 3");   
//        int i=0;
//        int sum=10;
//        while(i>0){
//            sum+=i;
//            i--;
//        }
//        System.out.println(sum);
//        do{
//            sum+=i;
//            i--;
//        }while(i>0);
        int i = 1;
        int sum = 0;
        while (i < 100) {
            if (i % 15 == 0) {
                sum += i;
            }

            i++;
        }
        System.out.println(sum);
    }

}
