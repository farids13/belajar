import java.nio.channels.GatheringByteChannel;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Jawaban3 {
    public static void main(String[] args) {
        Circle lingkar = new Circle(10);
        System.out.println("Jari Jari = "+lingkar.getRadius());
        System.out.println("Area = "+lingkar.getArea());
        Circle lingkar2 = new Circle(-62);
        System.out.println("Jari Jari False = "+lingkar2.getRadius());
        Cylinder cilinder = new Cylinder(10, 2);
        System.out.println("Luas cilinder = "+cilinder.getVolume());
        Cylinder cilinder2 = new Cylinder(10, -23);
        System.out.println("Tinggi cilinder false = " + cilinder2.getHeight());
    }
}
class Circle{
    private double radius;

    public Circle(double radius){
        if(radius < 0 ) {radius =0 ;this.radius = radius;}
        else this.radius = radius;
    }
    public double getRadius(){return this.radius;}
    public double getArea(){
        return (Math.PI * (this.radius * this.radius));
    }
}
class Cylinder extends Circle{
    private double height;
    public Cylinder (double radius , double height){
        super(radius);
        if (height< 0 ) {height = 0; this.height = height;}
        else this.height = height;
    }
    public double getHeight() {return this.height;}
    public double getVolume() {
        // phi r kuadrat * t
        return (super.getArea() * this.height) ;
    }
}
