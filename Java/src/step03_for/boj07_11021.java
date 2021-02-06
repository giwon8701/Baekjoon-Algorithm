package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */
public class boj07_11021 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = 0;
            t = Integer.parseInt(br.readLine());

            String in_ab = null;
            int a = 0;
            int b = 0;
            List<Integer> res = new ArrayList<>();

            for (int i = 0; i < t; i++) {
                in_ab = br.readLine();
                StringTokenizer st = new StringTokenizer(in_ab);
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                res.add(a+b);
            }
            int cnt = 1;

            for (int i : res) {
                System.out.println("Case #"+cnt+": "+i);
                cnt++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
