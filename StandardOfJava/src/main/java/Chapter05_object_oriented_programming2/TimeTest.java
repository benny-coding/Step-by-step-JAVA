package Chapter05_object_oriented_programming2;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        // t.hour = 13; private 접근제어자는 같은 클래스 안에서 밖에 제어가 되지 않는다.
        t.setHour(t.getHour()+1);   // 현재 시간보다 1시간 후로 변경한다.
        System.out.println(t);  // System.out.println(t.toString());과 같다.
    }
}

class Time{
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {  return hour;}
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute() {    return minute;}
    public void setMinute(int minute) {
        if ( minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond() {    return second;}
    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}