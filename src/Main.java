import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nhập địa chỉ email: ");
//        String email = sc.nextLine();
//
//        email = email.trim();
//
//        String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";
//
//        if (email.matches(regex)) {
//            System.out.println("Email hợp lệ");
//        } else {
//            System.out.println("Email không hợp lệ");
//        }


//        int n = 100000;
//
//        long startString = System.currentTimeMillis();
//
//        String str = "Hello";
//        for (int i = 0; i < n; i++) {
//            str += " World";
//        }
//
//        long endString = System.currentTimeMillis();
//        long startBuilder = System.currentTimeMillis();
//
//        StringBuilder sb = new StringBuilder("Hello");
//        for (int i = 0; i < n; i++) {
//            sb.append(" World");
//        }
//
//        long endBuilder = System.currentTimeMillis();
//        long startBuffer = System.currentTimeMillis();
//
//        StringBuffer sf = new StringBuffer("Hello");
//        for (int i = 0; i < n; i++) {
//            sf.append(" World");
//        }
//
//        long endBuffer = System.currentTimeMillis();
//
//        System.out.println("Thời gian thực hiện với String: "
//                + (endString - startString) + " ms");
//
//        System.out.println("Thời gian thực hiện với StringBuilder: "
//                + (endBuilder - startBuilder) + " ms");
//
//        System.out.println("Thời gian thực hiện với StringBuffer: "
//                + (endBuffer - startBuffer) + " ms");
//
//        System.out.println("\nNhận xét:");
//
//        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần "
//                + "do tạo ra nhiều đối tượng mới.");
//
//        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp "
//                + "cho nhiều thao tác nối chuỗi trong một luồng.");
//
//        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng "
//                + "an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");


//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nhập mật khẩu: ");
//        String password = sc.nextLine();
//
//        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";
//
//        if (password.matches(regex)) {
//            System.out.println("Mật khẩu hợp lệ");
//        } else {
//            System.out.println("Mật khẩu không hợp lệ");
//        }


//        Scanner sc = new Scanner(System.in);
//        Random rd = new Random();
//
//        System.out.print("Nhập n: ");
//        int n = sc.nextInt();
//
//        if (n < 1 || n > 1000) {
//            System.out.println("n phải nằm trong khoảng từ 1 đến 1000");
//            return;
//        }
//
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//                        + "abcdefghijklmnopqrstuvwxyz"
//                        + "0123456789";
//
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < n; i++) {
//            int index = rd.nextInt(characters.length());
//            result.append(characters.charAt(index));
//        }
//
//        System.out.println(result);


//        Scanner sc = new Scanner(System.in);
//        String str = "";
//
//        while (true) {
//
//            System.out.println("\n*********************** MENU ************************");
//            System.out.println("1. Nhập chuỗi");
//            System.out.println("2. Đếm số ký tự thường, hoa, số, đặc biệt");
//            System.out.println("3. Đảo ngược chuỗi");
//            System.out.println("4. Kiểm tra Palindrome");
//            System.out.println("5. Chuẩn hóa chuỗi (xóa khoảng trắng dư thừa, viết hoa chữ cái đầu)");
//            System.out.println("6. Thoát");
//
//            System.out.print("Lựa chọn của bạn: ");
//            int choice = Integer.parseInt(sc.nextLine());
//
//            switch (choice) {
//
//                case 1:
//                    System.out.print("Nhập chuỗi: ");
//                    str = sc.nextLine();
//                    break;
//
//                case 2:
//                    int lower = 0, upper = 0, digit = 0, special = 0;
//
//                    for (int i = 0; i < str.length(); i++) {
//                        char ch = str.charAt(i);
//
//                        if (Character.isLowerCase(ch)) {
//                            lower++;
//                        } else if (Character.isUpperCase(ch)) {
//                            upper++;
//                        } else if (Character.isDigit(ch)) {
//                            digit++;
//                        } else {
//                            special++;
//                        }
//                    }
//
//                    System.out.println("Số ký tự thường: " + lower);
//                    System.out.println("Số ký tự hoa: " + upper);
//                    System.out.println("Số chữ số: " + digit);
//                    System.out.println("Số ký tự đặc biệt: " + special);
//                    break;
//
//                case 3:
//                    String reversed = new StringBuilder(str).reverse().toString();
//                    System.out.println("Chuỗi đảo ngược: " + reversed);
//                    break;
//
//                case 4:
//                    String check = str.replaceAll("\\s+", "").toLowerCase();
//                    String reverseCheck = new StringBuilder(check).reverse().toString();
//
//                    if (check.equals(reverseCheck)) {
//                        System.out.println("Chuỗi là Palindrome.");
//                    } else {
//                        System.out.println("Chuỗi không phải Palindrome.");
//                    }
//                    break;
//
//                case 5:
//                    String normalized = str.trim().replaceAll("\\s+", " ");
//
//                    if (!normalized.isEmpty()) {
//                        normalized = normalized.substring(0, 1).toUpperCase()
//                                + normalized.substring(1).toLowerCase();
//                    }
//
//                    System.out.println("Chuỗi sau khi chuẩn hóa: " + normalized);
//                    break;
//
//                case 6:
//                    System.out.println("Tạm biệt!");
//                    return;
//
//                default:
//                    System.out.println("Lựa chọn không hợp lệ!");
//            }
//        }


        Scanner sc = new Scanner(System.in);
        ArrayList<String> listSV = new ArrayList<>();

        while (true) {
            System.out.println("\n*********************** MENU ************************");
            System.out.println("1. Thêm tên sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm tên sinh viên chứa từ khóa");
            System.out.println("4. Đếm số sinh viên có tên bắt đầu bằng chữ cái nhập vào");
            System.out.println("5. Sắp xếp danh sách tên theo thứ tự A-Z");
            System.out.println("6. Thoát");
            System.out.println("*****************************************************");

            System.out.print("Lựa chọn của bạn: ");
            String input = sc.nextLine();
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String name = sc.nextLine();
                    listSV.add(name);
                    System.out.print("Đã thêm: " + name);
                    break;

                case 2:
                    System.out.println("Danh sách sinh viên:");
                    if (listSV.isEmpty()) {
                        System.out.println("(Danh sách trống)");
                    } else {
                        for (int i = 0; i < listSV.size(); i++) {
                            System.out.println((i + 1) + ". " + listSV.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập từ khóa: ");
                    String key = sc.nextLine();
                    System.out.println("Kết quả tìm kiếm:");
                    boolean found = false;
                    for (String sv : listSV) {
                        if (sv.toLowerCase().contains(key.toLowerCase())) {
                            System.out.println(" - " + sv);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Không tìm thấy sinh viên nào.");
                    break;

                case 4:
                    System.out.print("Nhập chữ cái: ");
                    String charInput = sc.nextLine();
                    if (!charInput.isEmpty()) {
                        char firstChar = charInput.toLowerCase().charAt(0);
                        long count = listSV.stream()
                                .filter(s -> s.toLowerCase().startsWith(String.valueOf(firstChar)))
                                .count();
                        System.out.println("Số sinh viên có tên bắt đầu bằng '" + charInput.charAt(0) + "': " + count);
                    }
                    break;

                case 5:
                    Collections.sort(listSV);
                    System.out.println("Danh sách đã được sắp xếp A-Z.");
                    break;

                case 6:
                    System.out.println("Tạm biệt!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}