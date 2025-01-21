
package baitapdiem;
import java.util.ArrayList;
import java.util.Random;
public class excercise12 {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            int randomnumber = random.nextInt(100)+1;
            number.add(randomnumber);
        }
        System.out.println("danh sach cac so:" + number);
        int sum = 0;
        for(int hi : number){
            sum+= hi;
        }
        System.out.println("tong cac phan tu la:" + sum);
    }
}

