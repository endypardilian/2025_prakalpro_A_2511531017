package pekan4;

	import java.util.Scanner;

	public class tugasAlproPekan4_2511531017 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        String nama, namaHari = "", namaWaktu = "", namaStudio = "";
	        int jumlah, hari, waktu, studio;
	        double hargaDasar = 50000, biayaHari = 0, biayaWaktu = 0, biayaStudio = 0, diskon = 0;
	        System.out.print("Masukkan nama pembeli: ");
	        nama = input.nextLine();
	        System.out.print("Masukkan jumlah tiket: ");
	        jumlah = input.nextInt();
	        System.out.print("Masukkan hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
	        hari = input.nextInt();
	        System.out.print("Masukkan waktu tayang (1=Pagi, 2=Siang, 3=Malam): ");
	        waktu = input.nextInt();
	        System.out.print("Masukkan jenis studio (1=Regular, 2=Deluxe, 3=Premium): ");
	        studio = input.nextInt();
	        input.close();
	        switch (hari) {
	            case 1 -> { biayaHari = 0; namaHari = "Senin-Kamis"; }
	            case 2 -> { biayaHari = 0.10; namaHari = "Jumat"; }
	            case 3 -> { biayaHari = 0.30; namaHari = "Sabtu-Minggu"; }
	            default -> System.out.println("Input hari tidak valid.");
	        }
	        switch (waktu) {
	            case 1 -> { biayaWaktu = 0; namaWaktu = "Pagi"; }
	            case 2 -> { biayaWaktu = 0.10; namaWaktu = "Siang"; }
	            case 3 -> { biayaWaktu = 0.20; namaWaktu = "Malam"; }
	            default -> System.out.println("Input waktu tidak valid.");
	        }
	        switch (studio) {
	            case 1 -> { biayaStudio = 0; namaStudio = "Regular"; }
	            case 2 -> { biayaStudio = 0.20; namaStudio = "Deluxe"; }
	            case 3 -> { biayaStudio = 0.40; namaStudio = "Premium"; }
	            default -> System.out.println("Input studio tidak valid.");
	        }
	        double hargaPerTiket = hargaDasar * (1 + biayaHari + biayaWaktu + biayaStudio);
	        double subtotal = hargaPerTiket * jumlah;
	        if (jumlah > 4) {
	            diskon = 0.20 * subtotal;
	        }
	        double total = subtotal - diskon;

	        System.out.println("\n====== PEMBELIAN TIKET BIOSKOP ======");
	        System.out.println("Nama Pembeli    : " + nama);
	        System.out.println("Jumlah Tiket    : " + jumlah);
	        System.out.println("Hari            : " + namaHari);
	        System.out.println("Waktu Tayang    : " + namaWaktu);
	        System.out.println("Jenis Studio    : " + namaStudio);
	        System.out.println("------------------------------------");
	        System.out.println("Harga Dasar     : Rp " + hargaDasar + "/tiket");
	        System.out.println("Biaya Hari      : +" + (biayaHari * 100) + "%");
	        System.out.println("Biaya Waktu     : +" + (biayaWaktu * 100) + "%");
	        System.out.println("Biaya Studio    : +" + (biayaStudio * 100) + "%");
	        System.out.println("Harga per Tiket : Rp " + hargaPerTiket);
	        System.out.println("Subtotal        : Rp " + subtotal);
	        System.out.println("Diskon (20%)    : Rp " + diskon);
	        System.out.println("------------------------------------");
	        System.out.println("TOTAL BAYAR     : Rp " + total);
	        System.out.println("====================================");
	    }
	}