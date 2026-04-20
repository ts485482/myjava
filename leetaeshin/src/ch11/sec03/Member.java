package ch11.sec03;

public class Member {
    //필드
    public String id;

    //생성자
    public Member(String id){
        this.id = id;
    }

    //메소드
    //Object객체의 equals메소드 재정의(Object객체의 equals : 주소 비교)
    //선언부 반드시 동일해야함(public boolean equals(Object obj){})
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;
            if(id.equals(member.id)){
                return true;
            }
        }
        return false;
    }
}
