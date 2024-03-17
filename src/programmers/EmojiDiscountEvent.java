package programmers;
import java.util.*;

public class EmojiDiscountEvent {
    // 설정 값
    static int[][] users = {{40, 10000},{25, 10000}};
    static int[] emoticons = {7000, 9000};

    static int[] fixDisCount = {0, 10, 20, 30, 40};
    static int AllJoin = 0;
    static int AllPrice = 0;
    static int MinPrice = 0;

    /*
    1번 목표 - 이모티콘 플러스 서비스 가입자를 최대한 늘리는 것.
    2번 목표 - 이모티콘 판매액을 최대한 늘리는 것.
    */
    public static void main(String[] args) {

        // 이모티콘의 할인율을 결정하는 조합 생성
        int[] emoticonDiscount = new int[emoticons.length];
        EtcAndDctCombo(emoticonDiscount, 0, emoticons.length, users, emoticons);

        // 결과 출력
        int[] answer = {AllJoin, AllPrice};
        System.out.println(Arrays.toString(answer));
    }

    // 할인율 조합 생성
    private static void EtcAndDctCombo(int[] emoticonDiscount, int zeroStart, int emoticonsLength, int[][] users, int[] emoticons) {
        if (zeroStart == emoticonsLength) {
            // 생성된 할인율 조합으로 계산
            doneCall(users, emoticons, emoticonDiscount);
            return;
        }
        for (int i = zeroStart; i < emoticonsLength; i++) {
            for (int j = 0; j < 5; j++) {
                // fixDisCount = {0, 10, 20, 30, 40}
                // 재귀 사용
                emoticonDiscount[i] = fixDisCount[j];
                EtcAndDctCombo(emoticonDiscount, i + 1, emoticonsLength, users, emoticons);
            }
        }
    }

    // 할인율 조합에 대한 이모티콘 가격 계산
    private static void doneCall(int[][] users, int[] emoticons, int[] emoticonDiscount) {
        int join = 0; // 가입 수
        int price = 0; // 총 가격

        for (int[] user : users) {
            int minDiscount = user[0]; // 최소 할인율
            int maxPayPrice = user[1]; // 최대 지불 금액
            int sum = 0; // 이모티콘 가격 합계

            // 할인율을 적용하여 이모티콘 가격 합계 계산
            for (int i = 0; i < emoticonDiscount.length; i++) {
                if(emoticonDiscount[i] < minDiscount)
                    continue;
                sum += sale(emoticons[i], emoticonDiscount[i]);
            }

            // 최대 지불 금액과 이모티콘 가격 합계 비교하여 가입 여부 결정
            if(maxPayPrice <= sum)
                join++; // 가입
            else
                price += sum; // 구매

            // 최대 가입 수와 총 가격 갱신
            if (join > AllJoin) {
                AllJoin = join;
                AllPrice = price;
            }else if(join == AllJoin && price > AllPrice)
                AllPrice = price;
        }
    }

    // 이모티콘 가격에 할인율 적용하여 할인 가격 계산
    private static int sale(int emoticonsPrice, int discountPercent) {
        return (int) (emoticonsPrice - (emoticonsPrice * (discountPercent * 0.01)));
    }
}
