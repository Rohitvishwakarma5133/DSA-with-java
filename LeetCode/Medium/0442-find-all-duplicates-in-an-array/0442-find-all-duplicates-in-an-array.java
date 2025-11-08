class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer=new ArrayList<>();
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                answer.add(nums[i]);
            }
        }
        return answer;
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