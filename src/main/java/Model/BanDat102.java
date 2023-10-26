package Model;

public class BanDat102 {
    private int id;
    private String ten;
    private int soLuongGhe;
    private String moTa;
    private int nhaHang102Id;

    public BanDat102(int id, String ten, int soLuongGhe, String moTa, int nhaHang102Id) {
        this.id = id;
        this.ten = ten;
        this.soLuongGhe = soLuongGhe;
        this.moTa = moTa;
        this.nhaHang102Id = nhaHang102Id;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getNhaHang102Id() {
        return nhaHang102Id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setNhaHang102Id(int nhaHang102Id) {
        this.nhaHang102Id = nhaHang102Id;
    }
}
