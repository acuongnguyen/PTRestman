package Model;

public class Combo102 {
    private int id;
    private String ten;
    private float tongGia;
    private String moTa;
    private int nhaHangId;

    public Combo102(int id, String ten, float tongGia, String moTa, int nhaHangId) {
        this.id = id;
        this.ten = ten;
        this.tongGia = tongGia;
        this.moTa = moTa;
        this.nhaHangId = nhaHangId;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public float getTongGia() {
        return tongGia;
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

    public void setTongGia(float tongGia) {
        this.tongGia = tongGia;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setNhaHangId(int nhaHangId) {
        this.nhaHangId = nhaHangId;
    }
}
