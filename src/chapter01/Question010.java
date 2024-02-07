package chapter01;

public class Question010 {
    // 010. 모든 순열 생성: 주어진 문자열의 모든 순열을 생성하는 프로그램을 작성하라.
    // 힌트: 책에서는 재귀함수를 이용하여 해결하였다.
    public static void main(String[] args) {
        String str = "ABCDE";

        System.out.println("str.length() = " + str.length());

        permuteAndPrint("", str);

    }
    private static void permuteAndPrint(String prefix, String str) {

    }
}
