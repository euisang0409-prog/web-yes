package ex1_exception;

class Converter2 {
    public int toInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 형식 오류");
        }
    }
}
