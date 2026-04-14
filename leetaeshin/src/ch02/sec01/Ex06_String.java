package ch02.sec01;

public class Ex06_String {
    public static void main(String[] args) {
        //String(4byte) : 주소를 저장 후 해당 주소에 리터럴객체를 저장하여 주소를 불러옴
        String name = "이태신";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);
        // \t : tap키
        str = "번호\t이름\t직업 ";
        System.out.println(str);
        // \n : spacebar키
        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다.");
    }
}
