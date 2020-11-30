package Method.Day15.One;
/*
写一个名为Account的类模拟账户。
该类的属性和方法如下所示。
该类包括的属性：账户id，余额balance，年利率annualInterestRate；
包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()

写一个测试程序
（1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
（2）对Jane Smith操作：
存入100元，再取出960元，再取出2000。
打印Jane Smith的基本信息
信息如下显示：
成功存入：100
成功取出：960
余额不足，取钱失败
Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0
 */
public class Account {
   private int id;
   private double balance;
   private double rate;

    //取款方法
    public void withdraw(double cash){
        if (this.balance>=cash) {
            double newbalance = this.balance - cash;
            this.balance = newbalance;
            System.out.println("取钱成功！"+",取款金额为"+cash+",现有余额为"+newbalance+"元");
        }else {
            System.out.println("您的余额不足！"+"您的余额为"+this.balance);
        }
    }

    //存款方法
    public  void deposit(double cash){
        double newbalance = this.balance +cash;
        this.balance = newbalance;
        System.out.println("存款成功！"+",存入"+cash+"元,"+"现有金额为"+newbalance+"元");
    }

   //set and get
   public void setId(int id){
       this.id = id;
   }
   public int getId(){
       return id;
   }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    //构造方法

    public Account(int id, double balance, double rate) {
        this.id = id;
        this.balance = balance;
        this.rate = rate;
    }

    public Account() {
    }
}
