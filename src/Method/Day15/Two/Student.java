package Method.Day15.Two;
/*
(封装)已知一个类 Student 代码如下：
class Student{
	String name;
	int age;
	String address;
	String zipCode;
	String mobile;
}
要求：
	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法。
	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的地址和邮编。
 */
public class Student {
    public static void main(String[] args) {
        Student student = new Student("荆州市","431700");
        student.getPostAddress();
    }
      private String name;
      private   int age;
      private String address;
      private String zipCode;
      private String mobile;

   //getPostAddress方法
    public  void getPostAddress(){
        System.out.println("地址为:"+this.address+",邮编为:"+this.zipCode);
    }

    public Student(String address, String zipCode) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipCode = zipCode;
        this.mobile = mobile;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
