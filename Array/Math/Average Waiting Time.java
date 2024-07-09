class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        double sum=0;
        int wait=customers[0][0];

        for(int i=0;i<n;i++)
        {
            int a=customers[i][0];
            if(a>wait)
            {
                wait+=(a-wait);
            }
            wait+=customers[i][1];
            sum+=(wait-a);
        }
        return sum/n;
    }
}
