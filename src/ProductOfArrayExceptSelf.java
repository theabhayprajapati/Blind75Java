public class ProductOfArrayExceptSelf {

    private static int[] productExceptSelf(int[] nums){
        int[] pre = new int[nums.length];
        int[] post  = new int[nums.length];
        int[] ans = new int[nums.length];
        //going through all the values of array.
        for(int i =0;i<nums.length;i++){
            //for cal. pre of given number.
            int totalPre =1;
            for(int j =0;j<i;j++){
                totalPre *= nums[j];
            }
            pre[i] = totalPre;
            int totalPost =1;
            for(int j =i+1; j<nums.length;j++){
                totalPost *= nums[j];
            }
            post[i] = totalPost;
        }

        for(int i=0;i<nums.length;i++){
            ans[i] = pre[i]*post[i];
        }
        return  ans;
    }
    // CONS : O(n^2) time complexity.
    // PROS : O(1) space complexity.
    private static int[] productExceptSelf2(int[] nums){
        int[] ans = new int[nums.length];
        //initializing ans array with 1
        for(int i =0;i<ans.length;i++){
            ans[i] = 1;
        }
        int pre = 1;
        int post = 1;
        for(int i =0;i<nums.length;i++){
            ans[i] *= pre;
            pre *= nums[i];
            ans[nums.length-1-i] *= post;
            post *= nums[nums.length-1-i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf2(nums);
        for (int an : ans) {
            System.out.println(an);
        }

    }
}
