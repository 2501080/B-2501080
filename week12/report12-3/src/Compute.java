public class Compute {

    static final String[] numKor = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    static final String[] smallUnit = {"", "십", "백", "천"};
    static final String[] bigUnit = {"", "만", "억", "조", "경"};

    public static String convertHangul(long money) {
        if (money == 0) return "영";

        String str = Long.toString(money);
        int len = str.length();

        int groupCount = (int) Math.ceil(len / 4.0);

        StringBuilder result = new StringBuilder();
        int startIndex = len;

        for (int g = 0; g < groupCount; g++) {
            int end = startIndex;
            int begin = Math.max(0, startIndex - 4);

            String chunk = str.substring(begin, end);
            String converted = convert4digits(chunk);

            if (!converted.equals("")) {
                // ⭐ 큰 단위 뒤에 " " 공백 추가
                result.insert(0, converted + bigUnit[g] + " ");
            }

            startIndex -= 4;
        }

        return result.toString().trim();  // 마지막 공백 제거
    }

    private static String convert4digits(String chunk) {
        StringBuilder sb = new StringBuilder();
        int len = chunk.length();

        for (int i = 0; i < len; i++) {
            int digit = chunk.charAt(i) - '0';

            if (digit == 0) continue;

            sb.append(numKor[digit]);
            sb.append(smallUnit[len - 1 - i]);
        }
        return sb.toString();
    }
}
