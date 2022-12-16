public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] nums){
        int maxprofit = 0;
        int left = 0;
        int right = 1;
        while (right < nums.length){
            if(nums[left] < nums[right]){
                maxprofit = Math.max(maxprofit, nums[right] - nums[left]);
            }else{
                left = right;
            }
            right++;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
