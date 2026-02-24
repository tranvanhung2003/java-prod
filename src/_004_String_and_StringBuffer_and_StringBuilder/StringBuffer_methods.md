// Cấu tử.
StringBuffer() // an initially-empty StringBuffer
StringBuffer(int size) // with the specified initial size
StringBuffer(String s) // with the specified initial content

// Độ dài
int length()

// Các method xây dựng nội dung
// type ở đây có thể là kiểu nguyên thủy (primitive), char[], String, StringBuffer, .v.v..
StringBuffer append(type arg) // ==&gt; chú ý (ở trên)
StringBuffer insert(int offset, type arg) // ==&gt; chú ý (ở trên)

// Các method thao tác trên nội dung.
StringBuffer delete(int start, int end)
StringBuffer deleteCharAt(int index)
void setLength(int newSize)
void setCharAt(int index, char newChar)
StringBuffer replace(int start, int end, String s)
StringBuffer reverse()

// Các method trích ra toàn bộ hoặc một phần dữ liệu.
char charAt(int index)
String substring(int start)
String substring(int start, int end)
String toString()

// Các method tìm kiếm vị trí.
int indexOf(String searchKey)
int indexOf(String searchKey, int fromIndex)
int lastIndexOf(String searchKey)
int lastIndexOf(String searchKey, int fromIndex)
