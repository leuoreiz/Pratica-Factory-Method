package modelosProva.observer;

/*
 * PAPEL NO PADRÃO: CONCRETE OBSERVER (observador concreto)
 *
 * O que fazer quando for avisado. Aqui só imprime; num enunciado
 * poderia ser "enviar e-mail", "atualizar painel", "gravar log"...
 */
public class ObservadorConcreto implements Observador {

    private final String nome;   // só para diferenciar na saída

    public ObservadorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(int estado) {
        System.out.println(nome + " recebeu atualização. Novo estado: " + estado);
    }
}
