package Model;

public class BanDuocDat102 {
    private int id;
    private int datHang102Id;
    private int banDat102Id;

    public BanDuocDat102(int id, int datHang102Id, int banDat102Id) {
        this.id = id;
        this.datHang102Id = datHang102Id;
        this.banDat102Id = banDat102Id;
    }

    public int getId() {
        return id;
    }

    public int getDatHang102Id() {
        return datHang102Id;
    }

    public int getBanDat102Id() {
        return banDat102Id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatHang102Id(int datHang102Id) {
        this.datHang102Id = datHang102Id;
    }

    public void setBanDat102Id(int banDat102Id) {
        this.banDat102Id = banDat102Id;
    }
}
