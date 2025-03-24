package BAI1;
import java.util.Scanner;
class PhucVu extends NhanVien {
	public PhucVu() {
		super();
	}
	public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo) {
		super(maNhanVien, tenNhanVien, trinhDo);
	}
	@Override 
	public double tinhLuong() {
		return luongCoBan;
	}
}
