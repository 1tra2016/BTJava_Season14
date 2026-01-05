import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> validPhones = new ArrayList<>();
        List<String> invalidPhones = new ArrayList<>();

        boolean isInputValid = false;

        System.out.print("Nhập các số điện thoại (cách nhau bằng dấu phẩy): ");
        String input = scanner.nextLine();
        String[] phones = input.split(",");
        for (String phone : phones) {
            phone = phone.trim();
            try {
                InvalidPhoneNumberLengthException.validate(phone);
                validPhones.add(phone);
            } catch (InvalidPhoneNumberLengthException e) {
                invalidPhones.add(phone + ": " + e.getMessage());
            }
        }
        if (validPhones.isEmpty()) {
            System.out.println("Tất cả số điện thoại đều không hợp lệ");
            System.exit(0);
        }

        System.out.println("\n=== DANH SÁCH SỐ ĐIỆN THOẠI HỢP LỆ ===");
        for (String phone : validPhones) {
            System.out.println(phone);
        }

        System.out.println("\n=== DANH SÁCH SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ ===");
        for (String error : invalidPhones) {
            System.out.println(error);
        }
    }
}
