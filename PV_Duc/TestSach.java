import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestSach {
    public static void main(String[] args) throws Exception {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tiêu đề: ");
        String tieuDe = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        // Hiển thị kết quả
        System.out.println("\n--- Thông tin sách ---");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
    }
}
