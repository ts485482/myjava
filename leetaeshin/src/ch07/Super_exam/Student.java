package ch07.Super_exam;

public class Student extends People {
    //자식 클래스
    //필드
    public int studentNo;

    //생성자
    public Student(String name, String ssn, int studentNo){
        //super - 부모 클래스 내에 있는 부모 생성자를 호출
        //부모 생성자가 기본이면, 아예 넣지않는것이 좋음(오류 발생가능성 O)
        //생성자 내에서 반드시 맨 첫줄
        super(name,ssn);
        this.studentNo = studentNo;
    }
}
