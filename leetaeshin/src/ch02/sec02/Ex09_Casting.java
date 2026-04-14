package ch02.sec02;

public class Ex09_Casting {
    public static void main(String[] args) {
        //var1의 값을 cpu에서 임시로 byte형으로 바꾸고 var2에 저장
        int var1 = 10;
        byte var2 = (byte)var1;
        System.out.println(var2);       //강제 타입 변환 후에 10이 그대로 유지

        long var3 = 300;
        int var4 = (int)var3;
        System.out.println(var4);       //강제 타입 변환 후에 300이 그대로 유지

        int var5 = 97;
        char var6 = (char) var5;
        System.out.println(var6);       //'a'가 출력

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);       //3이 출력
    }
}
