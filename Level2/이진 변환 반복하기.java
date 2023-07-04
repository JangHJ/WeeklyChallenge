class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length() > 1) {
            int len = 0; // 0 제거 후 길이 담을 변수
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '0')
                    answer[1]++; // 제거할 0의 개수
                else
                    len++; // 1 만날 때마다 카운트
            }
            s = Integer.toBinaryString(len); // 10진수 -> 2진수
            answer[0]++; // 회차
        }   
        return answer;
    }
}