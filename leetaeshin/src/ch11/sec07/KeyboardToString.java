package ch11.sec07;

import java.io.IOException;

public class KeyboardToString {
    public static void main(String[] args) throws IOException{
        byte[] bytes = new byte[100];

        System.out.print("입력 : ");
        //readByteNo => 길이 반환
        //System.in.read - 사용x, 한글자씩 읽음, 대체:Scanner
        int readByteNo = System.in.read(bytes);

        //readByteNo-2 이유 : 입력 당시 뒤에 아스키코드 null이 추가되므로, null까지 제외시킴
        String str = new String(bytes, 0, readByteNo-2);
        System.out.println(str);
    }
}
