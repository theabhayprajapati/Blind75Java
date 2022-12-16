 import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans =new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i])!=null){
                ans[0] =i;
                ans[1] = map.get(target-nums[i]);
                return ans;
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int [] ans = twoSum(arr, 9);
        for (int an : ans) {
            System.out.println(an);
        }
    }

}
