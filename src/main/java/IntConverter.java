public class IntConverter {

    public int convertStringToInt(String s) {
        if (isConvertibleToInt(s)) {
            return Integer.parseInt(s);
        }
        throw new IllegalArgumentException("숫자가 아닙니다.");
    }

    public boolean isConvertibleToInt(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!isCharacterDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isCharacterDigit(char ch) {
        if (Character.isDigit(ch)) {
            return true;
        }
        return false;
    }
}
