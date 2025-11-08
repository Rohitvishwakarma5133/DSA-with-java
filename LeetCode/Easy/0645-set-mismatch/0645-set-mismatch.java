class Solution {
    public int[] findErrorNums(int[] nums) {
        cycleSort(nums);
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                result[0]=nums[i];
                result[1]=i+1;
                break;
            }
        }
        return result;
    }
    public void cycleSort(int[] arr){
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
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}