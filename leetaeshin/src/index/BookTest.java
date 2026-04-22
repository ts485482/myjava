package index;

import java.util.Scanner;

public class BookTest{
    public static void main(String[] args) throws Exception {
        Library manager = new Library();
        Scanner sc = new Scanner(System.in);
        manager.loadFromFile();
        
        
        //반복문 사용하여 저장 후 종료를 선택할 때를 제외하고 계속 돌아가게만듦
        while(true){
            System.out.println("======== LIBRARY SYSTEM ========");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 저장 및 종료");
            System.out.print("메뉴 선택 >> ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            if(choice == 1){
                System.out.println("[도서 등록]");
                System.out.print("ID : ");
                int id = sc.nextInt();

                System.out.print("제목 : ");
                sc.nextLine();
                String title = sc.nextLine();

                System.out.print("저자 : ");
                String author = sc.nextLine();
                
                manager.addItem(new Book(id,title,author));
                
                System.out.println("결과 : 성공적으로 등록되었습니다.");
                System.out.println();
            }
            else if(choice == 2){
                System.out.println("[도서 목록 조회]");
                System.out.println("      ID         제목        저자       ");
                System.out.println("=======================================");
                manager.displayAll();
                System.out.println();
            }
            else if(choice == 3){
                manager.saveToFile();
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            else {
                System.out.println("입력이 잘못되었습니다. 1~3 사이의 숫자 중 하나를 선택해주세요!!");
                System.out.println();
            }
        }
    }
}
