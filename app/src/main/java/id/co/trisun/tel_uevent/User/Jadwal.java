package id.co.trisun.tel_uevent.User;

public class Jadwal {
    private String namaAcaraWord, deskripsiAcaraWord, waktuAcaraWord;
    private int fotoAcara = -1, iconWaktu = -1;

    public Jadwal(String namaAcaraWord, String deskripsiAcaraWord, String waktuAcaraWord, int fotoAcara, int iconWaktu) {
        this.namaAcaraWord = namaAcaraWord;
        this.deskripsiAcaraWord = deskripsiAcaraWord;
        this.waktuAcaraWord = waktuAcaraWord;
        this.fotoAcara = fotoAcara;
        this.iconWaktu = iconWaktu;
    }

    public String getNamaAcaraWord() {
        return namaAcaraWord;
    }

    public String getDeskripsiAcaraWord() {
        return deskripsiAcaraWord;
    }

    public String getWaktuAcaraWord() {
        return waktuAcaraWord;
    }

    public int getFotoAcara() {
        return fotoAcara;
    }

    public int getIconWaktu() {
        return iconWaktu;
    }
}
