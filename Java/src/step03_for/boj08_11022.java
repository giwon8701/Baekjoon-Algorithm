package step03_for;

import java.util.Scanner;

public class boj08_11022 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1; i<=T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
        }
    }
}
