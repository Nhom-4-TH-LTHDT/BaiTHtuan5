public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tenSach, String tacGia, int namXuatBan,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tenSach, tacGia, namXuatBan); 
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai() {
        return theLoai;
    }
    public boolean isLaSachSeries() {
        return laSachSeries;
    }
    @Override
    public String toString() {
        String seriesStatus = laSachSeries ? "Có" : "Không";
        return "Sách Tiểu Thuyết {" +
               super.toString() +
               ", Thể loại: " + theLoai +
               ", Thuộc Series: " + seriesStatus +
               "}";
    }
}