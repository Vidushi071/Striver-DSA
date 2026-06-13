import java.util.HashSet;

public class ContainsDuplicate {
    public static void main() {
        int[] arr= {1,3,4,1};
        ContainsDuplicate obj = new ContainsDuplicate();
        System.out.println(obj.containsDuplicate(arr));
    }

    // TC : O(N) SC: O(N)
    public boolean containsDuplicate(int[] nums){

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
}
