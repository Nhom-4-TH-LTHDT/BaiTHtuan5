public class Test {
    public static void main(String[] args) {
     
        Sach sach1 = new Sach("A001", "HOC JAVA", "DO HOANG BAO THY", 2025, 10);

        
        Sach sach2 = new Sach();
        sach2.setMaSach("A002");
        sach2.setTieuDe("HTML & CSS");
        sach2.setTacGia("NGUYEN TUONG VY");
        sach2.setNamXuatBan(2025);
        sach2.setSoLuong(5);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
