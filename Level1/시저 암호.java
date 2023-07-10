class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        
        for(char c : ch) {
            if(c != ' ') {
                if(c == 'Z' || c == 'z') c -= 26;
                c += n;
                answer += c;
            } else
                answer += " ";
        }
        System.out.println(answer);
        return answer;
    }
}