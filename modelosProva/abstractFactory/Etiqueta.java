package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: ABSTRACT PRODUCT (produto abstrato nº 3)
 *
 * Contrato de qualquer etiqueta de envio, de qualquer país.
 */
public interface Etiqueta {
    String gerar(String endereco);
}
