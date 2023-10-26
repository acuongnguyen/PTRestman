package Model;

import java.io.Serializable;

public class KhachHang102 extends NguoiDung102 implements Serializable {
    public KhachHang102(int id, String hoTen, String email, String sdt, String diaChi, String username, String password) {
        super(id, hoTen, email, sdt, diaChi, username, password);
    }
    public KhachHang102(int id, String hoTen, String email, String sdt, String diaChi) {
        super(id, hoTen, email, sdt, diaChi);
    }
}