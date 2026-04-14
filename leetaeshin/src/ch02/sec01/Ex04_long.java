package ch02.sec01;

public class Ex04_long {
    public static void main(String[] args) {
        //접미사L이 없어서 int형태로 저장됨(4byte 할당)
        long var1 = 10;

        //접미사L이 포함되어 long형태로 저장됨(8byte 할당)
        long var2 = 20L;

        //long var3 = 1000000000;       //접미사L이 없어서 int형태로 저장하려고하나, 오버플로우가 생기며 컴파일 오류
        
        //접미사 L이 포함되어 long형태로 저장됨(8byte 할당)
        long var4 = 10000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
