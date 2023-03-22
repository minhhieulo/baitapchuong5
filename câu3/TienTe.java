
package câu3;

public class TienTe extends GiaoDich {

    enum Loai {
        VN,
        USD,
        Euro
    }
    private int tigia;
    private Loai loaitiente;

    public TienTe() {

    }

    public TienTe(String magiaodich, String ngaygiaodich, int dongia, int soluong, int tigia, Loai loaitiente) {
        super(magiaodich, ngaygiaodich, dongia, soluong);
        this.tigia = tigia;
        this.loaitiente = loaitiente;
    }

    public double getTigia() {
        return tigia;
    }

    public void setTigia(int tigia) {
        this.tigia = tigia;
    }

    public Loai getLoaitiente() {
        return loaitiente;
    }

    public void setLoai(Loai loaitiente) {
        this.loaitiente = loaitiente;
    }

    public double thanhtien() {
        if (this.loaitiente == Loai.VN) {
            return this.getDongia() * this.getSoluong();
        }
        return this.getDongia() * this.getSoluong() * this.getTigia();
    }

    @Override
    public String toString() {
        return "TienTe{" + super.toString() + "tigia=" + tigia + ", loaitiente=" + loaitiente + '}';
    }

}