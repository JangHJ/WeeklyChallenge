import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pick = nums.length / 2;
        
        HashSet<Integer> numSet = new HashSet<>();
        
        for(int num : nums){
            numSet.add(num);
        }
        
        if(pick >= numSet.size()) answer = numSet.size();
        else answer = pick;
        
        return answer;
    }
}