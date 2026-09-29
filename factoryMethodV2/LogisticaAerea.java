package factoryMethodV2;

public class LogisticaAerea extends Logistica {
    @Override 
    protected Transporte criarTransporte() {
        return new Aviao();
    }
    
}
