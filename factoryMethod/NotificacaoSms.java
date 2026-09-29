package factoryMethod;

    
    public class NotificacaoSms implements Notificacao  {
    @Override 
    public void enviar(String mensagem0) {
        System.out.println("SMS");
    }
}
