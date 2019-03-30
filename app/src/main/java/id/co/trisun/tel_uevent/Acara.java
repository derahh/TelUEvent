package id.co.trisun.tel_uevent;

public class Acara {
    private String namaAcaraWord, pembuatAcaraWord, waktuAcaraWord;
    private int fotoAcara = -1;

    public Acara(String namaAcaraWord, int fotoAcara) {
        this.namaAcaraWord = namaAcaraWord;
        this.fotoAcara = fotoAcara;
    }

    public Acara(String namaAcaraWord, String pembuatAcaraWord, String waktuAcaraWord, int fotoAcara) {
        this.namaAcaraWord = namaAcaraWord;
        this.pembuatAcaraWord = pembuatAcaraWord;
        this.waktuAcaraWord = waktuAcaraWord;
        this.fotoAcara = fotoAcara;
    }

    public String getNamaAcaraWord() {
        return namaAcaraWord;
    }

    public String getPembuatAcaraWord() {
        return pembuatAcaraWord;
    }

    public String getWaktuAcaraWord() {
        return waktuAcaraWord;
    }

    public int getFotoAcara() {
        return fotoAcara;
    }

    public boolean hasImage() {
        return fotoAcara != -1;
    }
}
