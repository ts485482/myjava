package ch07.sec06.Protected;

public class Time {
    //필드(private처리)
    private int hour;
    private int minute;
    private int second;

    //생성자(default 처리)
    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    //메소드
    public int getHour(){return hour;}
    public void setHour(int hour){
        if(hour<0 || hour>23) {return;}
        this.hour = hour;
    }

    public int getMinute(){return minute;}
    public void setMinute(int minute){
        if(minute < 0 || minute > 59){
            return;
        }
        this.minute = minute;
    }

    public int getSecond(){return second;}
    public void setSecond(int second){
        if(second < 0 || second > 59){
            return;
        }
        this.second = second;
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
}
