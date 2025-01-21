
package baitapdiem;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
public class  excercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ten = new ArrayList<>();
        
        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Tên thứ " + (i + 1) + ": ");
            String tenn = scanner.nextLine();
            ten.add(tenn);
        }
        
        System.out.println("Danh sách ban đầu: " + ten);
        HashSet<String> uniqueNamesSet = new HashSet<>(ten);
        ArrayList<String> uniqueNamesList = new ArrayList<>(uniqueNamesSet);
        System.out.println("Danh sách không trùng lặp: " + uniqueNamesList);
    }
}
