package index;

public class Book{
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }
    
    //저장시 사용할 CSV 포멧 문자열 반환 시스템
    public String toFileString(int id, String title, String author){       
        return id + "," + title + "," + author;
    }

    @Override
    public String toString() {
        return "ID : " + id + " | 제목 : " + title + " | 저자 : " + author; 
    }

    public int getID(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

}
