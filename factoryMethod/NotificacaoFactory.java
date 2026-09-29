package factoryMethod;

public abstract class NotificacaoFactory { 
    protected abstract Notificacao criarNotificacao();


    public void notificar(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
        System.out.println("Notificação enviada com sucesso de " + notificacao);

    }
}

   
