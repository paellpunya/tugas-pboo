public class Menu {
    private int idMenu;
    private String nama;
    private double harga;
    private String jenis;

    public Menu(int idMenu, String nama, double harga, String jenis) {
        this.idMenu = idMenu;
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanItem() {
        System.out.println(nama + " - Rp " + harga + " (" + jenis + ")");
    }
}
