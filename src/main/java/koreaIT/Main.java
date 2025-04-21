package koreaIT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 의사 코드
         * 시작
         * 1. n이 1이 아니면, n과 1부터 (n-1)까지의 합을 더한 값을 반환함.
         * 2. n이 1이면, 그냥 1을 반환함.
         * 끝
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 값: ");
        int t = sc.nextInt();
        Math math = new Math();

        int answer = math.recrusiveSum(t);

        System.out.println(answer);
    }
}