package chapter01;

public class Question017 {
    // 017. 문자열 내 부분 문자열 빈도수 세기: 주어진 문자열에서 또 다른 주어진 문자열의 빈도수를 세는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str = "가나두루미다두무리두미거북이두루미";
        String keyword = "두루미";

        int cnt = countKeywordByString(str, keyword);
        System.out.println(str + " 문자열 내 " + keyword + " 문자열의 빈도수는 " + cnt + "번 입니다.");
    }

    private static int countKeywordByString(String str, String keyword) {
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - (keyword.length() - 1)) {
                if (str.substring(i, i + 1).equals(keyword.substring(0, 1))) {
                    if (str.substring(i, i + keyword.length()).equals(keyword)) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
