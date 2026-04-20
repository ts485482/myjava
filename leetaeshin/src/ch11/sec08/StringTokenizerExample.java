package ch11.sec08;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "홍길동/이수홍/박연수";

        //how1 : 전체 토큰 수를 얻어 for문으로 루핑(실무 사용 절대x)
        /* 
        StringTokenizer st = new StringTokenizer(text,"/");
        int countTokens = st.countTokens();
        for(int i=0; i<countTokens; i++){
            //실무에서는 hasMoreTokens()를 선 실행 필수
            String token = st.nextToken();
            System.out.println(token);
        }
        */

        //how2 : 남아있는 토큰을 확인하고 while문으로 루핑
        StringTokenizer st = new StringTokenizer(text,"/");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
