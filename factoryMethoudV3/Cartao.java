package factoryMethoudV3;

public class Cartao implements MetodoPagamento{
    @Override 
    public void processar() {
        System.out.println("Pagamento por cartão");
    }
    @Override 
    public double aplicarTaxa(double valor) {
        return valor * 1.05;
    }

}
