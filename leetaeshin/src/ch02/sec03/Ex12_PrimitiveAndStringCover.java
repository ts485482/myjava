package ch02.sec03;

public class Ex12_PrimitiveAndStringCover {
    public static void main(String[] args) {

        //parseInt, parseDouble, parseBoolean : 정적 메소드 / 문자 값을 형에 맞춰서 바꾸어줌
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 : "+value1);
        System.out.println("value2 : "+value2);
        System.out.println("value3 : "+value3);
        
        //valueOf : 정적 메소드 / 값을 받아서 문자열로 변경시킴
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2);
        System.out.println("str3 : "+str3);
    }
}
