package Method.Day15.One;

public class Customer {
 private String name;
 private Account account;


      //打印基本信息
      public void print(){
          System.out.println("您的名字叫:"+this.name+", 账户ID:"+this.getAccount().getId()+", 余额为:"+this.getAccount().getBalance()+", 年利率为:"+this.getAccount().getRate());
      }


    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
