package kuis;

public class Web extends InputNilai implements Seleksi {
    public Web(int nik, String nama, int tulis, int coding, int wawancara) {
        super(nik, nama, tulis, coding, wawancara);
    }

    public void inputTulis(int tulis) {
        this.tulis = tulis;
    }

    public void inputCoding(int coding) {
        this.coding = coding;
    }

    public void inputWawancara(int wawancara) {
        this.wawancara = wawancara;
    }

    @Override
    public double NilaiTotal() {
        return (0.4 * super.tulis) + (0.35 * super.coding) + (0.25 * super.wawancara);
    }

    @Override
    public String Keterangan() {
        if (this.NilaiTotal() >= 85)
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Web\n";
        else
            return "GAGAL\nMohon maaf kepada " + this.nama + " telah DITOLAK sebagai Web\n";
    }
}
