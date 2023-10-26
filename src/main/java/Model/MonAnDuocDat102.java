package Model;

public class MonAnDuocDat102 {
    private int id;
    private int soLuong;
    private float tongTien;
    private int monAnId;
    private int datHangId;

    public MonAnDuocDat102(int id, int soLuong, float tongTien, int monAnId, int datHangId) {
        this.id = id;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.monAnId = monAnId;
        this.datHangId = datHangId;
    }

    public int getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getTongTien() {
        return tongTien;
    }

    public int getMonAnId() {
        return monAnId;
    }

    public int getDatHangId() {
        return datHangId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public void setMonAnId(int monAnId) {
        this.monAnId = monAnId;
    }

    public void setDatHangId(int datHangId) {
        this.datHangId = datHangId;
    }
}
