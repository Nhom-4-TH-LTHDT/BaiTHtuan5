public class Test {
    public static void main(String[] args) {
        System.out.println("Tạo đối tượng sách thứ nhất:");
        Sach sach1 = new Sach("S001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2023, 150);
        sach1.hienThiThongTin();

        System.out.println("\nTạo đối tượng sách thứ hai:");
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Kỹ thuật lập trình hướng đối tượng");
        sach2.setTacGia("Lê Thị B");
        sach2.setNamXuatBan(2022);
        sach2.setSoLuong(200);
        sach2.hienThiThongTin();

        System.out.println("\nCập nhật số lượng sách S001:");
        sach1.setSoLuong(160);
        sach1.hienThiThongTin();
    }
}