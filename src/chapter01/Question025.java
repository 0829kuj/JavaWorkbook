package chapter01;

public class Question025 {
    // 025. 두 수의 최솟값과 최댓값 계산: 두 수의 최솟값과 최댓값을 반환하는 프로그램을 작성하라.
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println(findMinMax(a, b));
    }

    private static String findMinMax(int a, int b) {
        int min;
        int max;
        String result = "";

        if (a > b) {
            max = a;
            min = b;
            result = "max = " + max + ", min = " + min;
        } else if (a < b) {
            max = b;
            min = a;
            result = "max = " + max + ", min = " + min;
        } else {
            result = "두 수의 값은 동일합니다.";
        }
        return result;
    }
}
