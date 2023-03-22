
package câu2;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
		HinhTron ht = new HinhTron();
		System.out.println("Nhap ban kinh ");
		Scanner sc = new Scanner(System.in);
		ht.setR(sc.nextFloat());
		System.out.println("Dien tich "+ ht.dienTich());
                
		System.out.println("---------------------------");

		HinhChuNhat hcn = new HinhChuNhat();
		System.out.println("Nhap chieu dai ");
        hcn.setCd(sc.nextFloat());
		System.out.println("Nhap chieu rong ");
		hcn.setCr(sc.nextFloat());
		System.out.println("Dien tich "+ hcn.dienTich());	
	}
}
    

