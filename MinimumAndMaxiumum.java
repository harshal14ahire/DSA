class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        
        for(int i :arr)
        {
            if(i>max)
            {
                max=i;
            }
            if(i<min)
            {
                min=i;
            }
        }
        return new Pair(min,max);
        
        
        // Code Here
    }
}
