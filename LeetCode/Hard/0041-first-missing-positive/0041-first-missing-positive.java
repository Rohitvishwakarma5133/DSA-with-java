class Solution {
    public int firstMissingPositive(int[] nums) {
        cycleSort(nums);
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
       
    }
     public void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
           int correct=arr[i]-1;
           if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
            swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}