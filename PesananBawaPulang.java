import java.util.List;

public class PesananBawaPulang extends Pesanan {
    private String waktuPengambilan;

    public PesananBawaPulang(int idPesanan, Pelanggan pelanggan, List<Menu> daftarMenu, String waktuPengambilan) {
        super(idPesanan, pelanggan, daftarMenu, "Bawa Pulang");
        this.waktuPengambilan = waktuPengambilan;
    }

    @Override
    public void tampilkanPesanan() {
        super.tampilkanPesanan();
        System.out.println("Waktu Pengambilan: " + waktuPengambilan);
    }
}
