class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = 0;
        
        for(int i = 0; i <= array.length - 1; i++){
            if(maxNum < array[i]){
                maxNum = array[i];
                answer[0] = maxNum;
                answer[1] = i;
            }
        }
        return answer;
    }
}