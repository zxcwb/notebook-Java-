package 异常.测试题;

/**
 * 栈操作异常：自定义异常！
 */
public class MyStackOperationException extends Exception{ // 编译时异常！

    public MyStackOperationException(){

    }

    public MyStackOperationException(String s){
        super(s);
    }

}
