package _001_variables;

public class VariableTutorial {
    // Hằng số
    final int hangSo = 10;

    // Biến toàn cục
    String bienToanCuc = "Đây là biến toàn cục";
    int number1 = 10;

    public void testVarial() {
        // Biến bình thường có thể thay đổi giá trị
        number1 = 20; // Có thể thay đổi

        // Hằng số không thể thay đổi giá trị
        // hangSo = 50; // Lỗi: không thể thay đổi
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Biến cục bộ
        String bienCucBo = "Đây là biến cục bộ";
    }
}
