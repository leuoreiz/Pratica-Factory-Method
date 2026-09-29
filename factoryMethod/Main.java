package factoryMethod;

public class Main {
    public static void main(String[] args) {
        NotificacaoFactory factory = new SmsFactory();
        
        factory.notificar(null);

        NotificacaoFactory factoryEmail = new EmailFactory();
        factoryEmail.notificar(null);

        NotificacaoFactory factoryPush = new PushFactory();
        factoryPush.notificar(null);

    }
}
