package ch11.sec03;

public class SmartPhone {
    //필드
    private String company;
    private String os;

    //생성자
    public SmartPhone(String company, String os){
        this.company = company;
        this.os = os;
    }

    //메소드
    //String객체의 toString() 재정의
    //선언부 반드시 동일해야함(public String toString())
    @Override
    public String toString(){
        return company + "," + os;
    }
}
