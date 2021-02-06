package step04_while;

import java.util.Scanner;

public class boj01_10952 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) break;
            System.out.println(a + b);
        }
        sc.close();
    }
}
