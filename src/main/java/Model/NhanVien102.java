package Model;

import java.io.Serializable;

public class NhanVien102 extends NguoiDung102 implements Serializable {
    private String vitri;

    public NhanVien102(int id, String hoTen, String email, String sdt, String diaChi, String username, String password, String vitri) {
        super(id, hoTen, email, sdt, diaChi, username, password);
        this.vitri = vitri;
    }
    public NhanVien102(int id, String hoTen, String email, String sdt, String diaChi, String vitri) {
        super(id, hoTen, email, sdt, diaChi);
        this.vitri = vitri;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
}
