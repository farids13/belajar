public class Kucing extends Animal{

    @Override
    public String makan(){
        return "Kucing lagi makan ikan dan baso";
    }

    public String makan(String makanan){
        return "Kucing lagi makan " + makanan;
    }
}
