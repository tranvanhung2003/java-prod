package _004_String_and_StringBuffer_and_StringBuilder;

// Đây là một class với trường value, name.
// Khi bạn khởi tạo đối tượng class này
// bạn không thể sét đặt lại value từ bên ngoài, và tất cả các trường khác của nó cũng thế.
// Class này không hề có các hàm để sét đặt lại các trường (field) từ bên ngoài.
// Nếu muốn bạn chỉ có thể tạo mới một đối tượng khác.
// Điều đó có nghĩa là class này là không thể thay đổi (immutable)
public class ImmutableClassExample {
    private final int value;
    private final String name;

    public ImmutableClassExample(String name, int value) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}