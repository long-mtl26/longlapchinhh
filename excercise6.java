
package baitapdiem;
import java.util.ArrayList;
import java.util.Random;
public class excercise6 {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        Random random  = new Random();
        for(int i=0;i<15;i++){
            number.add(random.nextInt(50)+1);
    }
        int chan = 0 , le = 0;
        for(int num : number){
            if(num%2==0){
                chan++;
        }else{
                le++;
            }
        }
        System.out.println("danh sach so:" + number);
        System.out.println("in so chan:" + chan);
        System.out.println("in so le:" + le);
    }
}
