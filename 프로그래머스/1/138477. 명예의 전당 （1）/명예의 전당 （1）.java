import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        
        for(int i : score){
            num.add(i);
            if(num.size()>k){
                num.remove(Collections.min(num));
            }
            answer.add(Collections.min(num));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}