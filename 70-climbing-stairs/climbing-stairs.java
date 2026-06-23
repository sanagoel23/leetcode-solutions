class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        if(n==0 || n==1) return 1;  
        if(cache.get(n) != null)
            return cache.get(n);
        
        int total = climbStairs(n-1) + climbStairs(n-2);
        cache.put(n, total);
        return total;
    }
}