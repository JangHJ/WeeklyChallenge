class Solution {
    public String solution(String s) {
        String answer = "";
        int first = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 65){
                if(first == 0)
                    answer += Character.toUpperCase(c);
                else
                    answer += Character.toLowerCase(c);
                first++;
            }else{
                answer += c;
                first++;
                if(c == ' ')
                    first = 0;
            }
        }
        return answer;
    }
}