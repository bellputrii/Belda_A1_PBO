package Nomor1Prak5;

public class Main {
    public static void main(String[] args) {
        produk produk1 = new produk("Facewash", 45000.0, 2);  
        produk produk2 = new produk("Toner", 35000.0, 2);
        produk produk3 = new produk("Moisturizer", 50000.0, 1);
        produk produk4 = new produk("Serum", 150000.0, 2);


        keranjang keranjang= new keranjang();
        keranjang.tambahproduk(produk1);
        keranjang.tambahproduk(produk2);
        keranjang.tambahproduk(produk3);
        keranjang.tambahproduk(produk4);




        int jumlahproduk = 0;  
        for (produk produk : keranjang.daftarProduk) {
            jumlahproduk += produk.getJumlahProduk();  
        }
        System.out.println("Jumlah barang di keranjang saat ini: " + jumlahproduk);

        keranjang.tampilkanKeranjang();

        double totalHarga = keranjang.hitungTotalHarga();
        System.out.println("Total harga yang harus dibayar: " + totalHarga);
    }
}
