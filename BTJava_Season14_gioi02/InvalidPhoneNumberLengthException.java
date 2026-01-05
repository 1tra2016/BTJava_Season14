public class InvalidPhoneNumberLengthException extends Exception {

    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }

    public static void validate(String phone) throws InvalidPhoneNumberLengthException {

        if (!phone.matches("\\d+")) {
            throw new InvalidPhoneNumberLengthException("Chứa ký tự không hợp lệ (chỉ được chứa chữ số)");
        }

        if (phone.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Sai độ dài (phải đúng 10 chữ số)");
        }
    }
}
