package ch11.sec07;

import java.io.UnsupportedEncodingException;

public class StringGetBytes {
    public static void main(String[] args) {
        String str="안녕하세요";

        byte[] bytes1 = str.getBytes();
        System.out.println("bytes1.length : " + bytes1.length);
        String str1 = new String(bytes1);
        System.out.println("bytes1->String : " + str1);

        try{
            //EUC-KR : 어느 글자든 무조건 2byte / 한글 깨지므로 안씀
            byte[] bytes2 = str.getBytes("EUC-KR");
            System.out.println("bytes2.length : " + bytes2.length);
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println("bytes2->String : " + str2);

            byte[] bytes3 = str.getBytes("UTF-8");
            System.out.println("bytes3.length : " + bytes3.length);
            String str3 = new String(bytes3, "UTF-8");
            System.out.println("bytes3 -> String : " + str3);
        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}
