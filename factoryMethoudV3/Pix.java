package factoryMethoudV3;

public class Pix implements MetodoPagamento{
    @Override 
    public void processar() {
        System.out.println("Pagamento processado via Pix");
    } 
    @Override 
    public double aplicarTaxa(double valor) {
        return valor;
    }
    
}
