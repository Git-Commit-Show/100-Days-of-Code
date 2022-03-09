package chapter2.abst;

import java.util.Date;

public class NonRemedial extends Mahasiswa{

	public NonRemedial(long nomorInduk, int nilai, Date tanggalUjian) {
		super(nomorInduk, nilai, tanggalUjian);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cetakNilaiAkhir() {
		System.out.println("Selamat " + super.nomorInduk + " Anda dinyatakan lulus");
		
	}

}
