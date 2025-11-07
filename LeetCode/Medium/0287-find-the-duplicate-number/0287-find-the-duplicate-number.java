class Solution {
    public int findDuplicate(int[] nums) {
        cyclicSort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans=nums[i];
            }
        }
        return ans;
    }
    public void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}