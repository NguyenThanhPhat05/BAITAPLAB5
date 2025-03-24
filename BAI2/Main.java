package BAI2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so luong hinh:");
		int n= scanner.nextInt();
		scanner.next();
		
		Hinh ds[]= new Hinh[n];
		for (int i=0; i<n;i++) {
			System.out.println("Chon loai hinh de nhap: ");
			System.out.println("1: Hinh vuong");
			System.out.println("2: Hinh chu nhat");
			System.out.println("3: Hinh tron");
			
			int chon;
			while (true) {
				System.out.print("Lua chon cua ban:");
				chon = scanner.nextInt();
				if (chon >= 1 && chon<=3 ) break;
				System.out.println("Vui long chon 1,2 hoac 3!!");
			}
			switch (chon) {
			case 1:
			    ds[i] = new HinhVuong();
			    break;
			case 2:
			    ds[i]= new HinhChuNhat();
			    break;
			case 3:
				ds[i] = new HinhTron();
				break;
			}
			ds[i].nhap();
		}
		System.out.println("\nDanh sach cac hinh:");
		for (Hinh hinh : ds) {
			hinh.xuat();
		}
		Hinh hinhDienTichLonNhat = ds[0];
		for (Hinh hinh : ds) {
			if (hinh.dienTich() > hinhDienTichLonNhat.dienTich()) {
				hinhDienTichLonNhat = hinh;
			}
		}
		System.out.println("\nHinh co dien tich lon nhat:");
		hinhDienTichLonNhat.xuat();
	}
}
