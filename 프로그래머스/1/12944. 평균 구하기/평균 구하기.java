class Solution {
    public double solution(int[] arr) {
        int len = arr.length;
        double answer = 0;
        for(int num : arr){
            answer +=num;
        }
        return answer/len;
    }
}