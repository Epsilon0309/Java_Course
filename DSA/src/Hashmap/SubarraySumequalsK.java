package Hashmap;

import java.util.HashMap;

public class SubarraySumequalsK {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -2, 2, 4, 1};
        int k = 3;
        System.out.println("Total subarrays with sum " + k + " is: " + findAllSubarraysWithSumK(nums, k));
    }

    public static int findAllSubarraysWithSumK(int[] nums, int k) {
        // Map to store (PrefixSum, Count of times this sum has occurred)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: A prefix sum of 0 has occurred once (for subarrays starting from index 0)
        map.put(0, 1);
        
        int cumulativeSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            cumulativeSum += nums[i];

            // If (cumulativeSum - k) exists in the map, it means there is a 
            // subarray ending here that sums to k
            if (map.containsKey(cumulativeSum - k)) {
                count += map.get(cumulativeSum - k);
            }

            // Update the map with the current cumulative sum
            map.put(cumulativeSum, map.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
    
    public static void findSubarray(int[] nums, int k) {
        int start = 0; // The "Left" Pointer
        int currentSum = 0;

        // "end" is the "Right" Pointer
        for (int end = 0; end < nums.length; end++) {
            // Add the current element to the window
            currentSum += nums[end];

            // If currentSum exceeds k, shrink the window from the left
            while (currentSum > k && start < end) {
                currentSum -= nums[start];
                start++;
            }

            // Check if we found the sum
            if (currentSum == k) {
                System.out.println("Subarray found between indexes " + start + " and " + end);
                return; 
            }
        }

        System.out.println("No subarray with sum " + k + " exists.");
    }
}
