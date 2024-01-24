package chapter01;

public class Question01 {
    // 001. 문자 개수 세기: 주어진 문자열에서 문자 개수를 세는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str = "가나다라마바사아자";
        String str2 = "abcdefg";

        int strLength = str.length();
        int strLength2 = str2.length();
        System.out.println("strLength = " + strLength);
        System.out.println("strLength2 = " + strLength2);
    }
}
