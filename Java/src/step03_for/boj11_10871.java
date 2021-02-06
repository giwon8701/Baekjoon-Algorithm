package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11_10871 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String nx = null;
            nx = br.readLine();
            String[] nx_arr;
            nx_arr = nx.split(" ");

            int n = Integer.parseInt(nx_arr[0]);
            int x = Integer.parseInt(nx_arr[1]);

            String[] a = new String[n];
            a = br.readLine().split(" ");

            for (String i : a) {
                if (Integer.parseInt(i) < x) {
                    System.out.print(i + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
