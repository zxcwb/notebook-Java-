package Method.Test;

public class Test01 {
    public static void main(String[] args) {
        Husband husband = new Husband("周绪驰");
        Wife wife = new Wife(husband);
        System.out.println(wife.husband.name);
    }
}
