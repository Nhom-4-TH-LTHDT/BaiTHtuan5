public class test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2022, 10);
        Sach sach2 = new Sach("B002", "Cấu trúc dữ liệu và giải thuật", "Trần Thị B", 2021, 5);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        Sach sach3 = new Sach();
        sach3.setMaSach("B003");
        sach3.setTieuDe("Cơ sở dữ liệu");
        sach3.setTacGia("Lê Văn C");
        sach3.setNamXuatBan(2020);
        sach3.setSoLuong(8);

        sach3.hienThiThongTin();
    }
}
class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    public Sach() {
        this.maSach = "";
        this.tieuDe = "";
        this.tacGia = "";
        this.namXuatBan = 0;
        this.soLuong = 0;
    }
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void hienThiThongTin() {
        System.out.println("Mã Sách: " + maSach);
        System.out.println("Tiêu Đề: " + tieuDe);
        System.out.println("Tác Giả: " + tacGia);
        System.out.println("Năm Xuất Bản: " + namXuatBan);
        System.out.println("Số Lượng: " + soLuong);
        System.out.println("---------------------------");
    }
}