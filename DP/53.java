// o (n^2) approach
class Solution {
    public int maxSubArray(int[] nums) {
        // no window size given
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

        int[] prefSum = new int[n];
        prefSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefSum[i] += prefSum[i-1] + nums[i];
        }
        // sum of a subarray from  i to j should come out to prefSum[j] - prefSum[i-1]
        int max = nums[0];

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum;

                if(i == 0) sum = prefSum[j];
                else sum = prefSum[j] - prefSum[i-1];
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
