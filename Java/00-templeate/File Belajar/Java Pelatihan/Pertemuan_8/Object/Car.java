package Object;

public class Car extends Vehicle {
    public Car(Long id) {
        super(id);
        setType("mobil");
        setFee(5000L);
        setFeeThreshold(100000L);
    }
}
