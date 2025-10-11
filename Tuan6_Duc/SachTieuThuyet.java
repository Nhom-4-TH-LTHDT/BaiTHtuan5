public class SachTieuThuyet extends Sach {
    private final String theLoai;
    private final boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        String seriesStatus = laSachSeries ? "Có" : "Không";
        return super.toString() +
               "\nThể loại: " + theLoai +
               "\nLà sách series: " + seriesStatus;
    }
    
    @Override
    public void hienThiThongTin() {
        System.out.println("--- THÔNG TIN SÁCH TIỂU THUYẾT ---");
        System.out.println(this.toString());
        System.out.println("---------------------------------");
    }
}