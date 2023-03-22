
package câu3;

public class Vang extends GiaoDich {

    private String loaivang;

    public Vang() {

    }

    public Vang(String magiaodich, String ngaygiaodich, int dongia, int soluong, String loaivang) {
        super(magiaodich, ngaygiaodich, dongia, soluong);
        this.loaivang = loaivang;
    }

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }

    public double thanhtien() {
        return super.getSoluong() * super.getDongia();
    }

    @Override
    public String toString() {
        return "Vang{" + "loaivang=" + loaivang + '}';
    }

}
