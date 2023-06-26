class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int n = 0;
        String s = Integer.toString(x); //int x를 String으로 변환
        
        for(int i=0; i<s.length(); i++){
            n += Integer.parseInt(s.substring(i, i+1));
        }
        if (x % n == 0) answer = true;
        return answer;
    }
}