package baitapdiem;
import java.util.ArrayList;
import java.util.Scanner;

public class excercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> traicay = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nhập tên trái cây thứ " + i + ": ");
            String trai = scanner.nextLine();
            traicay.add(trai);
        }

        System.out.println("\nDanh sách trái cây: " + traicay);
    }
}
