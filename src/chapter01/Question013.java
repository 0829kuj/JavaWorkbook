package chapter01;

public class Question013 {
    // 013. 주어진 문자 제거: 주어진 문자열에서 주어진 문자를 제거하는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str = "김수한무거북이와두루미삼천갑사동박삭치치카포사리사리센타워리워리세프리깡";
        char removeStr = '사';

        String result = removeSpecificString(str, removeStr);
        System.out.println("result = " + result);
    }

    private static String removeSpecificString(String str, char removeStr) {
        StringBuilder result = new StringBuilder();

        for (char aChar : str.toCharArray()) {
            if (aChar != removeStr) {
                result.append(aChar);
            }
        }
        return result.toString();
    }
}
