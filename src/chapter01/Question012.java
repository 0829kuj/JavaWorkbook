package chapter01;

public class Question012 {
    // 012. 중복 문자 제거: 주어진 문자열에서 중복 문자를 제거하는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str = "가나다나라다마라가바나사마바아라자아차바타가차파아하하";

        String result = removeDuplicateCharacters("", str);
        System.out.println("result = " + result);
    }

    private static String removeDuplicateCharacters(String divider, String str) {
//        StringBuffer result = new StringBuffer();
        char[] chars1 = str.toCharArray();
        String result = "";

        for (int i=0; i<str.length(); i++) {
            char[] chars = str.substring(1, str.length()).toCharArray();
            if (chars1[i] != chars[i]) {
                result += chars[i];
            }
//            removeDuplicateCharacters(str.substring(i, i+1), result);
        }

        return result;
    }

//    private static String removeDuplicateCharacters(String str) {
//        StringBuffer result = new StringBuffer();
//        char[] chars = str.toCharArray();
//
//        for (int i=0; i<chars.length; i++) {
//            if (i == 0) {
//                result.append(chars[i]);
//            } else if (chars[i - 1] != chars[i]) {
//                result.append(chars[i]);
//            }
//        }
//
//        return result.toString();
//    }
}
