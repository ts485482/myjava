package ch06.sec03;

public class Computer {
    int sum1(int[] values){
        int sum = 0;
        for(int i = 0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    
    //가변적으로 처리( 거의 사용하지 않음 )
    int sum2(int ... values){
        int sum = 0;
        for(int i = 0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }
}
