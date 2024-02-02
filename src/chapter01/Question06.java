package chapter01;

public class Question06 {
    // 006. 문자 빈도수 세기: 주어진 문자열에서 특정 문자의 빈도수를 세는 프로그램을 작성하라. 
    public static void main(String[] args) {
        String str = "가나다라사가다라하마바사파사가자타자바사아카차파사하바아라가";

        int count = charCount(str);
        System.out.println("count = " + count);
    }
    
    private static int charCount(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        
        for (int i=0; i < chars.length; i++) {
            if (chars[i] == '가') {
                count++;
            }
        }
        return count;
    }
}
