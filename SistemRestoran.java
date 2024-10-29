import java.util.ArrayList;
import java.util.List;

public class SistemRestoran {
    private List<Menu> daftarMenu = new ArrayList<>();
    private List<Pesanan> daftarPesanan = new ArrayList<>();
    private RiwayatPesanan riwayatPesanan = new RiwayatPesanan();

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public List<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public void tampilkanMenu() {
        System.out.println("Menu:");
        for (Menu item : daftarMenu) {
            item.tampilkanItem();
        }
        System.out.println("-----");
    }

    public void buatPesanan(Pesanan pesanan) {
        daftarPesanan.add(pesanan);
        riwayatPesanan.tambahPesanan(pesanan);
    }

    public void tampilkanRiwayatPesanan() {
        System.out.println("Riwayat Pesanan:");
        riwayatPesanan.tampilkanRiwayat();
    }
}
