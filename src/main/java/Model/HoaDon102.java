package Model;

import java.util.Date;

public class HoaDon102 {
    private int id;
    private Date ngayTao;
    private float tongTien;
    private String ghiChu;
    private int nvBanHangId;
    private int datHang102Id;

    public HoaDon102(int id, Date ngayTao, float tongTien, String ghiChu, int nvBanHangId, int datHang102Id) {
        this.id = id;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
        this.nvBanHangId = nvBanHangId;
        this.datHang102Id = datHang102Id;
    }

    public int getId() {
        return id;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public float getTongTien() {
        return tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public int getNvBanHangId() {
        return nvBanHangId;
    }

    public int getDatHang102Id() {
        return datHang102Id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setNvBanHangId(int nvBanHangId) {
        this.nvBanHangId = nvBanHangId;
    }

    public void setDatHang102Id(int datHang102Id) {
        this.datHang102Id = datHang102Id;
    }
}
