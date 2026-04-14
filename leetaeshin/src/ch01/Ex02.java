package ch01;

public class Ex02 {
    public static void main(String[] args) {
        //15를 변수 v1에 초기값으로 저장
        int v1 = 15;
        
        //0을 변수 v2에 초기값으로 저장 
        int v2 = 0;
        
        if(v1>10){
            
            //변수 v1을 읽고, 변수 v1에서 10을 빼는 산술연산 진행
            //연산의 결과값을 변수 v2에 덮어씌움
            v2 = v1 - 10;
        }
        
        //변수 v1, v2를 읽고, 변수 v1,v2와 5를 전부 더하는 산술연산 진행
        //변수 v3 생성 후, 연산의 결과값을 변수 v3에 초기값으로 저장
        int v3 = v1 + v2 + 5;
        
        //변수 v3을 불러와 문자열과 합쳐 콘솔에 출력
        System.out.println("v1 + v2 + 5 = " + v3);
    }
}
