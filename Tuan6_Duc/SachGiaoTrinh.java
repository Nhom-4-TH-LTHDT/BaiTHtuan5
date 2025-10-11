
public class SachGiaoTrinh extends Sach {
    private final String monHoc;
    private final String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public String getCapDo() {
        return capDo;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nMôn học: " + monHoc +
               "\nCấp độ: " + capDo;
    }
    @Override
    public void hienThiThongTin() {
        System.out.println("--- THÔNG TIN SÁCH GIÁO TRÌNH ---");
        System.out.println(this.toString());
        System.out.println("---------------------------------");
    }
}
