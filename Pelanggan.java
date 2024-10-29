public class Pelanggan {
    private int idPelanggan;
    private String nama;
    private String kontak;

    public Pelanggan(int idPelanggan, String nama, String kontak) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.kontak = kontak;
    }

    public void tampilkanDetailPelanggan() {
        System.out.println("Pelanggan: " + nama + ", Kontak: " + kontak);
    }
}
