package id.co.trisun.tel_uevent;

public class Acara {
    private String namaAcaraWord, pembuatAcaraWord, waktuAcaraWord, deskripsiAcara;
    private int fotoAcara = -1, iconWaktu;

    public Acara( int fotoAcara, String namaAcaraWord, String deskripsiAcara,
                 int iconWaktu, String waktuAcaraWord) {
        this.namaAcaraWord = namaAcaraWord;
        this.waktuAcaraWord = waktuAcaraWord;
        this.deskripsiAcara = deskripsiAcara;
        this.fotoAcara = fotoAcara;
        this.iconWaktu = iconWaktu;
    }

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

    public String getDeskripsiAcara() {
        return deskripsiAcara;
    }

    public int getIconWaktu() {
        return iconWaktu;
    }

    public boolean hasImage() {
        return fotoAcara != -1;
    }
}
