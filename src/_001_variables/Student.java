package _001_variables;

public class Student {
    // biến static 'name '
    public static String name = "GP Coder";

    // biến static 'age '
    public static int age = 21;

    public static void main(String args[]) {
        // Sử dụng biến static bằng cách gọi trực tiếp
        System.out.println("Name: " + name);

        // Sử dụng biến static bằng cách gọi thông qua tên class
        System.out.println("Age: " + Student.age);
    }
}
