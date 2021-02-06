package step04_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
문제
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

출력
첫째 줄에 N의 사이클 길이를 출력한다.
 */
public class boj03_1110 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int origin, n;
        int left, right;
        int cnt = 0;

        //n = sc.nextInt();
        n = Integer.parseInt(br.readLine());    // n = 26
        origin = n;                             // origin에 원래 수를 담아놓음

        do {
            cnt++;                              // cnt   =  1   /  2   /  3   /  4

            left = n % 10;                      // left  =  6   /  8   /  4   /  2      (n의 첫째자리)
            right = ((n / 10) + (n % 10)) % 10; // right =  8   /  4   /  2   /  6      (n의 10의자리+1의자리)

            n = left * 10 + right;              // res   =  68  /  84  /  42  /  26

        } while (origin != n);

        System.out.print(cnt);                  // cnt = 4
    }
}