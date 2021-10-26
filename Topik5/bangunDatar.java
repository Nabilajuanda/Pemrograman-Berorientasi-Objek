package Topik5;

public class bangunDatar {
    float luas() {
        System.out.println("Menghitung luas lingkaran");
        return 0;
    }

    float keliling() {
        System.out.println("\nMenghitung keliling lingkaran (jari-jari)");
        return 0;
    }

    double keliling2() {
        System.out.println("\nMenghitung keliling lingkaran (diameter)");
        return 0;
    }
}

class Lingkaran extends bangunDatar {
    float r;           // r sebagai variabel untuk luas dan keliling (jari-jari)
    double d;          // d sebagai variabel untuk keliling (diameter)

    /** konstruktor **/
    public Lingkaran(float r) {
        this.r = r;
    }
    public Lingkaran(double d) {
        this.d = d;
    }

    /** Method Override Luas **/
    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    /** Method Override Keliling **/
    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);  //Jika diketahui jari-jari lingkaran
    }
    @Override
    public double keliling2() {
        return Math.PI * d;  //Jika diketahui diameter lingkaran
    }
}

class Main {
    public static void main(String[] args) {

        // instansiasi objek bangun_datar
        bangunDatar bangun_datar = new bangunDatar();

        /** -------------------------------------------------*/

        // instansiasi objek lingkaran
        Lingkaran lingkaran = new Lingkaran(7);

        /**-------------------------------------------------*/

        // instansiasi objek lingkaran (diameter)
        Lingkaran lingkaran2 = new Lingkaran(20.4);

        /**-------------------------------------------------*/

        // menjalankan method luas
        bangun_datar.luas();
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("-------------------------");

        // menjalankan method keliling (jari-jari)
        bangun_datar.keliling();
        System.out.println("Keliling lingkaran: " + lingkaran.keliling());
        System.out.println("-------------------------");

        // menjalankan method keliling (diameter)
        bangun_datar.keliling2();
        System.out.println("Keliling lingkaran: " + lingkaran2.keliling2());
    }
}