public class Test {
    public static void main(String[] args) {
        QuanLySach quanLy = new QuanLySach();

        System.out.println("----- THÊM SÁCH VÀO DANH SÁCH -----");

        SachGiaoTrinh s1 = new SachGiaoTrinh("GT01", "Cơ sở dữ liệu", "Phạm Văn C", 2021, 50, "Cơ sở dữ liệu", "Đại học");
        quanLy.themSach(s1);

        SachTieuThuyet s2 = new SachTieuThuyet("TT01", "Đắc nhân tâm", "Dale Carnegie", 1936, 100, "Phát triển bản thân", false);
        quanLy.themSach(s2);

        SachGiaoTrinh s3 = new SachGiaoTrinh("GT02", "Giải tích 1", "Trần Đình D", 2020, 75, "Toán học", "Đại học");
        quanLy.themSach(s3);

        SachTieuThuyet s4 = new SachTieuThuyet("TT02", "Harry Potter: Hòn đá phù thủy", "J.K. Rowling", 1997, 120, "Huyền ảo", true);
        quanLy.themSach(s4);

        quanLy.hienThiDanhSachSach();

        System.out.println("\n----- TÌM KIẾM SÁCH -----");
        String maCanTim = "TT01";
        Sach sachTimThay = quanLy.timKiemSach(maCanTim);
        if (sachTimThay != null) {
            System.out.println("Tìm thấy sách có mã " + maCanTim + ":");
            sachTimThay.hienThiThongTin();
        } else {
            System.out.println("Không tìm thấy sách có mã " + maCanTim);
        }

        System.out.println("\n----- CẬP NHẬT SỐ LƯỢNG -----");
        quanLy.capNhatSoLuong("GT01", 60);

        quanLy.hienThiDanhSachSach();

        System.out.println("\n----- XOÁ SÁCH -----");
        quanLy.xoaSach("GT02");

        quanLy.hienThiDanhSachSach();
    }
}