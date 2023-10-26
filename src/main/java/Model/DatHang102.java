package Model;

import java.util.Date;

public class DatHang102 {
    private int id;
    private float tongTien;
    private int khachHangId;
    private Date ngayDat;

    public DatHang102(int id, float tongTien, int khachHangId, Date ngayDat) {
        this.id = id;
        this.tongTien = tongTien;
        this.khachHangId = khachHangId;
        this.ngayDat = ngayDat;
    }

    public int getId() {
        return id;
    }

    public float getTongTien() {
        return tongTien;
    }

    public int getKhachHangId() {
        return khachHangId;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public void setKhachHangId(int khachHangId) {
        this.khachHangId = khachHangId;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }
}
