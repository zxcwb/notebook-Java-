package 集合.Map集合;

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("url","jdbc:mysql://localhost:3306/bjpowernode");
        properties.setProperty("driver","com.mysql.jdbc.Driver");
        properties.setProperty("username","root");
        properties.setProperty("password","123456");

        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
