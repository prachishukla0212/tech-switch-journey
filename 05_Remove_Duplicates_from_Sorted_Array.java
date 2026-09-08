// LeetCode 26 — Remove Duplicates from Sorted Array
public static int removeDuplicates(int[] nums) {
    int i =0;
    int j= 0;
    int lastNum= nums[i];
    while(j<nums.length){
        if(nums[j] != lastNum){
            i++;
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            lastNum= nums[i];
        }
        j++;
    }
    return i+1;
}
