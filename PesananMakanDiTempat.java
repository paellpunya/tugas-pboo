import java.util.List;

public class PesananMakanDiTempat extends Pesanan {
    private int nomorMeja;

    public PesananMakanDiTempat(int idPesanan, Pelanggan pelanggan, List<Menu> daftarMenu, int nomorMeja) {
        super(idPesanan, pelanggan, daftarMenu, "Makan di Tempat");
        this.nomorMeja = nomorMeja;
    }

    @Override
    public void tampilkanPesanan() {
        super.tampilkanPesanan();
        System.out.println("Nomor Meja: " + nomorMeja);
    }
}
