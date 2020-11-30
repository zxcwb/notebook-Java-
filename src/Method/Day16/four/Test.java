package Method.Day16.four;
/*
在程序中经常要对时间进行操作但是并没有时间类型的数据。
那么我们可以自己实现一个时间类来满足程序中的需要。
定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
为了保证数据的安全性这三个成员变量应声明为私有。
为MyTime类定义构造方法以方便创建对象时初始化成员变量。
再定义diaplay方法用于将时间信息打印出来。
为MyTime类添加以下方法
	addSecond(int sec)
	addMinute(int min)
	addHour(int hou)
	subSecond(int sec)
	subMinute(int min)
	subHour(int hou)
	分别对时、分、秒进行加减运算。
 */
public class Test {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(10,20,30);
        myTime.display();
        myTime.addHour(1);
        myTime.display();
        myTime.subHour(4);
        myTime.display();
        myTime.addHour(18);
        myTime.display();
    }
}
class MyTime{
    private int hour;
    private int minute;
    private int second;

    //加秒
    public void addSecond(int sec){
        int newsecond   = this.second+sec;
        this.second = newsecond;
    }
    //加分
    public void addMinute(int min){
        int newminute  = this.minute+min;
        this.minute = newminute;
    }
    //加时
    public void addHour(int hour){
        int newhour  = this.hour+hour;
        this.hour = newhour;
        if (this.hour>=24){
             int time =newhour-24;
             this.hour = time;
        }
    }

    //减秒
    public void subSecond(int sec){
        int newsecond   = this.second-sec;
        this.second = newsecond;
    }
    //减分
    public void subMinute(int min){
        int newminute  = this.second-min;
        this.minute = newminute;
    }
    //减时
    public void subHour(int hour){
        int newhour  = this.hour-hour;
        this.hour = newhour;
    }



    //打印时间信息
    public void display(){
        System.out.println("时间:"+hour+":"+minute+":"+second);
    }
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}