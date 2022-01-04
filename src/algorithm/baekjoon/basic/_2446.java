package algorithm.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 별 찍기 - 9
 */
public class _2446 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    for (int i = 0; i < 2 * n - 1; i++) {
      int abs = Math.abs(n - i - 1);
      System.out.println(" ".repeat(n - abs - 1) + "*".repeat(2 * abs + 1));
    }
  }
}
