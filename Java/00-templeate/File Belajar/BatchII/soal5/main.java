package BatchII.soal5;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Urutkan{
    public static void main(String[] args) {
        int [] input = {1,6,7,4,2,9,5};
        String tampung = "", hasil;
        Set wadah = new LinkedHashSet(); 
        for (int i = 0; i < input.length; i++ ){
            tampung ="";
            wadah.add(input[i]);
        }
        System.out.println("Input = "+wadah);
       Arrays.sort(input);
       for (int nilai:input){
           tampung += ", " +nilai ;
       }
       hasil = tampung.substring(2,tampung.length());
       System.out.print("Output = ["+hasil+"]");
    }
}