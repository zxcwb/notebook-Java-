package Method.Day15.One;

public class Test {
    public static void main(String[] args) {

        //账户对象
        Account account = new Account(1000,2000,1.23);

        //顾客对象
        Customer customer = new Customer("邹芊芊",account);
        customer.print();
        customer.getAccount().deposit(100000);
        customer.getAccount().withdraw(101000);
        customer.getAccount().withdraw(1001);
        customer.print();
    }
}
