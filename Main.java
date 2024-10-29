import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemRestoran sistem = new SistemRestoran();
        Scanner scanner = new Scanner(System.in);

        // Input menu secara manual untuk contoh
        sistem.tambahMenu(new Menu(1, "Nasi Goreng", 25000, "Makanan"));
        sistem.tambahMenu(new Menu(2, "Mie Goreng", 20000, "Makanan"));
        sistem.tambahMenu(new Menu(3, "Es Teh", 5000, "Minuman"));
        sistem.tambahMenu(new Menu(4, "Es Jeruk", 7000, "Minuman"));

        // Tampilkan daftar menu kepada pelanggan
        System.out.println("Menu Restoran:");
        sistem.tampilkanMenu();

        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan kontak pelanggan: ");
        String kontak = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(101, namaPelanggan, kontak);

        // Pilih jenis pesanan
        System.out.print("Pilih jenis pesanan (1 untuk Makan di Tempat, 2 untuk Bawa Pulang): ");
        int jenisPesanan = scanner.nextInt();
        scanner.nextLine();

        List<Menu> daftarItemPesanan = new ArrayList<>();
        System.out.println("Pilih nomor menu untuk menambah item ke pesanan (ketik 0 jika selesai):");

        // Pemilihan item menu oleh pelanggan
        while (true) {
            sistem.tampilkanMenu();
            System.out.print("Pilih nomor menu: ");
            int nomorMenu = scanner.nextInt();
            scanner.nextLine();
            if (nomorMenu == 0) {
                break;
            } else if (nomorMenu > 0 && nomorMenu <= sistem.getDaftarMenu().size()) {
                daftarItemPesanan.add(sistem.getDaftarMenu().get(nomorMenu - 1));
                System.out.println("Item ditambahkan ke pesanan.");
            } else {
                System.out.println("Nomor menu tidak valid. Coba lagi.");
            }
        }

        Pesanan pesanan = null;

        // Tentukan jenis pesanan dan tambahkan informasi tambahan jika perlu
        if (jenisPesanan == 1) {
            System.out.print("Masukkan nomor meja: ");
            int nomorMeja = scanner.nextInt();
            scanner.nextLine();
            pesanan = new PesananMakanDiTempat(1, pelanggan, daftarItemPesanan, nomorMeja);
        } else if (jenisPesanan == 2) {
            System.out.print("Masukkan waktu pengambilan (misal: 14:00): ");
            String waktuPengambilan = scanner.nextLine();
            pesanan = new PesananBawaPulang(1, pelanggan, daftarItemPesanan, waktuPengambilan);
        }

        if (pesanan != null) {
            sistem.buatPesanan(pesanan);
        }

        // Tampilkan riwayat pesanan
        sistem.tampilkanRiwayatPesanan();

        scanner.close();
    }
}
