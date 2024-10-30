class Rekening {
    String nomorRekening;
    double saldo;

    public Rekening(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        System.out.println("Saldo Awal: " + saldo);
    }

    public void informasiSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}

class Tabungan extends Rekening {
    public Tabungan(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }

    public void setoran(double jumlah) {
        saldo += jumlah;
        System.out.println("Setoran: " + jumlah);
    }

    public void penarikan(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan: " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup");
        }
    }

    public void perhitunganBunga(double persenBunga) {
        saldo += saldo * (persenBunga / 100);
        System.out.println("Bunga sebesar " + persenBunga + "%, telah ditambahkan");
    }
}

class Giro extends Rekening {
    public Giro(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }

    public void setoran(double jumlah) {
        saldo += jumlah;
        System.out.println("Setoran: " + jumlah);
    }

    public void penarikan(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan: " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup");
        }
    }

    public void perhitunganBunga(double persenBunga) {
        saldo += saldo * (persenBunga / 100);
        System.out.println("Bung sebesar " + persenBunga + "%, telah ditambahkan");
    }
}

public class MainRekening {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("42332677363", 300000.0);

        tabungan.setoran(100000);
        tabungan.penarikan(150000);
        tabungan.perhitunganBunga(5.3);
        tabungan.informasiSaldo();

        System.out.println("");

        Giro giro = new Giro("144415488984",500000.0);

        giro.setoran(500000);
        giro.penarikan(100000);
        giro.perhitunganBunga(2.2);
        giro.informasiSaldo();
    }
}
