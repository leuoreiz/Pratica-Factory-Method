package modelosProva.observer;

/*
 * PAPEL NO PADRÃO: OBSERVER (observador)
 *
 * Contrato de quem quer ser AVISADO quando o Sujeito mudar.
 * Todo observador precisa ter o método atualizar().
 */
public interface Observador {
    void atualizar(int estado);   // chamado pelo Sujeito, recebe o novo estado
}
