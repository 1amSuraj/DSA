class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int maxSum=Integer.MIN_VALUE;
        int windowSum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(grumpy[i]==1)
                arr[i]=customers[i];
        }
        int a=0;
        for(int i=0;i<minutes;i++)
        {
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        for(int i=minutes;i<n;i++)
        {
            windowSum+= arr[i]-arr[i-minutes];
            maxSum=Math.max(maxSum,windowSum);
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(grumpy[i]==0)
            {
                sum+=customers[i];
            }
        }
        return maxSum+sum;
    }
}
