package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: ABSTRACT PRODUCT (produto abstrato nº 1)
 *
 * No Abstract Factory existem VÁRIOS tipos de produto que andam juntos
 * (aqui: documento fiscal, pagamento e etiqueta).
 * Cada tipo tem sua interface. Cada país implementa a sua versão.
 *
 * interface = só o "contrato" (o que tem que existir), sem código.
 */
public interface DocumentoFiscal {
    String emitir(double valor);   // todo documento fiscal sabe se emitir
}
