package Nomor1Prak5;

public class produk {
    
    String namaProduk;
    double hargaProduk;
    int jumlahProduk;

    // Konstruktor
    public produk(String namaProduk, double hargaProduk, int jumlahProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.jumlahProduk = jumlahProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }


    
} 