package ch11.sec03_DeepClone;

import java.util.Arrays;

public class Member implements Cloneable {
    //name, scores, car - 객체(주소 복제) / age - 기본형(리터럴값 복제)
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public Member(String name, int age, int[] scores, Car car){
        this.name = name;
        this.age = age;
        this.scores=scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        //먼저 얕은 복사를 해서 name, age 복제
        Member cloned = (Member) super.clone();
        //scores복제
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        //car 복제
        cloned.car = new Car(this.car.model);
        //깊은 복제된 Member 객체를 리턴함
        return cloned;
    }

    public Member getMember(){
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cloned;
    }
}
