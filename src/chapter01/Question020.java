package chapter01;

public class Question020 {
    // 020. 같은 문자열 n번 이어붙이기: 같은 문자열을 주어진 횟수만큼 이어 붙이는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str = "가나다라마";
        int num = 4;

        String result = createIterationString(str, num);
        System.out.println("result = " + result);
    }

    private static String createIterationString(String str, int num) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i<num; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
