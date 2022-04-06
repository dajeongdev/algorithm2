package Programmers.Level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 직사각형별찍기 {
    /**
     * [문제]
     * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
     * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
     *
     * [제한 조건]
     * n과 m은 각각 1000 이하인 자연수입니다.
     * [예시]
     * 입력
     * 5 3
     * 출력
     * *****
     * *****
     * *****
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 참고할 만한 풀이
     */
    private void otherAnswer1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }
}
