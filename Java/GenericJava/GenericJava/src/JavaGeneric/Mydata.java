package JavaGeneric;
import javax.imageio.ImageIO;
import javax.swing.plaf.synth.SynthScrollBarUI;

import JavaGeneric.Application.GenericClassApp;

public class Mydata<T> extends GenericClassApp {
    //generic paramater pake Satu kata aja

    // field
    private T data;

    // constructor
    public Mydata(){}
    
    public Mydata(T data){
        this.data = data;
    }

    // getter setter
    public T getData() {
        return data;
    }
    public void setData(T data){
        this.data = data;
    }

    public static void main(String[] args) {
        Mydata <String> stringMydata = new Mydata<String>("Farid");
        Mydata <Integer> iMydata = new Mydata<Integer>();
        iMydata.setData(123);
        System.out.println(stringMydata.getData());
        System.out.println(iMydata.getData());
    }

}
