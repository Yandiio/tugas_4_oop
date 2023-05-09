/**
 * @author Yandi Fenanda
 * @createdOn 08/05/23 Monday
 */
public class MobilBalap extends Car{
    boolean traksi;
    boolean lepasStir;
    int kapasitasNitro;


    void kecepatanPenuh()
    {
        if (kapasitasNitro > 0) {
            System.out.println("Tambah kecepatan penuh dari " + super.kecepatan + "km/jam menjadi " + (super.kecepatan + 10));
            System.out.println("Sisa nitro menjadi" + (kapasitasNitro - 10));
            return;
        }

        System.out.println("Tidak ada nitro");
    }

    void limitKecepatan()
    {
        if (super.kecepatan > 60) {
            System.out.println("Masuk pitlane");
            System.out.println("Limit kecepatan menjadi " + 60 +"km/jam");
            super.kecepatan = 60;
        }
    }
}
