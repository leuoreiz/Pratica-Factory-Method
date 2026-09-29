package factoryMethod;

public class SmsFactory extends NotificacaoFactory{ 
    @Override 
    protected  Notificacao criarNotificacao() {
        return new NotificacaoSms();
    }

}