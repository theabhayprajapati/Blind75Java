import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer>  set = new HashSet<>();
        for (int e : nums) {
            if (set.contains(e)) {
                return true;
            } else {
                set.add(e);
            }
        }
        return false;
    }
}
