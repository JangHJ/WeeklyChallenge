class Solution {
    public String solution(String s) {
        String answer = "";        
        String[] arr = s.split(" ");
        
        int min = Integer.parseInt(arr[0]); //최소값
        int max = Integer.parseInt(arr[0]); //최대값
        
        for(int i=0; i<arr.length; i++){
            int n = Integer.parseInt(arr[i]);
            if(max < n)
                max = n;
            
            if(min > n)
                min = n;
        }
        answer = min + " " + max;
        return answer;
    }
}