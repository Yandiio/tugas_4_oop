/**
 * @author Yandi Fenanda
 * @createdOn 08/05/23 Monday
 */
public class Jeep extends Car{
    void modeTanjakan(boolean aktif)
    {
        if (aktif) {
            System.out.println(super.merk + " menggunakan mode menanjak");
            return;
        }
    }
}
