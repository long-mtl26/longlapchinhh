
package baitapdiem;
import java.util.ArrayList;
import java.util.Scanner;
public class excercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        System.out.print("nhap mang:");
        for(int i=0;i<5;i++){
            number.add(scanner.nextInt());
    }
        int size = number.size();
        for(int i=0;i<size/2;i++){
            int temp = number.get(i);
            number.set(i,number.get(size-1-i));
            number.set(size-1-i, temp);
        }
        System.out.println("sau khi dao nguoc:" + number);
    }
}
