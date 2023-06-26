class Solution {
    public int solution(int num) {
        int count = 0; //반복한 횟수
        long lnum = Long.valueOf(num);
        while(lnum != 1){
            if(count == 500){
                return -1;
            }
            if(lnum % 2 == 0) lnum /= 2;
            else lnum = lnum*3 + 1;
            count++;   
        }
        return count;
    }
}