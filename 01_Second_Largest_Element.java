// Second Distinct Largest Element
public static int secondLargest(int[] nums) {
   int highest = nums[0];
   int secHighest= Integer.MIN_VALUE;
   for(int i = 1; i< nums.length; i++){
       int cur= nums[i];
       if(cur> highest){
           secHighest= highest;
           highest= cur;
       }
       else if((cur< highest) && (cur> secHighest)){
           secHighest= cur;
       }
   }
   if (secHighest == Integer.MIN_VALUE)  return -1;
   else return secHighest;
}
