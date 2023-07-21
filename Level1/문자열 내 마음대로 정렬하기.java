import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list); //n번째 인덱스 문자로 먼저 정렬해준 후,
        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {//앞문자를 제외한 문자열을 answer에 add
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        return answer;
    }
}