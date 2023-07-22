import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(i != j && !list.contains(sum))
                    list.add(sum);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}