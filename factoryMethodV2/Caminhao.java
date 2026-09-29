package factoryMethodV2;

public class Caminhao implements Transporte{
    @Override 
    public void entregar() {
        System.out.println("Entregue por Caminhao");
    }
    @Override 
    public double getCustoKm() {
        return 0.3;
    }
}
