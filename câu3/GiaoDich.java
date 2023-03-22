package câu3;

public class GiaoDich {

    private String magiaodich;
    private String ngaygiaodich;
    private int dongia;
    private int soluong;

    public GiaoDich() {

    }

    public GiaoDich(String magiaodich, String ngaygiaodich, int dongia, int soluong) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public String getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(String ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "magiaodich=" + magiaodich + ", ngaygiaodich=" + ngaygiaodich + ", dongia=" + dongia + ", soluong=" + soluong + '}';
    }

}

    @Override
    public String toString() {
        return "GiaoDich{" + "MaGiaoGich=" + MaGiaoGich + ", NgayGiaoDich=" + NgayGiaoDich + ", DongGia=" + DongGia + ", Soluong=" + Soluong + '}';
    
}
}

    