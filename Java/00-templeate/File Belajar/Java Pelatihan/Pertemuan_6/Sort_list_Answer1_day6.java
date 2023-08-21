import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_list_Answer1_day6 {
    // program Urut menurun dari paling tinggi ke rendah

    public static void main(String[] args) {
    Masuk getinteger = new Masuk();
    getinteger.getInterger(5);
    getinteger.sortIntegers();
    getinteger.printArray();
    }
}
class Masuk{
    int nilai[]; int val[];
    ArrayList<Integer> tampung = new ArrayList<Integer>();
    public ArrayList<Integer> getInterger (int ukuran){

        this.nilai = new int[ukuran];
        Scanner input = new Scanner(System.in);
        for( int i = 0; i<this.nilai.length; i++){
            tampung.add(input.nextInt());
        }
        return (tampung);
    }
    public ArrayList<Integer> sortIntegers(){
        System.out.println("+++++ Sebelum Diurut ++++++");
        System.out.println(tampung);
        Collections.sort(tampung, Collections.reverseOrder());
        System.out.println("+++++++++++++ Setelah Discending ++++++++++++++");
        System.out.println(tampung);
        return tampung;
    }
    public int[] printArray () {
        for (int i = 0; i< tampung.size(); i++){
            System.out.println("Element "+ i + " Contents " + tampung.get(i));
        }
        return null;
    }

}

