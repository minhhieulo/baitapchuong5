
package câu2;

import java.util.ArrayList;

public class DanhSachHinh {
  private ArrayList<HinhHoc> list;
    public DanhSachHinh(ArrayList<HinhHoc> list) {
        this.list = list;
    }
    public void ThemHinh(HinhHoc Hh){
      this.list.add(Hh);
    }
    public void inDanhSach(){
        
    }
}
