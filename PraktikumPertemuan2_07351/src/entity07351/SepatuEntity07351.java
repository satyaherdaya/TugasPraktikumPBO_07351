package entity07351;

public class SepatuEntity07351 extends AbstractClass07351{
    private String merek07351;
    private String warna07351;
    private String jenis07351;
    private int ukuran07351;
    private int harga07351;

    public SepatuEntity07351(String merek07351, String warna07351, String jenis07351, int ukuran07351, int harga07351, int id07351, String nama07351) {
        super(id07351, nama07351);
        this.merek07351 = merek07351;
        this.warna07351 = warna07351;
        this.jenis07351 = jenis07351;
        this.ukuran07351 = ukuran07351;
        this.harga07351 = harga07351;
    }

    public String getMerek07351() {
        return merek07351;
    }

    public void setMerek07351(String merek07351) {
        this.merek07351 = merek07351;
    }

    public String getWarna07351() {
        return warna07351;
    }

    public void setWarna07351(String warna07351) {
        this.warna07351 = warna07351;
    }

    public String getJenis07351() {
        return jenis07351;
    }

    public void setJenis07351(String jenis07351) {
        this.jenis07351 = jenis07351;
    }

    public int getUkuran07351() {
        return ukuran07351;
    }

    public void setUkuran07351(int ukuran07351) {
        this.ukuran07351 = ukuran07351;
    }

    public int getHarga07351() {
        return harga07351;
    }

    public void setHarga07351(int harga07351) {
        this.harga07351 = harga07351;
    }
}
