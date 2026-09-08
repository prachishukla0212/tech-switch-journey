// LeetCode 209 — Minimum Size Subarray Sum
// STATUS: NEEDS REVIEW
public static int minSubArrayLen(int target, int[] nums) {
   int i= 0;
   int j= 0;
   int sum= 0; int length= Integer.MAX_VALUE;
   while(j<nums.length){
       sum= sum+nums[j];
       while(sum>=target){
           if(length> ((j-i)+1)){
               length= (j-i)+1;
           }
           sum= sum-nums[i];
           i++;
       }
       j++;
   }
   if(length==Integer.MAX_VALUE) return 0;
   else return length;
}
