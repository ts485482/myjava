package ch06.sec06;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567" , "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";                //컴파일 에러 (Person 클래스에서 nation 객체 앞에 final을 달아 이후 값 변경을 막음)
        //p1.ssn = "654321-7654321";        //컴파일 에러 (Person 클래스에서 ssn 객체 앞에 final을 달아 이후 값 변경을 막음)
        p1.name = "을지문덕";
    }
}
