package Method.Day16.one;
/*
请定义一个交通工具(Vehicle)的类
其中有属性：
	速度(speed)
	体积(size)等等
	方法移动(move())
	 设置速度(setSpeed(int speed))
	 加速speedUp(),
	 减速speedDown()等等.

	最后在测试类Vehicle中的main()中实例化一个交通工具对象
并通过方法给它初始化speed,size的值并且打印出来。
另外调用加速减速的方法对速度进行改变。
 */
public class Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.shezhi(15,10);
        vehicle.speedup();
        vehicle.speedup(100);
        vehicle.speeddown();
        vehicle.speeddown(115);
        vehicle.speeddown(10);
    }
  private   double speed;
    private   int size;

   //设置速度和体积
    public  void  shezhi(int speed,int size){
        this.speed = speed;
        this.size = size;
        System.out.println("速度为:"+speed+", 体积为:"+size);
    }

    //设置加速speedup
    public  void speedup(){
        this.speed+=10;
        System.out.println("您的加速度为:"+10+",您现在的速度为:"+speed);
    }
    public  void speedup(int speed){
        this.speed+=speed;
        System.out.println("您的加速度为:"+speed+",您的速度为:"+this.speed);
    }

    //设置减速度
    public  void speeddown(){
        if (this.speed>0){
            this.speed-=10;
            System.out.println("您的加速度为:"+10+",您现在的速度为:"+speed);
        }else {
            System.out.println("您已经静止下来了");
            return;
        }
    }
    public  void speeddown(int speed){
        if (this.speed>0){
            this.speed-=speed;
            System.out.println("您的减速度为:"+speed+",您的速度为:"+this.speed);
        }else {
            System.out.println("您已经静止下来了");
            return;
        }
    }
    public Vehicle(double speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public Vehicle() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
