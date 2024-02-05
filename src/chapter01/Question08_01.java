package chapter01;

public class Question08_01 {
    // 008. 문자열에서 여백 제거
    public static void main(String[] args) {
        String str = "가나 다 라마바 사아자차 카타 파 하 ";

        String result = removeBlanks(str);
        System.out.println("result = " + result);
    }

    private static String removeBlanks(String str) {
        char[] chars = str.toCharArray();
        String result = "";

        for (int i=0; i<chars.length; i++) {
            if (chars[i] != ' ') {
                result += chars[i];
            }
        }

        return result;
    }
}
