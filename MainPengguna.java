class Pengguna{
    String username;
    String password;

    public Pengguna(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void tempatMenampilkanInfo() {
        System.out.println("Username: " + username);
    }
}

class Admin extends Pengguna{
    String hakAkses;

    public Admin(String username, String password, boolean fullakses){
        super(username, password);
        this.hakAkses = fullakses ? "Full Access" : "Read-Only Access";
    }

    @Override
    public void tempatMenampilkanInfo() {
        super.tempatMenampilkanInfo();
        System.out.println("Hak Akses: " + hakAkses);
    }
}

class Pelanggan extends Pengguna{
    int nomorPelanggan;

    public Pelanggan(String username, String password, int nomorPelanggan){
        super(username, password);
        this.nomorPelanggan = nomorPelanggan;
    }

    @Override
    public void tempatMenampilkanInfo() {
        super.tempatMenampilkanInfo();
        System.out.println("Nomor Pelanggan: " + nomorPelanggan);
    }
}

public class MainPengguna {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "123", true);
        Pelanggan pelanggan = new Pelanggan("pelanggan", "123", 68841);

        admin.tempatMenampilkanInfo();
        System.out.println("");
        pelanggan.tempatMenampilkanInfo();
    }
}
