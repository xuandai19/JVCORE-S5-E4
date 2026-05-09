package Demo;

public class Demo2 {
    public static void main(String[] args) {
        //1. Khởi tạo nguyên thủy
        String str1 = "Hello World";
        String str3 = "Hello World";
        //2. tham chiếu
        String str2 = new String("Hello World");
        String str4 = new String("Hello World");
        /*
        So sánh chuỗi:
            - sử dụng toán tử == : So sánh tuyệt đối, cả gtri và địa chỉ ô nhớ
            - sử dụng phương thức equals: so sánh tương đối, so sánh giá trị
         */
        // So sánh vs toán tử ==
        System.out.println("Kết quả ss str1 và str2 == : " + (str1 == str3)); //true
        System.out.println("Kết quả ss str1 và str2 == : " + (str1 == str2)); //false
        System.out.println("Kết quả ss str1 và str2 == : " + (str2 == str4)); //false

        System.out.println("Kết quả ss str1 và str2 equals : " + str1.equals(str3)); //true
        System.out.println("Kết quả ss str1 và str2 equals : " + str1.equals(str2)); //true
        System.out.println("Kết quả ss str1 và str2 equals : " + str2.equals(str4)); //true

        //int length() trả ra độ dài chuỗi
        System.out.println("Độ dài chuỗi str1 " + str1.length());
        //char charAt(index): trả ra kty có chỉ số index
        System.out.println("Ký tự có chỉ số 2 trong str1: " + str1.charAt(2));
        //String concat(str) nối chuỗi
        System.out.println("Nối chuỗi str1 + cntt: " + str1.concat("CNTT"));
        //String toUpperCase(): viết hoa
        System.out.println("Viết hoa chuỗi " + str1.toUpperCase());
        //String toLowerCase() viết thường
        System.out.println("Viết thường chuỗi " + str1.toLowerCase());
        //String trim() cắt khoảng trắng 2 đầu
        String str5 = "         Hello World      ";
        System.out.println("Cắt khỏang trắng 2 đầu " + str5.trim());
        //int compareTo(str): trả về độ lệch giữa 2 chuỗi, nếu bằng nhau trả về 0
        String str6 = "Hello";
        String str7 = "Hi";
        System.out.println("Độ lệch của 2 chuỗi str6 và str7 : " + str6.compareTo(str7));
        // boolean contains(str): kiểm tra chuỗi hiện tại có chứa chuỗi str hay không
        System.out.println("Kiểm tra str1 có chứa Hello không :" + str1.contains("Hello"));
        // int indexOf(String str | char ch): trả về chỉ số của str hoặc ch trong chuỗi hiện tại
        System.out.println("Chỉ số của Hello trong str là: "+ str1.indexOf("Hello"));
        // String replace(old,new): thay thế chuỗi old thành new
        System.out.println("Thay đổi chuỗi Hello thành Hi trong str1: "+ str1.replace("Hello", "Hi"));
        //boolean startWith(str) ktra chuỗi hiện tại có bắt đầu là str hay không
        //boolean endWith(str) ktra chuỗi hiện tại có kết thúc là str hay không
        System.out.println("Kiểm tra " + str1.startsWith("Hello"));
        System.out.println("Kiểm tra " + str1.endsWith("Hi"));
        //String split(string regx) cắt chuỗi hiện tại theo chuỗi biểu thức chính quy
        System.out.println("Cắt chuỗi str1 theo kí tự space: ");
        String[] arrStr = str1.split(" ");
        System.out.println("Sau khi cắt ");
        for (String element : arrStr) {
            System.out.println(element);
        }
        // String subString(index) cắt chuỗi từ vt index đến cuối chuôi
        // String subString(begin,end) cắt từ begin -> end
        System.out.println("Cắt str1 từ 2 đến cuối :" + str1.substring(2));
        System.out.println("Cắt str1 từ 3 đến 5: " + str1.substring(3, 5));
        //boolean equalsEngoreCase(str) so sánh kh phân biệt hoa thường
        String str8 = "hello world";
        System.out.println("So sánh str1 và str8 không phân biệt hoa thường " + str1.equalsIgnoreCase(str8));

        /*
         * STRING BUILDER mutable
         */
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("Nối chuỗi sb với CNTT: " + sb.append(" CNTT"));
        System.out.println("Chèn chuỗi Hi vào đầu sb : " + sb.insert(0, "Hi-"));
        System.out.println("Đảo ngc chuỗi sb: " + sb.reverse());

    }
}
