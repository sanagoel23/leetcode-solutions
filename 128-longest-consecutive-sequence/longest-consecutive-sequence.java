class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLen = 0;
        for (int num : nums) 
            set.add(num);
        for (int elem : set)
        {
            if(!set.contains(elem - 1))
            {
                int len = 1;
                while(set.contains(elem + len))
                len ++;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
           
    }
}