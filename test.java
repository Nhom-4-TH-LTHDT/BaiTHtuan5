public class Test {
    public static void main(String[] args) {
        QuanLySach quanLy = new QuanLySach();
        System.out.println("===== 1. THÊM SÁCH MỚI =====");
        SachGiaoTrinh gts1 = new SachGiaoTrinh("GT001", "Cơ sở Lập trình", "Nguyễn Văn A", 2020,
                                               "Lập trình", "Đại học");
        quanLy.themSach(gts1);
        SachGiaoTrinh gts2 = new SachGiaoTrinh("GT002", "Vật Lý 12", "Trần Thị B", 2018,
                                               "Vật Lý", "Phổ thông");
        quanLy.themSach(gts2);
        SachTieuThuyet tts1 = new SachTieuThuyet("TT001", "Bắt Trộm Sao Chổi", "Tác giả X", 2015,
                                                 "Khoa học viễn tưởng", true);
        quanLy.themSach(tts1);
        SachTieuThuyet tts2 = new SachTieuThuyet("TT002", "Mãi mãi là bao lâu", "Tác giả Y", 2022,
                                                 "Lãng mạn", false);
        quanLy.themSach(tts2);
        System.out.println("\n===== 2. HIỂN THỊ DANH SÁCH SÁCH =====");
        quanLy.hienThiDanhSach();
        System.out.println("\n===== 3. TÌM KIẾM THEO MÃ SÁCH =====");
        String maTimKiem = "TT001";
        Sach sachTimThay = quanLy.timKiemTheoMaSach(maTimKiem);
        if (sachTimThay != null) {
            System.out.println("✅ Tìm thấy sách có mã " + maTimKiem + ": " + sachTimThay);
        } else {
            System.out.println("❗ Không tìm thấy sách có mã " + maTimKiem);
        }
        String maKhongTonTai = "TT999";
        System.out.println("\nTìm kiếm mã sách " + maKhongTonTai + "...");
        System.out.println("Kết quả: " + quanLy.timKiemTheoMaSach(maKhongTonTai));
        System.out.println("\n===== 4. CẬP NHẬT SÁCH =====");
        quanLy.capNhatSach("GT001", "Cơ sở Lập trình Nâng cao", "Nguyễn Văn A và Cộng sự", 2024);
        quanLy.capNhatSach("GT002", "Vật Lý 12 - Phiên bản mới", "Trần Thị B", 2020);
        System.out.println("\nDanh sách sau khi cập nhật GT001 và GT002:");
        quanLy.hienThiDanhSach();
        System.out.println("\n===== 5. XOÁ SÁCH =====");
        quanLy.xoaSach("TT002");
        quanLy.xoaSach("TT999");
        System.out.println("\nDanh sách sách cuối cùng:");
        quanLy.hienThiDanhSach();
    }
}