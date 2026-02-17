package QueueImpl;
 
import java.util.*;
 
public class MaximumSlidingWindow {
 
 
    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};

        System.out.println(maxSlidingWindow(nums, 3));

    }
 
    public static List<Integer> maxSlidingWindow1(int[] nums, int k) {
 
        List<Integer> result = new ArrayList<>();

        Deque<Integer> dq = new ArrayDeque<>();
 
        for (int i = 0; i < nums.length; i++) {

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {

                dq.pollLast();

            }

            dq.offerLast(i);

            if (dq.peekFirst() <= i - k) {

                dq.pollFirst();

            }

            if (i >= k - 1) {

                result.add(nums[dq.peekFirst()]);

            }

        }

        return result;

    }
 
 
    public static List<Integer> maxSlidingWindow(int[] num,int k){
 
        List<Integer> list=new ArrayList<>();
 
        int n=num.length;

        for (int i = 0; i <= n-k; i++) {
 
            int max=num[i];
 
            for (int j = i; j < i+k; j++) {

                max=Math.max(max,num[j]);

            }
 
            list.add(max);
 
        }
 
        return list;
 
    }

}

 