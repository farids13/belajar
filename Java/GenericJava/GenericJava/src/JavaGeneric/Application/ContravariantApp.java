package JavaGeneric.Application;

import JavaGeneric.Mydata;

/* contravaraint artinya kita bisa subtitusi dari supertype(parent) dengan subtype(child) 
 * INI KEBALIKAN DARI COVARIAN
 * caranya adalah dengan menggunakan kata kunci <? super SubClass>
 * 
*/
public class ContravariantApp {
    public static void main(String[] args) {
        Mydata<Object> oMydata = new Mydata();
        contravariant(oMydata);
        
    }

    public static void contravariant (Mydata<? super String> data){
        System.out.println(data.getData());
    }

}

