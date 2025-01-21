
package baitapdiem;
import java.util.Scanner;
import java.util.ArrayList;
public class excercise9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> so = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("nhap so thu " + (i+1) +  ":");
            int number = scanner.nextInt();
            so.add(number);
        }
        int max = so.get(0);
        int min = so.get(0);
        for(int i=1;i<so.size();i++){
            if(so.get(i)>max){
                max=so.get(i);
            }
            if(so.get(i)<min){
                min=so.get(i);
            }
        }
    }
}

