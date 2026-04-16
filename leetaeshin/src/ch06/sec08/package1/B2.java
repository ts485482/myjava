package ch06.sec08.package1;

public class B2 {
    public B2(){
        //필드 (private처리된 field3을 불러올 수 없음)
        A2 a = new A2();
        a.field1 = 1;
        a.field2 = 1;
        //a.field3 = 1;     //컴파일 에러

        //메소드 (private처리된 field3을 불러올 수 없음)
        a.method1();
        a.method2();
        //a.method3();      //컴파일 에러
    }
}
