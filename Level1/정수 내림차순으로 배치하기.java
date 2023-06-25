import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
		
		String str = Long.toString(n); //long 문자열로 변환
		String[] arr = str.split(""); //자릿수 하나씩 배열에 저장
		
		Arrays.sort(arr, Collections.reverseOrder()); //배열 내림차순 정렬
		str = String.join("", arr); //배열에 있는 문자 하나씩 추가
		answer = Long.parseLong(str); //문자열 long으로 변환
		
		return answer;
    }
}