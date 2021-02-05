package step03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj04_15552 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 0;
            List<Integer> res = new ArrayList<>();

            // BufferedReader : 입력
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            for (int i=0; i<t; i++) {
                String input_ab = br.readLine();
                // StringTokenizer
                StringTokenizer st = new StringTokenizer(input_ab);

                // a, b에 토큰에 담긴 값을 넣어줌
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                res.add(a+b);
            }
            // BufferedWriter : 출력
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i : res) {
                // 출력함수
                bw.write(i+"\n");
            }
            bw.flush();     // 남아있는 데이터를 전부 출력시켜줌
            bw.close();     // 스트림을 닫아줌
       } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
