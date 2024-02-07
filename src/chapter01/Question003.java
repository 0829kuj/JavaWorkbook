package chapter01;

public class Question003 {
    // 003. 글자와 단어 뒤집기: 각 단어의 글자를 뒤집는 프로그램과 각 단어의 글자와 각 단어를 뒤집는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str1 = "사과";
        String str2 = "바나나";
        String str3 = "망고";
        String str4 = "수박";
        String str5 = "멜론";
        String str6 = "사과 바나나 망고 수박 멜론";

        System.out.println("str1 = " + wordFlipping(str1));
        System.out.println("str2 = " + wordFlipping(str2));
        System.out.println("str3 = " + wordFlipping(str3));
        System.out.println("str4 = " + wordFlipping(str4));
        System.out.println("str5 = " + wordFlipping(str5));

        System.out.println(flipping(str6));
    }

    // 각 단어 뒤집기
    private static String wordFlipping(String str) {
        char[] chars = str.toCharArray();
        StringBuilder newStr = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            newStr.append(chars[i]);
        }
        return newStr.toString();
    }

    private static String flipping(String str) {
        String[] stChange = str.split(" ");
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < stChange.length; i++) {
//            System.out.println(stChange[i]);
            newStr.append(wordFlipping(stChange[i]));
            newStr.append(" ");
        }
        return newStr.toString();
    }
}

