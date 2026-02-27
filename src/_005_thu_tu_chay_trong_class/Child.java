package _005_thu_tu_chay_trong_class;

public class Child extends Parent {
    static {
        System.out.println("2. Static Con");
    }

    String name = gánTên(); // Khởi tạo trực tiếp thuộc tính

    {
        System.out.println("6. Instance Con");
    }

    Child() {
        // super() ngầm định ở đây (đã chạy bước 3, 4)
        System.out.println("7. Constructor Con");
    }

    String gánTên() {
        System.out.println("5. Gán giá trị thuộc tính Con");
        return "Gemini";
    }

    public static void main(String[] args) {
        System.out.println("8. Main method");
        new Child();
    }
}