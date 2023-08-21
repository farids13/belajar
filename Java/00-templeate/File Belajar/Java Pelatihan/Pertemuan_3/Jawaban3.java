
public class Jawaban3 {
    public static boolean isLeapYear(int namedYear) {
        if (namedYear >= 1 && namedYear <= 9999) {
            if (namedYear % 400 == 0) {
                System.out.print(namedYear + " Merupakan Tahun Kabisat\n" ); return true;
              } else if (namedYear % 100 == 0) {
                System.out.print(namedYear + " Bukan Tahun Kabisat\n");
              } else if (namedYear % 4 == 0) {
                System.out.print(namedYear + " Merupakan Tahun Kabisat\n"); return true;
              } else {
                System.out.print(namedYear+ " Bukan Tahun Kabisat\n");
              }
        }else return false;
        return false;
    }

        public static void main(String[] args) {
            System.out.println(isLeapYear(2004));
        }
    
}
