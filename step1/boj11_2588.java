package step1;

import java.util.Scanner;
/*
문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
public class boj11_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 472
        int b = sc.nextInt(); // 385

        // b를 String으로 담아줌
        String b_str = String.valueOf(b);
        // b를 한자리씩 담아줄 배열 생성
        int[] b_arr = new int[b_str.length()];

        for (int i=b_str.length(); i>0; i--) {
            b_arr[b_str.length()-i] = Integer.parseInt(b_str.substring(i-1, i));
            // b_arr[3-3] = Integer.parseInt(b_str.substring(2, 3)); -> b_arr[0] = 5
            // b_arr[3-2] = Integer.parseInt(b_str.substring(1, 2)); -> b_arr[1] = 8
            // b_arr[3-1] = Integer.parseInt(b_str.substring(0, 1)); -> b_arr[2] = 3
        }

        for (int i=0; i<b_arr.length; i++) {
            System.out.println(a*b_arr[i]);
            // 472 * 5 = 2360
            // 472 * 8 = 3776
            // 472 * 3 = 1416
        }
        System.out.println(a*b); // 472 * 385 = 181720
    }
}
