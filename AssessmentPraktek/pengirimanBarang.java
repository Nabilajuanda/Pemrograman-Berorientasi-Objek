package AssessmentPraktek;

public class pengirimanBarang {
    private String namaPenjual, namaPenjualDropshipper, alamatPenjual, alamatPenjualDropshipper, namaPembeli, alamatPembeli, namaEkspedisi, noResi;
    private double ongkosKirim, nominalAsuransi;
    private boolean dropshipper = false, asuransi = false;
    private int noTransaksi;


    //    normal
    public pengirimanBarang(int noTransaksi, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, String namaEkspedisi, String noResi, double ongkosKirim) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
    }

    //    normal + dropshipper
    public pengirimanBarang(int noTransaksi, String namaPenjual, String namaPenjualDropshipper, String alamatPenjual, String alamatPenjualDropshipper, String namaPembeli, String alamatPembeli, String namaEkspedisi, String noResi, double ongkosKirim) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.namaPenjualDropshipper = namaPenjualDropshipper;
        this.alamatPenjual = alamatPenjual;
        this.alamatPenjualDropshipper = alamatPenjualDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
        this.dropshipper = true;
    }

    //    normal + asuransi
    public pengirimanBarang(int noTransaksi, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, String namaEkspedisi, String noResi, double ongkosKirim, double nominalAsuransi) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
        this.nominalAsuransi = nominalAsuransi;
        this.asuransi = true;
    }

    //  normal + asuransi + dropshipper
    public pengirimanBarang(int noTransaksi, String namaPenjual, String namaPenjualDropshipper, String alamatPenjual, String alamatPenjualDropshipper, String namaPembeli, String alamatPembeli, String namaEkspedisi, String noResi, double ongkosKirim, double nominalAsuransi) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.namaPenjualDropshipper = namaPenjualDropshipper;
        this.alamatPenjual = alamatPenjual;
        this.alamatPenjualDropshipper = alamatPenjualDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
        this.nominalAsuransi = nominalAsuransi;
        this.asuransi = true;
        this.dropshipper = true;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public String getNamaPenjualDropshipper() {
        return namaPenjualDropshipper;
    }

    public String getAlamatPenjual() {
        return alamatPenjual;
    }

    public String getAlamatPenjualDropshipper() {
        return alamatPenjualDropshipper;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public String getNamaEkspedisi() {
        return namaEkspedisi;
    }

    public String getNoResi() {
        return noResi;
    }

    public double getOngkosKirim() {
        return ongkosKirim;
    }

    public double getNominalAsuransi() {
        return nominalAsuransi;
    }

    public boolean isDropshipper() {
        return dropshipper;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public int getNoTransaksi() {
        return noTransaksi;
    }
}
