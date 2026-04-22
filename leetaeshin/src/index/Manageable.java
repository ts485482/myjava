package index;

public interface Manageable {
    void addItem(Book book);    //데이터추가
    void displayAll();          //전체 목록 출력
    void saveToFile();          //파일 저장
    void loadFromFile();        //파일 로드
}
