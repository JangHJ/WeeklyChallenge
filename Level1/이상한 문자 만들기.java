class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++)
            {
                if((j+1) % 2 == 0)
                    answer += arr[i].charAt(j);
                else
                    answer += Character.toUpperCase(arr[i].charAt(j));
            }
            if(i < arr.length-1)
                answer += " ";
        }
        return answer;
    }
}