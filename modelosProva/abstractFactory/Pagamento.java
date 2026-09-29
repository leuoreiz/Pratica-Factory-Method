package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: ABSTRACT PRODUCT (produto abstrato nº 2)
 *
 * Contrato de qualquer forma de pagamento, de qualquer país.
 */
public interface Pagamento {
    String processar(double valor);
}
