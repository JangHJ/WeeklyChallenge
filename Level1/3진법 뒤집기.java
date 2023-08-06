class Solution {
    public int solution(int n) {
        String answer = "";
        String n3 = Integer.toString(n,3);
        
        for(int i=n3.length()-1; i>=0; i--){
            answer += n3.charAt(i);
        }
        return Integer.parseInt(answer, 3);
    }
}