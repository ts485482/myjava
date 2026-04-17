package ch07.sec07.InstanceOfExample;

public class InstanceofExample {
    //instanceof : 자식형 비교 
    //ex) parent instanceof Child : parent 매개변수가 현재 Child 객체를 참조하는지 조사(boolean형)
    public static void method1(Parent parent){
        if(parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method1 - Child로 변환되지 않음");
        }
    }


    //확실히 Child형이라는 것을 알 때만 사용 가능함. 
    // 권장 절대 X 
    // instanceof로 비교 필수
    public static void method2(Parent parent){
        Child child = (Child) parent;
        System.out.println("method2 - Child로 변환 성공");
    }

    public static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        Parent parentB = new Parent();
        method1(parentB);
        
        //변환 불가하므로, 오류 발생
        //보안침해 가능성 높음
        //method2(parentB);
    }
}
