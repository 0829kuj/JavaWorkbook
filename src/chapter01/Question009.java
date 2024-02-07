package chapter01;

public class Question009 {
    // 009. 구분자로 여러 문자열 합치기: 주어진 문자열을 주어진 구분자로 합치는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str1 = "안녕하세요";
        String str2 = "저는";
        String str3 = "홍길동입니다.";
        String partition = " ";

        String[] strings = new String[3];
        strings[0] = str1;
        strings[1] = str2;
        strings[2] = str3;

        String result = concatStr(strings, partition);
        System.out.println("result = " + result);
    }

    private static String concatStr(String[] strings, String partition) {
        String result = "";

        for (String string : strings) {
            result += string;
            result += partition;
        }
        int length = result.length();
        result = result.substring(0, length-1);

        return result;
    }
}
