public class SearchElementRotatedSortedArray {

    // Brute Force -
    // TC; O(N) SC: O(1)
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){

            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // TC:(Log N) SC:(1)
    public int search2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;


        while(start <= end){
            int mid = (start +  end) / 2;

            if(nums[mid] == target)
                return mid;

            if (nums[start] <= nums[mid]) {
                if(nums[start] <= target  && target < nums[mid])
                    end = mid -1;
                else
                    start = mid + 1;

            }
            else
            {
                if (nums[mid] < target && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    static void main() {
        SearchElementRotatedSortedArray obj = new SearchElementRotatedSortedArray();
        System.out.println(obj.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(obj.search2(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

}
