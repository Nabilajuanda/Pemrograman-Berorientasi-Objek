package AssessmentPraktek;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<pengirimanBarang> dataTransaksi = new ArrayList<>();
        String menu, namaPenjual, namaPenjualDropshipper = null, alamatPenjual, alamatPenjualDropshipper = null, namaPembeli, alamatPembeli, namaEkspedisi, noResi;
        double ongkosKirim, nominalAsuransi = 0;
        int noTransaksi = 1;
        pengirimanBarang transaksi;
        boolean dropshipper, asuransi;

        while (true) {
            System.out.println("Menu:\n" +
                    "1. Input Transaksi\n" +
                    "2. Data Transaksi\n" +
                    "3. Keluar\n");
            System.out.print("Pilih: ");
            menu = input.next();
            switch (menu) {
                case "1":
                    System.out.print("Nama Penjual: ");
                    namaPenjual = input.next();
                    System.out.print("Alamat Penjual: ");
                    alamatPenjual = input.next();
                    System.out.print("Nama Pembeli: ");
                    namaPembeli = input.next();
                    System.out.print("Alamat Pembeli: ");
                    alamatPembeli = input.next();
                    System.out.print("Ongkos Kirim: ");
                    ongkosKirim = input.nextDouble();
                    System.out.print("Nama Ekspedisi: ");
                    namaEkspedisi = input.next();
                    System.out.print("No Resi: ");
                    noResi = input.next();
                    System.out.print("Dropshipper? true/false ");
                    dropshipper = input.nextBoolean();
                    if (dropshipper) {
                        System.out.print("Nama Penjual Dropshipper: ");
                        namaPenjualDropshipper = input.next();
                        System.out.print("Alamat Penjual Dropshipper: ");
                        alamatPenjualDropshipper = input.next();
                    }
                    System.out.print("Asuransi? true/false ");
                    asuransi = input.nextBoolean();
                    if (asuransi) {
                        System.out.print("Nominal Asuransi: ");
                        nominalAsuransi = input.nextDouble();
                    }
                    if (dropshipper && asuransi) {
                        transaksi = new pengirimanBarang(noTransaksi, namaPenjual, namaPenjualDropshipper, alamatPenjual, alamatPenjualDropshipper, namaPembeli, alamatPembeli, namaEkspedisi, noResi, ongkosKirim, nominalAsuransi);
                        System.out.println("No Transaksi: " + transaksi.getNoTransaksi());
                        System.out.println("No Resi: " + transaksi.getNoResi());
                        System.out.println("Nama Eskpedisi: " + transaksi.getNamaEkspedisi());
                        System.out.println("Ongkos Kirim: " + transaksi.getOngkosKirim());
                        System.out.println("Nama Pengirim: " + transaksi.getNamaPenjualDropshipper());
                        System.out.println("Alamat Pengirim: " + transaksi.getAlamatPenjualDropshipper());
                        System.out.println("Nama Penerima: " + transaksi.getNamaPembeli());
                        System.out.println("Alamat Penerima: " + transaksi.getAlamatPembeli());
                        System.out.println("Nominal Asuransi: " + transaksi.getNominalAsuransi());
                    } else if (dropshipper) {
                        transaksi = new pengirimanBarang(noTransaksi, namaPenjual, namaPenjualDropshipper, alamatPenjual, alamatPenjualDropshipper, namaPembeli, alamatPembeli, namaEkspedisi, noResi, ongkosKirim);
                        System.out.println("No Transaksi: " + transaksi.getNoTransaksi());
                        System.out.println("No Resi: " + transaksi.getNoResi());
                        System.out.println("Nama Eskpedisi: " + transaksi.getNamaEkspedisi());
                        System.out.println("Ongkos Kirim: " + transaksi.getOngkosKirim());
                        System.out.println("Nama Pengirim: " + transaksi.getNamaPenjualDropshipper());
                        System.out.println("Alamat Pengirim: " + transaksi.getAlamatPenjualDropshipper());
                        System.out.println("Nama Penerima: " + transaksi.getNamaPembeli());
                        System.out.println("Alamat Penerima: " + transaksi.getAlamatPembeli());
                    } else if (asuransi) {
                        transaksi = new pengirimanBarang(noTransaksi, namaPenjual, alamatPenjual, namaPembeli, alamatPembeli, namaEkspedisi, noResi, ongkosKirim, nominalAsuransi);
                        System.out.println("No Transaksi: " + transaksi.getNoTransaksi());
                        System.out.println("No Resi: " + transaksi.getNoResi());
                        System.out.println("Nama Eskpedisi: " + transaksi.getNamaEkspedisi());
                        System.out.println("Ongkos Kirim: " + transaksi.getOngkosKirim());
                        System.out.println("Nama Pengirim: " + transaksi.getNamaPenjual());
                        System.out.println("Alamat Pengirim: " + transaksi.getAlamatPenjual());
                        System.out.println("Nama Penerima: " + transaksi.getNamaPembeli());
                        System.out.println("Alamat Penerima: " + transaksi.getAlamatPembeli());
                        System.out.println("Nominal Asuransi: " + transaksi.getNominalAsuransi());
                    } else {
                        transaksi = new pengirimanBarang(noTransaksi, namaPenjual, alamatPenjual, namaPembeli, alamatPembeli, namaEkspedisi, noResi, ongkosKirim);
                        System.out.println("No Transaksi: " + transaksi.getNoTransaksi());
                        System.out.println("No Resi: " + transaksi.getNoResi());
                        System.out.println("Nama Eskpedisi: " + transaksi.getNamaEkspedisi());
                        System.out.println("Ongkos Kirim: " + transaksi.getOngkosKirim());
                        System.out.println("Nama Pengirim: " + transaksi.getNamaPenjual());
                        System.out.println("Alamat Pengirim: " + transaksi.getAlamatPenjual());
                        System.out.println("Nama Penerima: " + transaksi.getNamaPembeli());
                        System.out.println("Alamat Penerima: " + transaksi.getAlamatPembeli());
                    }
                    dataTransaksi.add(transaksi);
                    noTransaksi++;
                    break;
                case "2":
                    for (pengirimanBarang t : dataTransaksi) {
                        dropshipper = t.isDropshipper();
                        asuransi = t.isAsuransi();
                        if (dropshipper && asuransi) {
                            System.out.println("No Transaksi: " + t.getNoTransaksi());
                            System.out.println("No Resi: " + t.getNoResi());
                            System.out.println("Nama Eskpedisi: " + t.getNamaEkspedisi());
                            System.out.println("Ongkos Kirim: " + t.getOngkosKirim());
                            System.out.println("Nama Pengirim: " + t.getNamaPenjualDropshipper());
                            System.out.println("Alamat Pengirim: " + t.getAlamatPenjualDropshipper());
                            System.out.println("Nama Penerima: " + t.getNamaPembeli());
                            System.out.println("Alamat Penerima: " + t.getAlamatPembeli());
                            System.out.println("Nominal Asuransi: " + t.getNominalAsuransi());
                        } else if (dropshipper) {
                            System.out.println("No Transaksi: " + t.getNoTransaksi());
                            System.out.println("No Resi: " + t.getNoResi());
                            System.out.println("Nama Eskpedisi: " + t.getNamaEkspedisi());
                            System.out.println("Ongkos Kirim: " + t.getOngkosKirim());
                            System.out.println("Nama Pengirim: " + t.getNamaPenjualDropshipper());
                            System.out.println("Alamat Pengirim: " + t.getAlamatPenjualDropshipper());
                            System.out.println("Nama Penerima: " + t.getNamaPembeli());
                            System.out.println("Alamat Penerima: " + t.getAlamatPembeli());
                        } else if (asuransi) {
                            System.out.println("No Transaksi: " + t.getNoTransaksi());
                            System.out.println("No Resi: " + t.getNoResi());
                            System.out.println("Nama Eskpedisi: " + t.getNamaEkspedisi());
                            System.out.println("Ongkos Kirim: " + t.getOngkosKirim());
                            System.out.println("Nama Pengirim: " + t.getNamaPenjual());
                            System.out.println("Alamat Pengirim: " + t.getAlamatPenjual());
                            System.out.println("Nama Penerima: " + t.getNamaPembeli());
                            System.out.println("Alamat Penerima: " + t.getAlamatPembeli());
                            System.out.println("Nominal Asuransi: " + t.getNominalAsuransi());
                        } else {
                            System.out.println("No Transaksi: " + t.getNoTransaksi());
                            System.out.println("No Resi: " + t.getNoResi());
                            System.out.println("Nama Eskpedisi: " + t.getNamaEkspedisi());
                            System.out.println("Ongkos Kirim: " + t.getOngkosKirim());
                            System.out.println("Nama Pengirim: " + t.getNamaPenjual());
                            System.out.println("Alamat Pengirim: " + t.getAlamatPenjual());
                            System.out.println("Nama Penerima: " + t.getNamaPembeli());
                            System.out.println("Alamat Penerima: " + t.getAlamatPembeli());
                        }
                    }
                    break;
                case "3":
                    System.exit(0);
                    break;
            }
        }
    }
}
