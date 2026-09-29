package factoryMethodV2;

public class LogisticaRodoviaria extends Logistica{
    @Override 
    protected Transporte criarTransporte() {
        return new Caminhao();
    }
}
