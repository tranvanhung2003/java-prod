package _005_thu_tu_chay_trong_class;

public class Parent {
    static {
        System.out.println("1. Static Cha");
    }
    {
        System.out.println("3. Instance Cha");
    }

    Parent() {
        System.out.println("4. Constructor Cha");
    }
}
