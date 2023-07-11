class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();

        for(char c : ch) {
            if(c != ' ') {
                int c2 = (int)c + n;
                if(Character.isUpperCase(c)){ // 대문자 A-Z 65~90
                    if(c2 > 90){
                        c = '@';
                        c += (c2 - 90);   
                    }
                    else c += n;
                }else if(Character.isLowerCase(c)){ // 소문자 a-z 97~122
                    if(c2 > 122){
                        c = '`';
                        c += (c2 - 122);   
                    }
                    else c += n;
                }
                answer += c;
            } else
                answer += " ";
        }
        System.out.println(answer);
        return answer;
    }
}