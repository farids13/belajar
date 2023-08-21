
public class OOPTutorial {
    public static void main(String[] args) {
        Kucing ariel = new Kucing();
        ariel.setAge(12);
        ariel.setColor("Putih");

        System.out.println(ariel.getAge());
        Anjing anjing = new Anjing();

        Kucing cimot = new Kucing(4, "British Short Hair", "Abu-abu", "Panjang");
        System.out.println(cimot.getType());
        cimot.mengeong();
    }
}

class Kucing{
    private int age;
    private String type;
    private String color;
    private String tail;

    public Kucing() {
    }

    public Kucing(int age, String type, String color, String tail) {
        this.age = age;
        this.type = type;
        this.color = color;
        this.tail = tail;
    }

    public void mengeong(){
        System.out.println("Miawwwww");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}

