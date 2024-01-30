package chapter01;

public class Question05 {
    //005. 모음과 자음 세기: 주어진 문자열에서 모음과 자음 개수를 세는 프로그램을 작성하라. 대상은 자음이 5개(a, e, i, o, u)인 영어다.
    public static void main(String[] args) {
        String str1 = "eghslejrljel";

        System.out.println("str1 = " + isNumbering(str1));;
    }

    private static int isNumbering(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(chars[i]);

//            if (chars[i] == "a") {
//
//            } else if () {
//
//            }
        }
        return chars.length;
    }
}
