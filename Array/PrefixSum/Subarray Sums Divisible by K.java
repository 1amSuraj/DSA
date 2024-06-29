class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        Map <Integer,Integer> map=new HashMap<>();
        int sum=0,c=0;
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            int remainder=sum%k;
            if (remainder<0)
            {
                remainder+=k;
            }
            if(map.containsKey(remainder))
            {
                c+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return c;
    }
}
