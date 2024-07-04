class Solution {
    public int removeElement(int[] arr, int val) {
        int i,c=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[c]=arr[i];
                c++;
            }
        }
        return c;
    }
}
