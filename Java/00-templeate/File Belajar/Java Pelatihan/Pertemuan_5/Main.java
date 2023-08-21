public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        System.out.println(animal.makan());
//        System.out.println(animal.tidur());
//        System.out.println(animal.gerak());

        Kucing cimot = new Kucing();
        System.out.println(cimot.makan());
        System.out.println(cimot.makan("Whiskas"));
        System.out.println(cimot.tidur());
        System.out.println(cimot.gerak());

        Ikan ikan = new Ikan();
        System.out.println(ikan.animal.gerak());
        System.out.println(ikan.animal.tidur());
        System.out.println(ikan.animal.makan());
    }
}
