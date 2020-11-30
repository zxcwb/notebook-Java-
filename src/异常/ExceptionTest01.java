package 异常;
/*
java的异常处理机制是程序员对代码出现的不正常的情况处理更加简单
什么是异常：程序执行过程中的不正常情况
异常的作用：增强程序的健壮性
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
       int result = m();
        System.out.println(result);
        /*
        1、Java中方法体的代码必须遵循自上而下执行
        2、return语句一旦执行，整个方法必须结束
         */
    }
    public static  int m() {
        int i = 100;
        try {
            return i;
        }finally {

        }

    }
}

