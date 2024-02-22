package chapter01;

public class Question021 {
    // 021. 문자열 앞과 뒤 공백 제거: 주어진 문자열의 앞과 뒤 공백을 제거하는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str = "   '가나다라'      ";

        System.out.println("str.trim() = " + str.trim());
        System.out.println("removeSpace(str) = " + removeSpace(str));
    }

    private static String removeSpace(String str) {
        char[] chars = str.toCharArray();

        for (int i=0; i<str.length(); i++) {
            if (chars[i] != ' ') {
                str = str.substring(i);
                break;
            }
        }
        for (int i=str.length(); i>0; i--) {
            if (chars[i] != ' ') {
                str = str.substring(0, i);
                break;
            }
        }
        return str;
    }
}
