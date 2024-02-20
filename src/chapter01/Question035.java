package chapter01;

public class Question035 {
    // 035. 나눗셈과 나머지의 버림 계산: 피제수(x)와 제수(y)가 주어졌을 때 나눗셈의 버림과 나머지의 버림을 계산하는 프로그램을 작성하라.
    public static void main(String[] args) {
        int x = 7;
        int y = 2;

        int result1 = x/y;
        int result2 = x%y;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
