
public class Jawaban2 {
    public static boolean shouldWakeUp (boolean menggonggong, int hourOfDay){
    boolean cekKondisi = hourOfDay <= 23 && hourOfDay >= 0 ? true : false;
        if (menggonggong) {
            if (cekKondisi && hourOfDay >= 22 || hourOfDay <= 8) return true;
            else return false;
        }
    return false;
    }
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 2));
    }
}
