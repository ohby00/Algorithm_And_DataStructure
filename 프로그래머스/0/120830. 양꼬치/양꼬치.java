class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int count = n / 10;
        int coke = k - count;
        
        answer = (n * 12000) + (coke * 2000);
        
        return answer;
    }
}