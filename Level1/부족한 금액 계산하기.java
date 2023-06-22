class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0, sum = 0;
        
        for(int i=1; i<=count; i++){
            sum += price * i;
        }
        if(sum > money){
            answer = sum - money;
        }
        return answer;
    }
}