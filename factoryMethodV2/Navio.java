package factoryMethodV2;

public class Navio implements Transporte{
    @Override 
    public void entregar() {
        System.out.println("Entrega realizada por: Navio");
    }
    @Override 
    public double getCustoKm() {
        return 0.5;
    }
}