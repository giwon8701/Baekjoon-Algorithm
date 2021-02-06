package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj03_8393 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int res = 0;
            for (int i=1; i<=n; i++) {
                res += i;
            }
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
