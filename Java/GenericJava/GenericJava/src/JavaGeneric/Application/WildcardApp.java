package JavaGeneric.Application;

import JavaGeneric.Mydata;

// wildcard hanya disarankan untuk print data saja tidak diperkenankna men set data karena bahaya
public class WildcardApp {
    public static void main(String[] args) {
        print(new Mydata<Integer>(100));
    }

    public static void print (Mydata<?> data){
        System.out.println(data.getData());
    }
}
