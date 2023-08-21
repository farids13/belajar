import javax.swing.plaf.synth.SynthStyle;

public class Jawban1 {
    public static void main(String[] args) {
    Hamburger burger = new Hamburger("Farid", "sapi", 12, "Hamburger");
        burger.addHamburgerAddition1("tambah1", 12);
        burger.addHamburgerAddition2("tambah2", 9);
        burger.addHamburgerAddition3("tambah3", 0.2);
        System.out.println(burger.itemizedhamburger());
    
    DeluxeBurger deluxeBurger = new DeluxeBurger(); 
    deluxeBurger.addHamburgerAddition1("tambah1", 12);
    deluxeBurger.addHamburgerAddition2("tambah2", 2);
    System.out.println(deluxeBurger.itemizedhamburger());
        
    }
}
class Hamburger{
    // 4 dasar bahan
    public static String name;
    public static String meat;
    public static double price;
    public static String breadRollType;
    public String addition1Name, addition2Name, addition3Name, addition4Name;
    public double addition1Price, addition2Price, addition3Price, addition4Price;
    
    public Hamburger(){}
    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition1Price;
    }
    public double itemizedhamburger(){
        System.out.println("Base Price = " + this.price);
        if (this.addition1Price != 0){
            System.out.println(this.addition1Name + " Tambahan 1 = " + this.addition1Price);
        }if (this.addition2Price != 0){
            System.out.println(this.addition2Name + " Tambahan 2 = " + this.addition2Price);
        }if (this.addition3Price != 0){
            System.out.println(this.addition3Name + " Tambahan 3 = " + this.addition3Price);
        }if (this.addition4Price != 0){
            System.out.println(this.addition4Name + " Tambahan 4 = " + this.addition4Price);
        }
        System.out.print("Harga Total = ");
        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }
}
class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){ 
        super("Deluxe Burger", "Beef Double", 19.20, "Plain");
        System.out.println("++++++++ Pesanan Deluxe Dibuat +++++++");
        System.out.println(" Kamu akan mendapat Paket Burger , fixings, chips, and drink");
    }
    @Override
       public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("Maaf tidak boleh nambah");
       }
       public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("Maaf tidak boleh nambah");
       }
       public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("Maaf tidak boleh nambah");
       }
       public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println("Maaf tidak boleh nambah");
    }
        public double itemizedhamburger() {
        System.out.println("Base Price ="+ this.price);
        System.out.print("Harga Total Keseluruhan = ");
        return super.itemizedhamburger() + this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        }
}

class HealthyBurger extends Hamburger {
    String healthyExtra1Name, healthyExtra2Name;
    double healthyExtra1Price, healthyExtra2Price;

    // constructor
    public HealthyBurger(String meat, double price){
        super("Healthy Burger", meat, price, "Plain");
    }
    // method
    public void addHealthyAddition1 (String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2 (String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra1Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }
    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("Maaf Tidak bisa tambah reguler addition");
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println("Maaf Tidak bisa tambah reguler addition");
    }

    public double itemizedhamburger(){
        if (healthyExtra1Price != 0){
        System.out.println(this.healthyExtra1Name + " Tambahan Sehat 1 = " + this.healthyExtra1Price);
        }
        if (healthyExtra2Price != 0){
        System.out.println(this.healthyExtra2Name + " Tambahan sehat 2 = " + this.healthyExtra2Price);
        }
        System.out.print("Harga Total  = ");
        return super.itemizedhamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
    }
    
}

