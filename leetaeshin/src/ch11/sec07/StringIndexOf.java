package ch11.sec07;

public class StringIndexOf {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        //indexOf(a) = a 문자열이 시작하는 인덱스 번호
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        //인덱스 == -1 : 인덱스에 문자열이 포함되지않아, false를 나타냄
        if(subject.indexOf("자바") != -1){
            System.out.println("자바와 관련된 책이군요");
        } else{
            System.out.println("자바와 관련없는 책이군요");
        }
    }
}
