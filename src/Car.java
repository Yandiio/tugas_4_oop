/**
 * @author Yandi Fenanda
 * @createdOn 08/05/23 Monday
 */
public class Car {
    String merk;
    Integer roda;
    String warna;
    int kecepatan;
    String mesin;

    String transmisi;

    void akselerasi()
    {
        System.out.println("Mobil " + merk + " melaju dengan kecepatan " + kecepatan + "km/jam");
    }

    void pengereman() {
        System.out.println("Mobil " + merk + " mengerem");
    }

    void pindahTransmisi()
    {
        System.out.println("Mobil" + merk + " pindah transmisi ke "+ transmisi);
    }

    public static void main(String args[]) {
        MobilBalap f1 = new MobilBalap();

        f1.roda = 4;
        f1.kapasitasNitro = 70;
        f1.merk = "SF90 Ferrari";
        f1.kecepatan = 300;
        f1.warna = "Merah";
        f1.mesin = "Ferrari 064 1.6 L";
        f1.transmisi = "7";

        System.out.println(f1.merk + ", Informasi: " + f1.mesin + ", transmisi: " + f1.transmisi);
        f1.akselerasi();
        f1.kecepatanPenuh();
        f1.limitKecepatan();

        Sedan mercedes = new Sedan();

        mercedes.roda = 4;
        mercedes.merk = "W120";
        mercedes.kecepatan = 120;
        mercedes.warna = "Hitam";
        mercedes.mesin = "M136 1.8L";
        mercedes.transmisi = "4";

        System.out.println("\n" + mercedes.merk + ", Informasi: " + mercedes.mesin + ", transmisi: " + mercedes.transmisi);
        mercedes.pengereman();
        mercedes.bukaAtapMobil();
        mercedes.nyalakanWiper();

        Jeep jeep = new Jeep();

        jeep.roda = 4;
        jeep.merk = "G Class";
        jeep.kecepatan = 150;
        jeep.warna = "Hitam";
        jeep.mesin = "M136 1.8L";
        jeep.transmisi = "6";

        System.out.println("\n" + jeep.merk + ", Informasi: " + jeep.mesin + ", transmisi: " + jeep.transmisi);
        jeep.modeTanjakan(true);
    }
}
