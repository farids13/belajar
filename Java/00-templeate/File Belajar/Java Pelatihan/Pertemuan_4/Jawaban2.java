public class Jawaban2 {
    public static void main(String[] args) {
        Wall dinding = new Wall(12.6,24.9);
        System.out.println("Tinggi Dinding = "+dinding.getWidth());
        System.out.println("Lebar Dinding = "+ dinding.getHeight());
        System.out.println("Area wall = "+ dinding.getArea());
        dinding.setHeight(-50);
        dinding.setWidth(50);
        System.out.println("Tinggi Dinding setter = "+dinding.getWidth());
        System.out.println("Lebar Dinding setter = "+ dinding.getHeight());
    }
}
class Wall {
    private double width, height;

    public Wall(){}
    
    public Wall(double width, double height){
        if (width < 0) {width = 0; this.width = width;}
        else this.width = width;
        if (height < 0) {height = 0; this.height = height;}
        else this.height = height;
    }
    public double getWidth (){ return this.width;}
    public double getHeight(){return this.height;}
    public void setWidth(double width) {
        if (width < 0) { width = 0; this.width = width;}
        else this.width = width;
    }
    public void setHeight(double height){
        if (height < 0){ height = 0; this.height = height;}
        else this.height = height;
    }
    public double getArea() {return (this.width * this.height);}
}
