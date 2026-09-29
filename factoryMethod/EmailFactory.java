package factoryMethod;

public class EmailFactory extends NotificacaoFactory{
    @Override
    protected Notificacao criarNotificacao() {    
        return new NotificacaoEmail();
    }
}
