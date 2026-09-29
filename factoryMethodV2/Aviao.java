package factoryMethodV2;

public class Aviao implements Transporte{
    @Override 
    public void entregar() {
        System.out.println("Entregue por avião");
    }
    @Override 
    public double getCustoKm() {
        return 1.0;
    }
}
