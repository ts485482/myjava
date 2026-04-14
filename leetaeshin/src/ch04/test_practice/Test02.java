package ch04.test_practice;

public class Test02 {
    public static void main(String[] args) {
        String fruit = "사과";

        switch(fruit){
            case "사과":
            System.out.println("1000원 입니다.");
            break;

            case "바나나":
            System.out.println("2000원 입니다.");
            break;

            case "포도":
            System.out.println("5000원 입니다.");
            break;

            default:
            System.out.println("판매하지 않는 과일입니다.");
        }

        String drink = "콜라";

        switch(drink){
            case "콜라", "사이다" ->
            System.out.println("탄산음료가 나옵니다.");

            case "커피" , "아이스커피" ->
            System.out.println("아메리카노가 나옵니다.");

            case "물" ->
            System.out.println("시원한 생수가 나옵니다.");

            default ->
            System.out.println("해당 번호의 음료가 없습니다.");
        }

        // 충무씨 해결방법

        /*int a = (int)(Math.random()*3);
          String[] position =
          {"사과","바나나","포도"};
          System.out.println("과일 : " + position[a]);
          switch(position[a]){
            case "사과" -> System.out.println("1000원");
            case "바나나" -> System.out.println("2000원");
            case "포도" -> System.out.println("5000원");
            default -> System.out.println("판매하지 않는 과일입니다.")
          }
         */
    }
}
