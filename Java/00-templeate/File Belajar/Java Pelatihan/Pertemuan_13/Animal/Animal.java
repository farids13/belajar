package Animal;

public class Animal extends AuditAnimal {
    String habitat;
    int maxUmur;
    String hewan;
    String caraBernafas;

    public Animal(){

    }



    // ++++++++++++++++++++ Setter And Getter ++++++++++++++++++
    public String getHabitat (){
        return habitat;
    }
    public String setHabitat(String habitat){
        return this.habitat = habitat;
    }
    public int getMaxUmur() {
        return maxUmur;
    }
    public int setMaxUmur(int maxUmur){
        return this.maxUmur = maxUmur;
    }
    public String getHewan(){
        return hewan;
    }
    public String setHewan(String hewan){
        return this.hewan = hewan;
    }
    public String getCaraBernafas(){
        return caraBernafas;
    }
    public String setCaraBernafas(String caraBernafas){
        return this.caraBernafas = caraBernafas;
    }
}
