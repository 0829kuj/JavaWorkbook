package chapter01;

import java.util.ArrayList;

public class Question04 {
    //004. 숫자만 포함하는 문자열인지 검사: 주어진 문자열이 숫자만 포함하는지 검사하는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str1 = "se152se856t47ser";
        String str2 = "flwqijased";
        String str3 = "83524354";

        System.out.println("str1 = " + isOnlyNumber(str1));
        System.out.println("str2 = " + isOnlyNumber(str2));
        System.out.println("str3 = " + isOnlyNumber(str3));
    }

    private static String isOnlyNumber(String str) {
        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            switch (aChar) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                }
                default -> {
                    return "숫자만 포함된 문자열이 아닙니다.";
                }
            }
        }
        return "숫자만 포함된 문자열입니다.";
    }

}
