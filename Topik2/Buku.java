package Topik2;

import java.util.ArrayList;
import java.util.Scanner;

class dataBuku {
    /** Definisi atribut **/
    String isbn;
    String judulBuku;
    String pengarang;
    int tahunTerbit;
    float harga;
    float rating;

    /** Konstruktor **/
    public dataBuku(String judulBuku, String isbn, String pengarang, float harga, float rating, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.isbn = isbn;
        this.pengarang = pengarang;
        this.harga = harga;
        this.rating = rating;
        this.tahunTerbit = tahunTerbit;
    }

    /** Method setter dan getter **/
    public void setJudulBuku(String judulBuku) { this.judulBuku = judulBuku; }
    public String getJudulBuku() { return judulBuku; }
    public void setPengarang(String pengarang) { this.pengarang = pengarang; }
    public String getPengarang() { return pengarang; }
    public void setTahunTerbit(int tahunTerbit) { this.tahunTerbit = tahunTerbit; }
    public int getTahunTerbit() { return tahunTerbit; }
    public void setHarga(float harga) { this.harga = harga; }
    public float getHarga() { return harga = harga; }
    public void setRating(float rating) { this.rating = rating; }
    public float getRating() { return rating; }
    public String getIsbn() { return isbn; }
}

/** Class yang berisi method **/
public class Buku {
    private static final ArrayList<dataBuku> dataBuku = new ArrayList<>();
    private static final Scanner scan = new Scanner(System.in);

    private static void cariData() {
        System.out.println("Pencarian data");
            System.out.println("Masukkan judul buku: ");
            String judulBuku = scan.nextLine();
            dataBuku B = cariBukuByJudul(judulBuku);

            if (dataBuku != null) {
                System.out.println("Data: " + B.getJudulBuku() + " - " + B.getIsbn()
                        + B.getPengarang() + " - " + B.getTahunTerbit() + " - " + B.getHarga()
                        + "-" + B.getRating());

                System.out.print("Ubah data? (Iya/Tidak): ");
                String jawaban = scan.nextLine();

                if (jawaban.equalsIgnoreCase("Iya")) {
                    ubahData(B);
                } else {
                    System.out.println("Kembali ke menu utama");
                }
            }
    }

    private static void ubahData(dataBuku B) {
            /* Ubah judul buku **/
            System.out.print("Masukkan judul baru: ");
            String bukuBaru = scan.nextLine();
            B.setJudulBuku(bukuBaru);

            /* Ubah nama pengarang **/
            System.out.println("Masukkan pengarang baru: ");
            String pengarangBaru = scan.nextLine();
            B.setPengarang(pengarangBaru);

            /* Ubah tahun terbit **/
            System.out.println("Masukkan tahun terbit baru: ");
            int tahunterbitBaru = scan.nextInt();
            B.setTahunTerbit(tahunterbitBaru);

            /* Ubah harga buku **/
            System.out.println("Masukkan harga baru: ");
            float hargaBaru = scan.nextFloat();
            B.setHarga(hargaBaru);

            /* Ubah rating buku **/
            System.out.println("Masukkan rating baru: ");
            float ratingBaru = scan.nextFloat();
            B.setRating(ratingBaru);

            System.out.println("Data telah diubah!\n");
    }

    private static dataBuku cariBukuByJudul(String judulBuku) {
        dataBuku bFound = null;
        for (dataBuku B : dataBuku) {
            if (judulBuku.equals(B.getJudulBuku())) {
                bFound = B;
            }
        }
        return bFound;
    }

    private static void tampilkanData() {
        System.out.println("\nMenampilkan data");
        for (dataBuku B : dataBuku) {
            System.out.println("Data: " + B.getJudulBuku() + " - " + B.getIsbn()
                    + B.getPengarang() + " - " + B.getTahunTerbit() + " - " + B.getHarga()
                    + " - " + B.getRating());
        }
        System.out.println();
    }

    private static void inputData() {
        System.out.println("\nIdentitas buku");
            System.out.println("Masukkan Judul buku: ");
            String judulBuku = scan.next();
            System.out.println("Masukkan Isbn: ");
            String Isbn = scan.nextLine();
            System.out.println("Masukkan nama pengarang: ");
            String pengarang = scan.next();
            System.out.println("Masukkan harga buku: ");
            float harga = scan.nextFloat();
            System.out.println("Masukkan rating buku: ");
            float rating = scan.nextFloat();
            System.out.println("Masukkan tahun terbit: ");
            int tahunTerbit = scan.nextInt();

            if (cariBukuByJudul(judulBuku) != null) {
                inputData();
            } else {
                dataBuku B = new dataBuku(judulBuku, Isbn, pengarang, harga, rating, tahunTerbit);
                dataBuku.add(B);
                System.out.println("Data tersimpan\n");
            }
    }

    /**
     * Method untuk menjalankan program
     **/
    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("1. Input data");
            System.out.println("2. Cari/ubah data");
            System.out.println("3. Tampilkan data");
            System.out.println("4. Keluar");

                System.out.print("Masukkan pilihan: ");
                pilihan = scan.nextInt();

                switch (pilihan) {
                    case 1:
                        inputData();
                        break;
                    case 2:
                        cariData();
                        break;
                    case 3:
                        tampilkanData();
                        break;
                    case 4:
                        System.out.println("keluar aplikasi");
                        break;
                    default:
                        System.out.println("Tidak ada dalam pilihan");
                        break;
                }
            } while(pilihan != 4);
    }
}