package ch10.sec07;

public class BalanceInsufficientException extends Exception {
    //필드
    
    //생성자
    public BalanceInsufficientException(){}
    
    //메소드
    public BalanceInsufficientException(String message){
        super(message);
    }
}
