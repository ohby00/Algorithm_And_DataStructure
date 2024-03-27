package method;

public class String_method {
    public static void main(String[] args) {
        String str = "Hello world";

        // length() : 문자열의 길이
        int length = str.length();
        // = 11

        // substring : 문자열의 부분 문자열 반환
        String subStr = str.substring(0, 5);
        // = "Hello"

        // charAt : 특정 인덱스를 char 형식으로 가져옴
        char ch = str.charAt(1);
        // = 'e'

        // indexOf : 특정 문자, 문자열이 처음으로 등장하는 인덱스 반환
        int index = str.indexOf("llo");
        // = 2

        // toLowerCase(), toUpperCase() : 문자열을 소문자 또는 대문자로 변환
        String lowerStr = str.toLowerCase(); // "hello world"
        String upperStr = str.toUpperCase(); // "HELLO WORLD"

    }
}
