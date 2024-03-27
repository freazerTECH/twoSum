package com.sortredSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[]arr3= {2,7,11,15};
        int target=9;
        List<Integer>ans= twoSum(arr3,target);
        System.out.println("sum Value index is : " +""+ ans);
    }

    public static List twoSum(int[] arr, int target){
        Map<Integer,Integer> indexMap= new HashMap<>();
        List<Integer>list = new ArrayList<>();
        for (int i=0; i< arr.length;i++){
            Integer sumIndex= indexMap.get(arr[i]);
            if(sumIndex!=null){
                list.add(i);
                list.add(sumIndex);

                return  list;

            }
            indexMap.put(target-arr[i],i);
        }

        return  list;
    }
}
