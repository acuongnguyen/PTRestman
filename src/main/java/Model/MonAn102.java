package Model;

public class MonAn102 {
    private int id;
    private String ten;
    private float gia;
    private String hinhAnh;
    private String moTa;
    private int nhaHangId;

    public MonAn102(int id, String ten, float gia, String hinhAnh, String moTa, int nhaHangId) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.hinhAnh = hinhAnh;
        this.moTa = moTa;
        this.nhaHangId = nhaHangId;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public float getGia() {
        return gia;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getNhaHangId() {
        return nhaHangId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setNhaHangId(int nhaHangId) {
        this.nhaHangId = nhaHangId;
    }
}
