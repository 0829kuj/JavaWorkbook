package chapter01;

class Result {
    private int vowel;
    private int consonant;

    public Result(int vowel, int consonant) {
        this.vowel = vowel;
        this.consonant = consonant;
    }

    @Override
    public String toString() {
        return "Result{ " +
                "vowel = " + vowel +
                ", consonant = " + consonant +
                " }";
    }
}

public class Question005 {
    //005. 모음과 자음 세기: 주어진 문자열에서 모음과 자음 개수를 세는 프로그램을 작성하라. 대상은 자음이 5개(a, e, i, o, u)인 영어다.
    public static void main(String[] args) {
        String str = "eghslejrljel";

        Result result = isNumbering(str);
        System.out.println("result.toString() = " + result.toString());
    }

    private static Result isNumbering(String str) {
        char[] chars = str.toCharArray();
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {

            switch (chars[i]) {
                case 'a', 'e', 'i', 'o', 'u' :
                    vowel++;
                    break;
                default:
                    consonant++;
                    break;
            }
        }
        return new Result(vowel, consonant);
    }
}
