package id.co.trisun.tel_uevent.admin;

public class User {
    private String namaUser;
    private int fotoUser;

    public User(String namaUser, int fotoUser) {
        this.namaUser = namaUser;
        this.fotoUser = fotoUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public int getFotoUser() {
        return fotoUser;
    }
}
