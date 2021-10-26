package Topik5;

import java.util.Scanner;

/** class bangunDatar2 **/
class bangunDatar2 {
    int luas() {
        System.out.println("Menghitung luas segitiga sama sisi");
        return 0;
    }

    float keliling() {
        System.out.println("Menghitung keliling segitiga sama sisi");
        return 0;
    }
}

/** class Segitiga **/
public class Segitiga extends bangunDatar2 {
    static Scanner scan = new Scanner(System.in);
    int alas;
    int tinggi;

    /** Konstruktor **/
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    /** Method override luas **/
    @Override
    public int luas() {
        return (int) (0.5 * alas * tinggi);
    }

    /** Method override keliling **/
    @Override
    public float keliling() {
        return (float) (alas + tinggi + tinggi);
    }

    /** Method input data **/
    public static void inputData() {
        System.out.println("Masukkan alas: ");
        int alas = scan.nextInt();
        System.out.println("Masukkan tinggi: ");
        int tinggi = scan.nextInt();

        // instansiasi objek bangun_datar
        bangunDatar2 bangun_datar = new bangunDatar2();

        /* --------------------------------------------------- */

        // masukkan nilai alas dan tinggi
        Segitiga segitiga = new Segitiga(34, 34);

        /* --------------------------------------------------- */

        // panggil method luas()
        bangun_datar.luas();
        System.out.println("\nLuas segitiga sama sisi: " + segitiga.luas());

        /* --------------------------------------------------- */

        // panggil method keliling()
        bangun_datar.keliling();
        System.out.println("\nKeliling segitiga sama sisi: " + segitiga.keliling());
    }

    /** Method Main **/
    public static void main(String[] args) {
        int pilihan;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1. Input data");
            System.out.println("2. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    System.out.println("Keluar aplikasi");
                    break;
                default:
                    System.out.println("Tidak ada dalam pilihan");
                    break;
            }
        } while (pilihan != 2);
    }
}
