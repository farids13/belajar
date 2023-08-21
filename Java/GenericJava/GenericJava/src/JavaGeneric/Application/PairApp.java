package JavaGeneric.Application;

import JavaGeneric.Pair;

public class PairApp {
    
    static byte value = 12;
    public static void main(String[] args) {
        Pair<String, Byte> pair = new Pair<String, Byte>("farid",value);
        System.out.println(pair.getSecond());
        System.out.println(pair.getFirst());
    }

}
