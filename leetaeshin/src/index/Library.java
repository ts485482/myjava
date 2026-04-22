package index;

import java.io.*;

public class Library implements Manageable {
    private Book[] books = new Book[100];
    private int count = 0;
    private final String FILE_NAME = "D:/taeshin/myjava/leetaeshin/src/index/books.txt";

    //데이터추가
    @Override
    public void addItem(Book book){
        if (count >= books.length){
            System.out.println("저장공간이 가득차서 책을 추가할 수 없습니다.");
            return;
        }
        books[count++] = book;
        System.out.println("현재 count = " + count);
    }

    //전체목록 출력
    @Override
    public void displayAll(){
        if (count == 0){
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        for(int i = 0; i<count; i++){
            System.out.println((i+1) + ". " + books[i]);
        }
    }

    //파일로 데이터 저장
    @Override
    public void saveToFile(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int i = 0; i < count; i++){
                Book b = books[i];
                bw.write("ID : " + b.getID() + " | 제목 : " + b.getTitle() + " | 저자 : " + b.getAuthor());
                bw.newLine();
            }
            System.out.println("파일 저장 완료");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    //파일에서 데이터 로드
    //Chatgpt 도움받음(파일 검색 후, 배열에 추가)
    @Override
    public void loadFromFile(){
        count = 0; // 기존 배열 초기화

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = br.readLine()) != null) {

                // 예: ID : 1 | 제목 : 자바 | 저자 : 홍길동
                String[] parts = line.split("\\|");

                if (parts.length != 3) continue;

                int id = Integer.parseInt(parts[0].replace("ID :", "").trim());
                String title = parts[1].replace("제목 :", "").trim();
                String author = parts[2].replace("저자 :", "").trim();

                books[count++] = new Book(id, title, author);
            }

            System.out.println("파일 로드 완료 (" + count + "권)");

        } catch (IOException e) {
            System.out.println("파일이 없거나 읽기 실패");
        }
    }
}
