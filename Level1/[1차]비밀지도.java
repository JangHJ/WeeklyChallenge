class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            String s = "";
            String line1 = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            String line2 = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));
        
            for(int j = 0; j < n; j++) {
                if(line1.charAt(j) == '1' || line2.charAt(j) == '1')
                    s += "#";
                else
                    s += " ";
            }
            answer[i] = s;
        }
        return answer;
    }
}