package chapter2.abst;

import java.util.Date;

public class Remedial extends Mahasiswa {

	public Remedial(long nomorInduk, int nilai, Date tanggalUjian) {
		super(nomorInduk, nilai, tanggalUjian);
	}

	@Override
	public void cetakNilaiAkhir() {
		System.out.println("Dengan nilai anda : " + super.nilai + " anda dinyatakan tidak lulus. \nSilahkan hubungi dosen terkait");
	}

}
