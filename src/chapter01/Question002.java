package chapter01;

import java.util.ArrayList;

public class Question002 {
    // 002. 반복되지 않는 첫 번째 문자 찾기: 주어진 문자열에서 반복되지 않는 첫 번째 문자를 반환하는 프로그램을 작성하라.
    public static void main(String[] args) {
        String str = "가가가가가나나나다가가가가가가";
        char [] chars = str.toCharArray();

        ArrayList arr = new ArrayList<String>();
        for (int i=0; i < chars.length; i++) {
            if(chars[i] != chars[i+1]){
                System.out.println("chars["+(i+1)+ "] = " + chars[i+1]);
                break;
            }
        }
    }
}
