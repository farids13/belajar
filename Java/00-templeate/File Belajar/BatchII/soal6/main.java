package BatchII.soal6;

import java.util.LinkedHashSet;
import java.util.Set;
class LinkedHashSetTest {
public static void main (String args[]){
    Set s = new LinkedHashSet();
    s.add("1");
    s.add(1);
    s.add(3);
    s.add(2);
    System.out.println(s);
    }
}

