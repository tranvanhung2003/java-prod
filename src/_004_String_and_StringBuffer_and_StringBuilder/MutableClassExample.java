package _004_String_and_StringBuffer_and_StringBuilder;

// Đây là một class có 1 trường value.
// Sau khi khởi tạo đối tượng bạn có thể sét đặt lại giá trị của trường value
// thông qua việc gọi method setNewValue(int).
// Như vậy đây là class có thể thay đổi (mutable).
public class MutableClassExample {

    @SuppressWarnings("unused")
    private int value;

    public MutableClassExample(int value) {
        this.value = value;
    }

    public void setNewValue(int newValue) {
        this.value = newValue;
    }

}