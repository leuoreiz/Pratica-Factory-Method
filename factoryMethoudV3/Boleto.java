package factoryMethoudV3;

public class Boleto implements MetodoPagamento{
    @Override 
    public void processar() {
        System.out.println("Pagamento por Boleto");
    }
    @Override 
    public double aplicarTaxa(double valor) {
        return valor + 3;
    }
    
}
