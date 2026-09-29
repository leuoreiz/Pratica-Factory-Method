package factoryMethodV2;

public class LogisticaMaritma extends Logistica{
    @Override 
    protected Transporte criarTransporte() {
        return new Navio();
    }
}
