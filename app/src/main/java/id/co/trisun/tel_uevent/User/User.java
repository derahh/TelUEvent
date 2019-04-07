package id.co.trisun.tel_uevent.User;

public class User {
    private String nim;
    private String username;
    private String password;
    private String nama_lengkap;
    private String alamat_bandung;
    private String no_hp;
    private String jk;
    private String status;
    private String hak_akses;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "nim='" + nim + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nama_lengkap='" + nama_lengkap + '\'' +
                ", alamat_bandung='" + alamat_bandung + '\'' +
                ", no_hp='" + no_hp + '\'' +
                ", jk='" + jk + '\'' +
                ", status='" + status + '\'' +
                ", hak_akses='" + hak_akses + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(String nim, String username, String password, String nama_lengkap, String alamat_bandung, String no_hp, String jk, String status, String hak_akses, String email) {
        this.nim = nim;
        this.username = username;
        this.password = password;
        this.nama_lengkap = nama_lengkap;
        this.alamat_bandung = alamat_bandung;
        this.no_hp = no_hp;
        this.jk = jk;
        this.status = status;
        this.hak_akses = hak_akses;
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public String getNim() {
        return nim;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public String getAlamat_bandung() {
        return alamat_bandung;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public String getJk() {
        return jk;
    }

    public String getStatus() {
        return status;
    }

    public String getHak_akses() {
        return hak_akses;
    }
}
