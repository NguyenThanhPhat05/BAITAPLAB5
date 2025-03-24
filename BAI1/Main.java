package BAI1;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<NhanVien> danhSachNhanVien= new ArrayList<>();
		
		QuanLy quanLy = new QuanLy("QL001", "Nguyen Van A", "Dai hoc", "Quan tri", 2000000);
		quanLy.setLuongCoban(5000000);
		
		NghienCuu nghienCuu = new NghienCuu("NC001", "Tran Thi B","Thac Si", "Hoa hoc", 1500000 );
		nghienCuu.setLuongCoban(4000000);
		
		PhucVu phucVu = new PhucVu("PV001", "Le Van C", "Trung cap");
		phucVu.setLuongCoban(3000000);
		
		danhSachNhanVien.add(quanLy);
		danhSachNhanVien.add(nghienCuu);
		danhSachNhanVien.add(phucVu);
		
		System.out.println("\nDanh sach nhan vien:");
		for (NhanVien nv: danhSachNhanVien) {
			nv.xuat();
			System.out.println("Luong: " + nv.tinhLuong());
		}
	}

}
