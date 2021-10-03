package Topik2;

class gameCharacter {
    /** Definisi atribut **/
    String name;
    int lifePoint;
    int attackHitPoint;
    int attackKickPoint;

    /** Konstruktor **/
    public gameCharacter() {  // disini authornya tidak pakai parameter
                                // agar instansiasi objeknya tidak error
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    /** method getter **/
    public int getLifePoint() {
        return lifePoint;
    }
    public String getName() {
        return name;
    }

    /** Method skill **/
    public void hit() {
        System.out.println(name + " memukul");
        System.out.println(attackHitPoint + " exp");
        System.out.println("Life point: " + lifePoint);
        System.out.println();
    }
    public void kick() {
        System.out.println(name + " menendang");
        System.out.println(attackKickPoint + " exp");
        System.out.println("Life point: " + lifePoint);
        System.out.println();
    }

    /** Method reaksi terhadap serangan **/
    void kicked() {
        if(attackKickPoint == 25) {
            lifePoint -= 25;
            System.out.println(name + " terkena tendangan");
            System.out.println("Life point: " + lifePoint);
            System.out.println();
        } else if (attackKickPoint == 20) {
            lifePoint -= 20;
            System.out.println(name + " terkena tendangan");
            System.out.println("Life point: " + lifePoint);
            System.out.println();
        }
    }
    void beaten() {
        if(attackHitPoint == 10) {
            lifePoint -= 10;
            System.out.println(name + " terkena pukulan");
            System.out.println("Life point " + lifePoint);
            System.out.println();
        } else if (attackHitPoint == 5) {
            lifePoint -= 5;
            System.out.println(name + " terkena pukulan");
            System.out.println("Life point " + lifePoint);
            System.out.println();
        }
    }
}

public class Fight {
    public static void main(String[] args) {

        /** Objek 1 **/
        gameCharacter player1 = new gameCharacter();
        player1.name = "Raiden";
        player1.attackHitPoint = 10;
        player1.attackKickPoint = 20;
        player1.lifePoint = 100;

        /** Objek 2 **/
        gameCharacter player2 = new gameCharacter();
        player2.name = "Sub-Zero";
        player2.attackHitPoint = 5;
        player2.attackKickPoint = 25;
        player2.lifePoint = 100;

        /** Serangan dasar **/
        player1.kick();
        player2.kicked();

        System.out.println();

        player2.kick();
        player1.kicked();
        System.out.println("------");

        /** Ultimate skill Sub-Zero **/
        System.out.println(player2.name + " menggunakan ultimate skill");
        for(int i = 0; i < 3; i++) {
            System.out.println("-----");
            player2.hit();
            player1.beaten();
        }
        System.out.println("------");

        /** Ultimate skill Raiden **/
        System.out.println(player1.name + " menggunakan ultimate skill");
        for(int i = 0; i < 4; i++) {
            System.out.println("-----");
            player1.kick();
            player2.kicked();
        }

        System.out.println("-----------------------------");
        System.out.println("Hasil pertandingan");
        System.out.println("Raiden");
        System.out.println("Life point: 50" );
        System.out.println();
        System.out.println("Sub-Zero");
        System.out.println("Life point: -25");
    }
}
