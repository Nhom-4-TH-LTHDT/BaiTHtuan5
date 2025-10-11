public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, int namXuatBan,
                         String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, namXuatBan); 
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
        return "Sách Giáo Trình {" +
               super.toString() + 
               ", Môn học: " + monHoc +
               ", Cấp độ: " + capDo +
               "}";
    }
}