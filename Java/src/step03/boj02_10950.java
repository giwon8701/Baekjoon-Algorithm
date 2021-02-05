package step03;

import java.io.*;
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
각 테스트 케이스마다 A+B를 출력한다.
 */
public class boj02_10950 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            int a = 0;
            int b = 0;
            // int[] res = new int[t];
            List<Integer> res = new ArrayList<Integer>();

            for (int i=0; i<t; i++) {
                String input_stream = br.readLine();
                // 공백 문자를 만나면 분리시킨다.
                StringTokenizer st = new StringTokenizer(input_stream);
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                // split으로 분리
                //String[] sp = input_stream.split(" ");
                //a = Integer.parseInt(sp[0]);
                //b = Integer.parseInt(sp[1]);

                // 배열
                // res[i] = a + b;
                res.add(a+b);
            }

            for (int i : res) {
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
