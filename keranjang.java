package Nomor1Prak5;

import java.util.ArrayList;

class keranjang {

    static ArrayList<produk> daftarProduk;

    public keranjang() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahproduk(produk produk) {
        int totalJumlah = hitungTotalJumlah();
        if (totalJumlah + produk.getJumlahProduk() <= 5) {
            daftarProduk.add(produk);
            System.out.println("Produk berhasil ditambahkan ke keranjang.");
        } else {
            System.out.println("Keranjang sudah penuh, tidak dapat menambahkan produk lagi.");
        }
    }

    public void tampilkanKeranjang() {
        System.out.println("Barang di dalam keranjang:");
        for (produk produk : daftarProduk) {
            System.out.println("Nama: " + produk.getNamaProduk() + ", Jumlah: " + produk.getJumlahProduk());
        }
    }

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (produk produk : daftarProduk) {
            totalHarga += produk.getHargaProduk() * produk.getJumlahProduk();
        }
        return totalHarga;
    }

    public int hitungJumlahBarang() {
        return daftarProduk.size();
    }

    private int hitungTotalJumlah() {
        int totalJumlah = 0;
        for (produk produk : daftarProduk) {
            totalJumlah += produk.getJumlahProduk();
        }
        return totalJumlah;
    }
}
