package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: ABSTRACT FACTORY (fábrica abstrata)
 *
 * Declara UM método de criação para CADA tipo de produto da família.
 * Quem implementar esta interface precisa saber criar a família inteira.
 *
 * Diferença para o Factory Method:
 *  - Factory Method: 1 método fábrica, cria 1 produto, usa herança (extends).
 *  - Abstract Factory: vários métodos, cria uma FAMÍLIA, usa composição
 *    (o Checkout recebe a fábrica como atributo).
 */
public interface FabricaPais {
    DocumentoFiscal criarDocumento();
    Pagamento criarPagamento();
    Etiqueta criarEtiqueta();
}
