package community.com.test;

import java.util.ArrayList;
import java.util.Collections;

import community.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
		dsSP.add(new SanPham(1,25,"Coca"));
		dsSP.add(new SanPham(2,15,"Pepsi"));
		dsSP.add(new SanPham(3,20,"Redbull"));
		
		System.out.println("Danh sách sản phẩm");
		
		for(SanPham sp : dsSP)
			System.out.println(sp);
		Collections.sort(dsSP);
		System.out.println("Danh sách sản phẩm sau khi Sort là ");
		for (int i =0; i<dsSP.size();i++)
			System.out.println(dsSP.get(i));
		

	}

}
