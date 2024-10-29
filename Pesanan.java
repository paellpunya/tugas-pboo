import java.util.List;

public class Pesanan {
    private int idPesanan;
    private Pelanggan pelanggan;
    private List<Menu> daftarMenu;
    private double totalHarga;
    private String status;
    private String jenisPesanan;

    public Pesanan(int idPesanan, Pelanggan pelanggan, List<Menu> daftarMenu, String jenisPesanan) {
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.daftarMenu = daftarMenu;
        this.status = "Menunggu";
        this.jenisPesanan = jenisPesanan;
        hitungTotalHarga();
    }

    public void hitungTotalHarga() {
        totalHarga = daftarMenu.stream().mapToDouble(Menu::getHarga).sum();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanPesanan() {
        System.out.println("ID Pesanan: " + idPesanan + ", Jenis: " + jenisPesanan);
        pelanggan.tampilkanDetailPelanggan();
        daftarMenu.forEach(Menu::tampilkanItem);
        System.out.println("Total: Rp " + totalHarga + ", Status: " + status);
    }
}
