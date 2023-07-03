class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = n < m ? gcd(m, n) : gcd(n, m);
        answer[1] = n*m / answer[0];
        
        return answer;
    }
    public int gcd(int big, int small){
        if(big % small == 0) {
            return small;
        }
        return gcd(small, big%small);
    }
}