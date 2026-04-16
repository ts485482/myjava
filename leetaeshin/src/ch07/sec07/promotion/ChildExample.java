package ch07.sec07.promotion;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();       //Parent클래스에 있는 Parent-method1() 출력

        parent.method2();       //Child클래스의 영향을 받아 Child-method2() 출력

        //parent.method3();     //호출불가능 - parent가 child를 포함하더라도, 
                                //parent에 기존에 있던 메소드가 아닌 child에서 새로 만든 메소드일 경우, 실행불가능
    }
}
