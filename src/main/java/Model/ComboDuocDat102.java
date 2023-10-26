package Model;

public class ComboDuocDat102 {
    private int id;
    private int soLuong;
    private float tongTien;
    private int comboId;
    private int datHangId;

    public ComboDuocDat102(int id, int soLuong, float tongTien, int comboId, int datHangId) {
        this.id = id;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.comboId = comboId;
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

    public int getComboId() {
        return comboId;
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

    public void setComboId(int comboId) {
        this.comboId = comboId;
    }

    public void setDatHangId(int datHangId) {
        this.datHangId = datHangId;
    }
}
