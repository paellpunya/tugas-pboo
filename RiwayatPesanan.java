import java.util.ArrayList;
import java.util.List;

public class RiwayatPesanan {
    private List<Pesanan> daftarPesananSelesai = new ArrayList<>();

    public void tambahPesanan(Pesanan pesanan) {
        daftarPesananSelesai.add(pesanan);
    }

    public void tampilkanRiwayat() {
        for (Pesanan pesanan : daftarPesananSelesai) {
            pesanan.tampilkanPesanan();
            System.out.println("-----");
        }
    }
}
