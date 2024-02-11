package chapter01;

public class Question016 {
    // 016. 문자열이 부분 문자열을 포함하는지 검사: 주어진 문자열이 주어진 부분 문자열을 포함하는지 검사하는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str1 = "김수한무거북이와두루미삼천갑사동박삭치치카포사리사리센타워리워리세프리깡";
        String str2 = "가나다라마바사아자차카타파하";
        String word = "두루미";
     
        String result1 = isInclustionOfSubstring(str1, word);
        System.out.println("result1 = " + result1);
        String result2 = isInclustionOfSubstring(str2, word);
        System.out.println("result2 = " + result2);
        
    }

    private static String isInclustionOfSubstring(String str, String word) {
        
        for (int i=0; i<str.length(); i++) {
            if (i<str.length()-2) {
                if (str.substring(i, i + 1).equals(word.substring(0, 1))) {
                    if (str.substring(i, i + 3).equals(word)) {
                        return word + "를 포함하는 문자열입니다.";
                    }
                }
            }
        }
        return word+"를 포함하지 않는 문자열입니다.";
    }
}
