package Java;

public class Buku {
    /** Deklarasi variabel **/
    String judul;
    String pengarang;
    double harga;

    /** Konstruktor **/
    Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    /** Method setter dan getter **/
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public double getHarga() {
        return harga;
    }

    /** Method ntuk mencetak **/
    public void cetak() {
        System.out.println("\nJudul :" + this.judul);
        System.out.println("Pengarang :" + this.pengarang);
        System.out.println("Harga :" + this.harga);
    }

    public static void main(String[] args) {
        Buku bagus1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku bagus2 = new Buku("UML", "Ivar Jacobson", 400000);

        bagus1.cetak();
        bagus2.cetak();
    }
}
