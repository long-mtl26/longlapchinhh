
package baitapdiem;
import java.util.ArrayList;
import java.util.Random;
public class excercise11 {
    public static void main(String[] args){
        ArrayList<Integer> so = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            
            
        }
        System.out.println("danh sach cac so la:" + so);
        int max = so.get(0);
        int min = so.get(0);
        for(int i=1;i<so.size();i++){
            if(so.get(i)>max){
                max = so.get(i);
            }
            if(so.get(i)<min){
                min = so.get(i);
            }
        }      
        System.out.println("so lon nhat trong danh sach la:" + max);
        System.out.println("so nho nhat trong danh sach la:" + min);
    }
}
