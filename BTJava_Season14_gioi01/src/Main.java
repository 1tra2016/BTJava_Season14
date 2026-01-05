import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double MIN_BALANCE = 50_000;
        while(true){
            try{
                System.out.println("Số dư tối thiểu trong tài khoản là: "+MIN_BALANCE);
                System.out.print("Nhập số dư ban đầu của bạn: ");
                double balance = Double.parseDouble(scan.nextLine());
                if(balance < MIN_BALANCE){
                    System.out.println("Đồ nghèo khổ. Bạn cần ít nhất 50k");
                }
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
            }
        }
        while(true){
            try {
                System.out.println("Số dư tối thiểu trong tài khoản là: "+MIN_BALANCE);
                System.out.print("Nhập số dư ban đầu của bạn: ");
                double balance = Double.parseDouble(scan.nextLine());
                if(balance < MIN_BALANCE){
                    System.out.println("Đồ nghèo khổ. Tôi sẽ tặng bạn 50k");
                    balance += MIN_BALANCE;
                }

                System.out.println("Số dư hiện tại: " + balance + " đồng");
                System.out.print("Nhập số tiền muốn rút: ");
                double withdrawAmount = Double.parseDouble(scan.nextLine());

                if (withdrawAmount <= 0) {
                    System.out.println("Lỗi: Số tiền rút phải lớn hơn 0!");
                }
                else if (withdrawAmount > balance) {
                    System.out.println("Lỗi: Số tiền rút vượt quá số dư!");
                }
                else if (balance - withdrawAmount < MIN_BALANCE) {
                    System.out.println("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
                }
                else {
                    balance -= withdrawAmount;
                    System.out.println("Rút tiền thành công!");
                    System.out.println("Số tiền đã rút: " + withdrawAmount + " đồng");
                    System.out.println("Số dư còn lại: " + balance + " đồng");
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
            }
        }
    }
}
