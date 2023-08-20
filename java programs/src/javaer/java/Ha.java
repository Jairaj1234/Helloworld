package javaer.java;

import java.util.Scanner;

class Ha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m value:");
        int m = sc.nextInt();
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        sc.close();
        
        for (int i = m; i <= n; i++) {
            if (isHappy(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isHappy(int x) {
        while (x > 9) {
            int sum = 0;
            do {
                int d = x % 10;
                sum = sum + d * d;
                x = x / 10;
            } while (x != 0);
            x = sum;
        }
        return x == 7 || x == 1;
    }
}
