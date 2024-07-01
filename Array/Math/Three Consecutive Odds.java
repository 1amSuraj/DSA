class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        int c=0;
        for(int num:arr)
        {
            if(num%2!=0)
            c++;
            else
            c=0;

            if(c==3)
            return true;
        }
        
        return false;
    }
}
