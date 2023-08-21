package JavaGeneric.Application;
import javax.security.auth.spi.LoginModule;

import JavaGeneric.Mydata;

public class GenericClassApp {
    static byte tipeByte = 127;
    public static void main(String[] args) {
        Mydata<String> stringMydata = new Mydata<String>("Farid");
        Mydata<Byte> lMydata = new Mydata<Byte>();
        lMydata.setData(tipeByte);

        System.out.println(lMydata.getData());
        System.out.println(stringMydata.getData());
        
    }
}