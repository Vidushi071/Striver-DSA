public class MaxSubArray {

    // TC: O(N^2) SC: O(1)
    public int maxSubArray( int[] nums){
        int sum;
        int max = Integer. MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                max = Math.max(sum, max);
            }

        }
        return max;
    }

    // Kadane Algorithm
    // TC: O(N) SC: O(1)
    public int  maxSubArray2(int[] nums){
        int max = Integer. MIN_VALUE;
        int sum =0;
        for(int i =0;i<nums.length;i++){

            sum+= nums[i];
            if(sum < 0)
                sum = 0;

            max = Math.max(sum, max);

        }
        return max;
    }

    public void maxSubArray3(int[] nums){
        int max = Integer. MIN_VALUE;
        int sum =0;
        int start = 0;
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == 0)
            {
                start = i;
            }
            if(sum > max)
            {
                max = sum;
                startIndex = start;
                endIndex = i;
            }

            if(sum < 0)
            {
                sum = 0;
            }
        }

        for(int i = startIndex; i <= endIndex; i++){
            System.out.print(nums[i]+" ");
        }

    }

    static void main() {
        MaxSubArray obj = new MaxSubArray();
        int ans = obj.maxSubArray(new int[]{2, 3, 5, -2, 7, -4});
        int ans2 = obj.maxSubArray2(new int[]{2, 3, 5, -2, 7, -4});
        obj.maxSubArray3(new int[]{2, 3, 5, -2, 7, -4});
        //System.out.println(ans);
       // System.out.println(ans2);
    }
}
