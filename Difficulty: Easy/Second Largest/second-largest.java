class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int smax = -1;
        for(int num : arr){
            if(max < num){
                smax = max;
                max = num;
            }
            else if(smax < num && num < max){
                smax = num;
            }
        }
        return smax;
        
    }
}