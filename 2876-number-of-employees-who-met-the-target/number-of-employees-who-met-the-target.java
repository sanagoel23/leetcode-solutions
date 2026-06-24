class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
       
    if(target < 0) 
        return count;
    for(int i = 0; i < hours.length; i++) {
        if(hours[i] < target) {
            continue;
        } else {
            count ++;
            
        }
    }
    return count;
    }
}