package Object;

public class Motorcycle extends Vehicle{
    public Motorcycle(Long id) {
        super(id);
        setType("motor");
        setFee(1500L);
        setFeeThreshold(25000L);
    }
}
