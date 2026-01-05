import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> goodNumbers = new ArrayList<>();
        int notGood = 0;

        System.out.println("Nhập các chuỗi (gõ 'null' để kết thúc):");

        while (true) {
            System.out.print("Nhập chuỗi: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("null")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                goodNumbers.add(number);
            } catch (NumberFormatException e) {
                notGood++;
            }
        }

        System.out.println("===== KẾT QUẢ =====");
        System.out.println("Số chuỗi hợp lệ: " + goodNumbers.size());
        System.out.println("Số chuỗi không hợp lệ: " + notGood);
        System.out.println("Danh sách số nguyên hợp lệ: " + goodNumbers);
    }
}
