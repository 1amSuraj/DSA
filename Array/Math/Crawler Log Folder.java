class Solution {
    public int minOperations(String[] logs) {
        int n=logs.length;
        String a="../";
        String b="./";
        int len=0;
        for(int i=0;i<n;i++)
        {
            if(logs[i].equals(a))
            {
                if(len!=0) len--;
            }
            else if(logs[i].equals(b)) continue;
            else len++;
        }
        return len;
    }
}
