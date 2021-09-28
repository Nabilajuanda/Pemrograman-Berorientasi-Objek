package Java;

public class Barang {

    /** Deklarasi variabel **/
    private String idProduk;
    private String nama;
    private double harga;

    /** Konstruktor **/
    Barang(String idProduk, String nama, double harga) {   // Konstruktor 3 parameter
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    Barang(String idProduk, String nama) {   // Konstruktor 2 parameter
        this.idProduk = idProduk;
        this.nama = nama;
    }

    /** method setter dan getter **/
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }
    public String getIdProduk() {
        return idProduk;
    }

    /** method untuk mencetak **/
    public void cetak() {
        System.out.println("\nId Produk :" + idProduk);
        System.out.println("Nama Barang :" + nama);
        System.out.println("Harga :" + harga);
    }

    /** method untuk menghitung total harga **/
    public static double tambah(double x, double y, double z) {
        return x + y + z;
    }

    /** Method untuk menjalankan program **/
    public static void main(String[] args) {

        // Membuat objek dengan kontruktor 2 parameter
        Barang baru1 = new Barang("BRG-001", "Tas Gucci");
        baru1.cetak();
        Barang baru2 = new Barang("BRG-002", "Printer Epson L355");
        baru2.cetak();

        // Membuat objek dengan konstruktor 3 parameter
        Barang lama1 = new Barang("BRG-003", "Koper", 150);
        lama1.cetak();
        Barang lama2 = new Barang("BRG-004", "Helm", 20);
        lama2.cetak();

        // Hitung total harga
        double a = Barang.tambah(0, 150, 20);
        System.out.println("\nTotal harga BRG-001, BRG-003, dan BRG-004 adalah " + a);
    }
}
