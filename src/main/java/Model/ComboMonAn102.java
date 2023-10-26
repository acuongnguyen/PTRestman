package Model;

public class ComboMonAn102 {
    private int id;
    private int soLuong;
    private float gia;
    private int monAnId;
    private int comboId;

    public ComboMonAn102(int id, int soLuong, float gia, int monAnId, int comboId) {
        this.id = id;
        this.soLuong = soLuong;
        this.gia = gia;
        this.monAnId = monAnId;
        this.comboId = comboId;
    }

    public int getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getGia() {
        return gia;
    }

    public int getMonAnId() {
        return monAnId;
    }

    public int getComboId() {
        return comboId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void setMonAnId(int monAnId) {
        this.monAnId = monAnId;
    }

    public void setComboId(int comboId) {
        this.comboId = comboId;
    }
}
