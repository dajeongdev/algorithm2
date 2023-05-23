package Programmers.beginner;

import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {
    /**
     * 문제 설명
     * 정수 배열 arr이 매개변수로 주어집니다.
     * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
     * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
     *
     * 제한사항
     * 1 ≤ arr의 길이 ≤ 1,000
     * 1 ≤ arr의 원소 ≤ 1,000
     *
     * 입출력 예
     * arr	result
     * [1, 2, 3, 4, 5, 6]	[1, 2, 3, 4, 5, 6, 0, 0]
     * [58, 172, 746, 89]	[58, 172, 746, 89]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 예제 1번의 arr의 길이는 6입니다.
     * arr의 길이를 2의 정수 거듭제곱으로 만드는 방법은 0을 2개, 10개, 26개,...,
     * 추가하는 방법이 있고 그중 최소한으로 0을 추가하는 방법은 2개를 추가하는 것입니다.
     * 따라서 [1, 2, 3, 4, 5, 6, 0, 0]을 return 합니다.
     * 입출력 예 #2
     * 예제 2번의 arr의 길이는 4이고 이미 2의 정수 거듭제곱입니다.
     * 따라서 뒤에 0을 추가하지 않아도 되므로 [58, 172, 746, 89]를 return 합니다.
     */
    public int[] solution(int[] arr) {
        int power = 2;
        while (power < arr.length)
            power *= 2;
        return (power == arr.length || arr.length == 1) ?
                arr : Arrays.copyOfRange(arr, 0, power);
    }

    public static void main(String[] args) {
        배열의길이를2의거듭제곱으로만들기 T = new 배열의길이를2의거듭제곱으로만들기();

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {58, 172, 746, 89};
        int[] arr3 = {58};

        System.out.println(Arrays.toString(T.solution(arr1)));
        System.out.println(Arrays.toString(T.solution(arr2)));
        System.out.println(Arrays.toString(T.solution(arr3)));
    }
}
