class Bangunan {
    double luasTanah;
    int jumlahLantai;

    public Bangunan(double luasTanah, int jumlahLantai) {
        this.luasTanah = luasTanah;
        this.jumlahLantai = jumlahLantai;
    }

    public void tampilkanInfonyaDisini() {
        System.out.println("Bangunan dengan luas tanah sebesar " + luasTanah + " m2 dan jumlah lantai sebanyak " + jumlahLantai + " lantai");
    }
}

class Rumah extends Bangunan {
    public Rumah(double luasTanah, int jumlahLantai) {
        super(luasTanah, jumlahLantai);
    }

    @Override
    public void tampilkanInfonyaDisini() {
            System.out.println("Rumah dengan luas tanah sebesar " + luasTanah + " m2 dan jumlah lantai sebanyak " + jumlahLantai + " lantai");
    }
}

class Gedung extends Bangunan {
    public Gedung(double luasTanah, int jumlahLantai) {
        super(luasTanah, jumlahLantai);
    }

    @Override
    public void tampilkanInfonyaDisini() {
        System.out.println("Gedung dengan luas tanah sebesar " + luasTanah + " m2 dan jumlah lantai sebanyak " + jumlahLantai + " lantai");
    }
}

public class Main {
    public static void main(String[] args) {
        Rumah rumah = new Rumah(6, 3);
        Gedung gedung = new Gedung(9, 12);

        rumah.tampilkanInfonyaDisini();
        gedung.tampilkanInfonyaDisini();
    }
}
