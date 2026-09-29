package factoryMethoudV3;

public class ProcessarBoleto extends Processar{
    @Override 
    protected MetodoPagamento CriarMetodo() {
        return new Boleto();
    }
    
}
