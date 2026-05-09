import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random rd = new Random();

       System.out.print("Nhập n: ");
       int n = sc.nextInt();

       if (n < 1 || n > 1000) {
           System.out.println("n phải nằm trong khoảng từ 1 đến 1000");
           return;
       }

       String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                       + "abcdefghijklmnopqrstuvwxyz"
                       + "0123456789";

       StringBuilder result = new StringBuilder();

       for (int i = 0; i < n; i++) {
           int index = rd.nextInt(characters.length());
           result.append(characters.charAt(index));
       }

       System.out.println(result);
    }
}
