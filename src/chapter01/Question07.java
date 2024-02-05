package chapter01;

class Numbers {
    private int num1;
    private long num2;
    private float num3;
    private double num4;

    public Numbers(int num1, long num2, float num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    @Override
    public String toString() {
        return "Numbers{ " +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                " }";
    }
}

public class Question07 {
    // 007. 문자열을 int, long, float, double로 변환
    public static void main(String[] args) {

        String intStr = "4217";
        String longStr = "7523452341214543487";
        String floatStr = "924.66";
        String doubleStr = "4774566924.6243425667548168";

        Numbers numbers = StrConvertNum(intStr, longStr, floatStr, doubleStr);
        System.out.println("numbers.toString() = " + numbers.toString());
    }
    
    private static Numbers StrConvertNum(String num1, String num2, String num3, String num4) {
        
        int intNum = Integer.parseInt(num1);
        Long longNum = Long.parseLong(num2);
        Float floatNum = Float.parseFloat(num3);
        Double doubleNum = Double.parseDouble(num4);
        
        return new Numbers(intNum, longNum, floatNum, doubleNum);
    }
}