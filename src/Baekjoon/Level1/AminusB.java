package Baekjoon.Level1;

import java.util.Scanner;

public class AminusB {
    /**
     * 문제
     * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
     *
     * 출력
     * 첫째 줄에 A-B를 출력한다.
     *
     * 예제 입력 1
     * 3 2
     * 예제 출력 1
     * 1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        String[] split = nums.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        System.out.print(a - b);
    }
}
