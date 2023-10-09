import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] score = {0, 0, 0};
        int[] std1 = {1,2,3,4,5}; 
        int[] std2 = {2,1,2,3,2,4,2,5}; 
        int[] std3 = {3,3,1,1,2,2,4,4,5,5}; 
        
        for(int i=0; i<answers.length; i++){
            if(std1[i%5] == answers[i]) score[0]++;
            if(std2[i%8] == answers[i]) score[1]++;
            if(std3[i%10] == answers[i]) score[2]++;
        }
        
        int max = Math.max(Math.max(score[0], score[1]),score[2]); // max값 구하기
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(score[0] == max) list.add(1);
        if(score[1] == max) list.add(2);
        if(score[2] == max) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);            
        }
        
        return answer;
    }
}