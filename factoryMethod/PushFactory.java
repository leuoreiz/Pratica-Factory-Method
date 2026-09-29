package factoryMethod;

public class PushFactory extends NotificacaoFactory{
    @Override 
    protected Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
