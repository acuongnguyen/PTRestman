package Model;

import java.io.Serializable;

public class NVQuanLi102 extends NhanVien102 implements Serializable {
    public NVQuanLi102(int id, String hoTen, String email, String sdt, String diaChi, String username, String password, String vitri) {
        super(id, hoTen, email, sdt, diaChi, username, password, vitri);
    }
    public NVQuanLi102(int id, String hoTen, String email, String sdt, String diaChi, String vitri) {
        super(id, hoTen, email, sdt, diaChi, vitri);
    }
}