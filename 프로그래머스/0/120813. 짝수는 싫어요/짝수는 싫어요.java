class Solution {
    public int[] solution(int n) {
        int num = 0;
        if(n%2==0){
            num = n / 2;
        }else{
            num = n / 2 + 1;
        }
        int[] answer = new int[num];
        int count = 0;
        for(int i = 0; i <= n; i ++){
            if(i%2 == 1){
                answer[count++] = i;
            }
        }
        return answer;
    }
}