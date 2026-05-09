package Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        String email = "";
        String phone = "";
        String password = "";

        do {
            System.out.println("\n******************QUẢN LÝ NGƯỜI DÙNG****************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Họ và tên: ");
                    name = sc.nextLine();
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    System.out.print("Điện thoại: ");
                    phone = sc.nextLine();
                    System.out.print("Mật khẩu: ");
                    password = sc.nextLine();
                    break;

                case 2:
                    String nameStrim = name.trim().replaceAll("\\s+"," ");
                    String[] arrStr = nameStrim.split(" ");

                    StringBuilder nameSB = new StringBuilder();
                    for (String element : arrStr) {
                        nameSB.append(Character.toUpperCase(element.charAt(0)))
                                .append(element.substring(1).toLowerCase())
                                .append(" ");
                    }

                    name = nameSB.toString().trim();
                    System.out.println("Tên sau chuẩn hóa: " + name);
                    break;

                case 3:
                    if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                        System.out.println("Email hợp lệ");
                    } else {
                        System.out.println("Email không hợp lệ");
                    }
                    break;

                case 4:
                    if (phone.matches("^0\\d{9}$")) {
                        System.out.println("Số điện thoại hợp lệ");
                    } else {
                        System.out.println("Số điện thoại không hợp lệ");
                    }
                    break;

                case 5:
                    if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!]).{8,}$")) {
                        System.out.println("Mật khẩu hợp lệ");
                    } else {
                        System.out.println("Mật khẩu không hợp lệ");
                    }
                    break;

                case 6:
                    System.out.println("Thoát chương trình");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (true);
    }
}