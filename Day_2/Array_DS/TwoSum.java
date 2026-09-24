package Day_2.Array_DS;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
    
        int arr [] = {2,7,11,15};
        int target = 9;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            int com = target - arr[i];

            if(map.containsKey(com)){
                System.out.println(map.get(com) + " , " + i );
            }


            map.put(arr[i], i);
        }
        System.out.println(map);
    }
}
