package ch02.sec01;

public class Ex05_float_double {
    public static void main(String[] args) {
        
        //실수값 저장
        double var1 = 3.14;
        //float var2 = 3.14;       //컴파일 에러(3.14(8yte),float(4byte))(Type mismatch)
        float var3 = 3.14F;

        //정밀도 테스트
        double var4 = 0.123456789123456789;
        float var5 = 0.123456789123456789F;

        System.out.println("var1 : " + var1);
        System.out.println("var3 : "+ var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
    }
}
