package ch07.override;

public class Computer extends Calculator {
    //자식 클래스

    //overriding - 조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경시킴
    //@Override : 오버라이드 어노테이션 - 컴파일러에게 부모 클래스의 메소드 선언부와 동일한지 검사 지시
    //정확한 메소드 재정의 위해 붙여주면 좋음

    @Override
    double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
