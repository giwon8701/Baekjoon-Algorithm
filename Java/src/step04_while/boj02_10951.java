package step04_while;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
 */
public class boj02_10951 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = null;

        while (!(in = br.readLine()).equals("")) {
                StringTokenizer st = new StringTokenizer(in, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                System.out.println(a + b);
        }

/*
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
        sc.close();
*/
    }
}