package JavaGeneric.Application;

import java.lang.invoke.StringConcatFactory;

import javax.swing.plaf.multi.MultiButtonUI;

import JavaGeneric.Mydata;

public class CovarianApp {
    public static void main(String[] args) {
        Mydata<String> sMydata = new Mydata<>("Farid");
        sMydata.setData("asdas");
        process(sMydata);
    }

    // covarian hanya read only biasanya di awali dengan "?" contoh <? extends Object>
    // ingat Object adalah raja dari semua tipe data di java loh ya
    // covarian artinya kita bisa melakukan subtitusi (child) dengan superType(parent)
    // caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata 
    // kata kunci (? extends parentClass)
    // Ingat Covarian ReadOnly
    public static void process(Mydata<? extends Object> mydata){
        System.out.println(mydata.getData());
    }

    
}
