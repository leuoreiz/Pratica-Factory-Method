package factoryMethod;

//interface - não precisa saber qual notificação concreta será enviada(Se será SMS, Email ou Push) Apenas precisa saber 
// que há a necessidade de enviar uma notificação

public interface Notificacao {
    void enviar(String mensagem);
    
}