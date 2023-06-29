class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length() / 2;
            
        if(s.length() % 2 == 0)
            answer += s.charAt(n-1);
 
        answer += s.charAt(n);
        
        return answer;
    }
}