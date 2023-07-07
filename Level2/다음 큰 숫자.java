class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = countChar(Integer.toBinaryString(n), '1'); // n의 2진수 1의 갯수
        int n2 = n;
        
        while(true){
            n2++;
            int cnt2 = countChar(Integer.toBinaryString(n2), '1');
            if(cnt == cnt2){
                answer = n2;
                break;
            }
        }
        return answer;
    }
    public int countChar(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}