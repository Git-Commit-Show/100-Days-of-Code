package chapter2.abst;

import java.util.Date;

public abstract class Mahasiswa {
	protected long nomorInduk;
	protected int nilai;
	protected Date tanggalUjian;

	public Mahasiswa(long nomorInduk, int nilai, Date tanggalUjian) {
		super();
		this.nomorInduk = nomorInduk;
		this.nilai = nilai;
		this.tanggalUjian = tanggalUjian;
	}

	public void cetakDataMahasiswa() {
		System.out.println("Nomor Induk \t : " + this.nomorInduk);
		System.out.println("Nilai \t\t : " + this.nilai);
		System.out.println("Tanggal Ujian \t : " + this.tanggalUjian);
	}
	
	public abstract void cetakNilaiAkhir();

}
