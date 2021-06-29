public class SanPham {
    private  int MaSanPham;
    private  String tenSanPham;
    private String hangSanXuat;
    private  double giaSanPham;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, String hangSanXuat, double giaSanPham) {
        MaSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.giaSanPham = giaSanPham;
    }

    public int getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "MaSanPham=" + MaSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", giaSanPham=" + giaSanPham +
                '}';
    }
}
