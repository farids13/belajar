package JavaGeneric.Application;

import javax.annotation.processing.Generated;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import JavaGeneric.util.GenericMethod_ArrayHelper;

public class ArrayHelperApp {
    
    static Integer[] numberArray = {1,2,3,4};
    static String[] strings = {"farid", "satria"};

    public static void main(String[] args) {
        // tipe data generic nya bisa ditulis seperti ini
        System.out.println(GenericMethod_ArrayHelper.<Integer>count(numberArray));
        // atau ngak usah bisa karena udah otomatis
        System.out.println(GenericMethod_ArrayHelper.count(strings));
    }

}
