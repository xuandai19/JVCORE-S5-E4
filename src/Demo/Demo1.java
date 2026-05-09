package Demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        String fullNameRegex = "H.i";
        String inputFullName = "Dai";
        System.out.println("Kết quả so khớp: " + Pattern.matches(fullNameRegex, inputFullName));

        Scanner input = new Scanner(System.in);
        String phoneRegex = "(090|091|092|093|094|095)\\d{7}";
        System.out.println("Nhập vào số đt của bạn: ");
        String phone = input.nextLine();
        if (Pattern.matches(phoneRegex, phone)) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
