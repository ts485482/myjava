package ch06.sec08.package2;

import ch06.sec08.package1.A2;

public class C2 {
    public C2(){
        //필드(패키지가 달라서 default처리된 field2와 private처리된 field3을 불러올 수 없음)
        A2 a = new A2();
        a.field1 = 1;
        //a.field2 = 1;         //컴파일 에러
        //a.field3 = 1;         //컴파일 에러

        //메소드(패키지가 달라서 default처리된 method2와 private처리된 method3을 불러올 수 없음)
        a.method1();
        //a.method2();          //컴파일 에러
        //a.method3();          //컴파일 에러
    }
}
