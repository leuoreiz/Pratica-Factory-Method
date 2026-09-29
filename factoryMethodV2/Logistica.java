package factoryMethodV2;

public abstract class Logistica  {
    protected abstract Transporte criarTransporte();

    public void planejarEntrega(double km) {
        Transporte transporte = criarTransporte();
        transporte.entregar();
        double total = km * transporte.getCustoKm();
        System.out.println("Custo: "+ total);
    }
    
    
}
