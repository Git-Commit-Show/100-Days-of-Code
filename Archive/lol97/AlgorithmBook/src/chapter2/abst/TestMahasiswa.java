package chapter2.abst;

import java.util.Date;

public class TestMahasiswa {
	public static void main(String[] args) {
		NonRemedial johny = new NonRemedial(1001l, 90, new Date(2020, 01, 20));
		johny.cetakDataMahasiswa();
		johny.cetakNilaiAkhir();
		
		System.out.println("=================");
		Remedial johnyWish = new Remedial(1002l, 40, new Date(2020, 01, 20));
		johnyWish.cetakDataMahasiswa();
		johnyWish.cetakNilaiAkhir();
	}
}
