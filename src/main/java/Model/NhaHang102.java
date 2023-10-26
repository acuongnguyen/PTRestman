package Model;

public class NhaHang102 {
	private int id;
	private String vitri;
	private String email;
	private String sdt;
	private String diaChi;
	public NhaHang102(int id, String vitri, String email, String sdt, String diaChi) {
		super();
		this.id = id;
		this.vitri = vitri;
		this.email = email;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVitri() {
		return vitri;
	}
	public void setVitri(String vitri) {
		this.vitri = vitri;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}
