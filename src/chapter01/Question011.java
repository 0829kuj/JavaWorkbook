package chapter01;

public class Question011 {
    // 011. 문자열 회문 검사: 주어진 문자열이 회문인지 알아내는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str1 = "가나다라마가나다라";
        String str2 = "가나다다나가";

        System.out.println("str1 회문여부 = " + isRepetitiveString(str1));
        System.out.println();
        System.out.println("str2 회문여부 = " + isRepetitiveString(str2));
    }

    private static String isRepetitiveString(String str) {
        int splitIndex = str.length() / 2;

        String stringA = str.substring(0, splitIndex);
        System.out.println("stringA = " + stringA);

        String stringB = "";

        if (str.length() % 2 == 1) {
            stringB = str.substring(splitIndex + 1, str.length());
        } else {
            stringB = str.substring(splitIndex, str.length());
        }

        StringBuffer stringC = new StringBuffer();
        char[] chars = stringB.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            stringC.append(chars[i]);
        }
        stringB = stringC.toString();
        System.out.println("stringB = " + stringB);

        if (stringA.equals(stringB)) {
            return "이 문장은 회문입니다.";
        } else {
            return "이 문장은 회문이 아닙니다.";
        }
    }
}
