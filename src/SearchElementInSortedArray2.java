public class SearchElementInSortedArray2 {
    // Have duplictes in the array as well
    // Brute force will be the same to traverse through the whole array and print true as soon as the target is found

    // Optimal approach -

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target)
                return mid;

            if(nums[start] == nums[mid] && nums[end] == nums[mid])
            {
                start++;
                end--;
                continue;
            }

            if(nums[start] < nums[mid]) {
                if(nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                }
                else
                    start = mid + 1;

                }
            else {
                if(nums[mid] < target && target <= nums[end]) {

                    start = mid + 1;
                }
                else
                    end = mid - 1;


            }
        }
        return -1;
    }

    static void main() {
        SearchElementInSortedArray2 obj = new SearchElementInSortedArray2();
        System.out.println(obj.search(new int[]{7, 8, 1, 2, 3, 3, 3, 4, 5, 6}, 10));
    }
}
