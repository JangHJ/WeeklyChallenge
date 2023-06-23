import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, HashSet<String>> reportMap = new HashMap<>();
		Map<String, Integer> emailMap = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reportingId = new HashSet<>();
			reportMap.put(id_list[i], reportingId);
			emailMap.put(id_list[i], 0);
		}
        
        
        return answer;
    }
}