package ch11.sec03;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        //매개변수strObj에 myPhone.toString()의 값 대입
        String strObj = myPhone.toString();
        //아래 코드에 strObj부분이 strObj.toString과 같으므로, 값은 myPhone.toString과 같음. 
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
