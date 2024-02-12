package chapter01;

public class Question014 {
    // 014. 빈도수가 가장 높은 문자 찾기: 주어진 문자열에서 빈도수가 가장 큰 문자를 찾는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str = "김수한무거북이와두루미삼천갑사동박삭치치카포사리사리센타워리워리세프리깡";
    }

    private static String findMaxCountChar(String str) {
        char[] chars = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    cnt++;
                }
            }
        }
        return "";
    }
}
