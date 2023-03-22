
package câu3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<GiaoDich> dsgd = new ArrayList<GiaoDich>(6);
        dsgd.add(new GiaoDicaVang("A1", "20-21-2021", 150000, 1, "9999"));
        dsgd.add(new GiaoDichVang("A2", "16-12-2021", 5500000, 2, "Trang"));
        dsgd.add(new GiaoDichVang("A3", "7-10-2021", 66660000, 10, "Vang sjc"));
        dsgd.add(new GiaoDichTienTe("B1", "28-2-2021", 20000, 2, 120000, GiaoDichTienTe.Loai.VN));
        dsgd.add(new GiaoDichTienTe("B2", "15-11-2021", 50000, 2, 305000, GiaoDichTienTe.Loai.USD));
        dsgd.add(new GiaoDichTienTe("B3", "7-5-2021", 1500000000, 3, 220200, GiaoDichTienTe.Loai.Euro));

        int TongSLGDVang = 0;
        int TongSLGDTienTe = 0;
        for (GiaoDich gd : dsgd) {
            if (gd instanceof GiaoDichVang) {
                TongSLGDVang += gd.getSoluong();
            } else {
                TongSLGDTienTe += gd.getSoluong();
            }
        }
        System.out.println("Tong so luong vang= " + TongSLGDVang);
        System.out.println("Tong so luong tien te= " + TongSLGDTienTe);

        int TBThanhTien = 0;
        int TongThanhTien = 0;
        int soluong = 0;
        for (GiaoDich gd : dsgd) {
            if (gd instanceof GiaoDichTienTe) {
                TongThanhTien += ((GiaoDichTienTe) gd).ThanhTien();
                soluong++;
            }
        }
        TBThanhTien = TongThanhTien / soluong;
        System.out.println("Trung binh thanh tien= " + TBThanhTien);

        for (GiaoDich gd : dsgd) {
            if (gd.getDongGia() > 1000000000) {
                System.out.println(gd.toString());
            }
        }
    }
}