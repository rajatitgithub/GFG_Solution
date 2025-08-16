/*Complete the Function below*/
class Solution {
    public static boolean isPalindrome(int n){
        int temp = n;
        int num = 0;
        while(n > 0){
            int rem = n % 10;
            num =(num * 10) + rem;
            n /= 10;
        }
        if(num == temp){ 
            return true;
            
        }
        return false;
    }
    public static boolean isPalinArray(int[] arr) {
        for(int num : arr){
            if(!isPalindrome(num)) return false;
        }
        return true;
    }
}