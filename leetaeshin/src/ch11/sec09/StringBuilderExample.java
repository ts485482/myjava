package ch11.sec09;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        //insert(a,b) : a인덱스 자리에 b 추가
        sb.insert(4,"2");
        System.out.println(sb.toString());

        //setCharAt(a,b) : a인덱스 자리 글자를 b로 교체
        sb.setCharAt(4, '6');
        System.out.println(sb.toString());

        //replace(a,b,c) : a인덱스부터 b인덱스 전까지 문자열을 c로 교체
        sb.replace(6, 13, "Book");
        System.out.println(sb.toString());

        //delete(a,b) : a인덱스부터 b인덱스 전까지 문자열 삭제
        sb.delete(4,5);
        System.out.println(sb.toString());

        int length = sb.length();
        System.out.println("총 문자 수 : " + length);

        String result = sb.toString();
        System.out.println(result);
    }
}
