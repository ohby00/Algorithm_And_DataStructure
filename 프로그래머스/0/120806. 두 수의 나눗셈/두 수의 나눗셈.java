class Solution {
    public int solution(int num1, int num2) {
        double num = (double) num1 / num2; // 정수 나눗셈을 피하기 위해 num1을 double로 형변환
        int answer = (int) (num * 1000); // 계산 결과를 int로 형변환
        return answer;
    }
}
