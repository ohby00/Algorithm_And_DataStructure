package Function_p;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();   //StringBuilder

        sb.append("안녕").append("하세요");   // append 글자를 이어줌
        sb.append("\n");
        sb.append("반갑습니다.");
        System.out.println(sb);   // 안녕하세요 츌력
        System.out.println("-------------------------");

        sb.insert(5,"!!");   // 5번째 위치에 !! 추가
        System.out.println(sb);
        System.out.println("-------------------------");

        sb.replace(1,2,"ㅋ");   // 안 ((녕)/ㅋ) 세요
        System.out.println(sb);
        sb.replace(1,2,"녕");
        System.out.println(sb);
        System.out.println("-------------------------");

        sb.deleteCharAt(6);   // 6번째 삭제
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.reverse();   // 거꾸로
        System.out.println(sb);
        sb.reverse();



    }
}
