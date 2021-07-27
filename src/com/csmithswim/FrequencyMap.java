package com.csmithswim;
import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args){

            int[] nums = new int[]{3,3,3};
            HashMap<Integer, Integer> numMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (numMap.containsKey(nums[i])) {
                    numMap.put(nums[i], numMap.get(nums[i]) + 1);
                    continue;
                }
                numMap.put(nums[i], 1);
            }

            int highestNumberFrequency = 0;
            int highestNumber = 0;

            for (int i = 0; i < nums.length; i++) {
                if (numMap.get(nums[i]) > highestNumberFrequency) {
                    System.out.println(numMap.get(nums[i]));
                    if (numMap.get(nums[i]) > highestNumberFrequency) {
                        highestNumberFrequency = numMap.get(nums[i]);
                    }
                }

                for (Map.Entry<Integer, Integer> entry : numMap.entrySet())
                    if (entry.getValue() == highestNumberFrequency) {
                        highestNumber = entry.getKey();
                    }
            }
            System.out.println(highestNumber);
        }
    }
}