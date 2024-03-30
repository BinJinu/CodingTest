import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i= 0;i<answer.length;i++){
            int[] num = new int[commands[i][1]-(commands[i][0]-1)];
            
            for(int j=0; j<num.length;j++){
                num[j]=array[j+(commands[i][0]-1)];
            }
            Arrays.sort(num);
            answer[i] = num[(commands[i][2]-1)];
        }
        return answer;
    }
}
