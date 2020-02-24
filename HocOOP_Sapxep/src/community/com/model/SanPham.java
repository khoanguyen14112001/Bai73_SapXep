package community.com.model;

public class SanPham implements Comparable<SanPham> {
	private int ma;
	private double gia;
	private String ten;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public SanPham(int ma, double gia, String ten) {
		super();
		this.ma = ma;
		this.gia = gia;
		this.ten = ten;
	}
	public SanPham() {
		super();
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma + "\t" + this.ten + "\t" + this.gia;
	}
	@Override
	public int compareTo(SanPham o) {
		return this.ten.compareToIgnoreCase(o.ten);
		/* if(this.gia<o.gia)
			return 1;
		if(this.gia>o.gia)
			return -1;
		// TODO Auto-generated method stub
		return 0; */
		
	}

}
