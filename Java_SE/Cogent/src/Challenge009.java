
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Challenge009 {
    public void d(int[] array){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    hashSet.add(array[i]);
                }
            }
        }
        Iterator itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Challenge009 c = new Challenge009();
        int[] userArray = {1, 2, 3, 4, 5, 2, 3, 4};
        c.d(userArray);
    }
}
