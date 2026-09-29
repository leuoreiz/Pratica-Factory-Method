package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: CONCRETE FACTORY (fábrica concreta de uma família)
 *
 * Só cria produtos do BRASIL. Como o Checkout recebe UMA fábrica,
 * é impossível sair um pedido com nota brasileira e etiqueta americana.
 * Essa é a "garantia estrutural" que o enunciado costuma pedir.
 */
public class FabricaBrasil implements FabricaPais {

    // Informação que muda a regra DENTRO do Brasil (ICMS 18% ou 12%).
    private final boolean interestadual;

    public FabricaBrasil(boolean interestadual) {
        this.interestadual = interestadual;
    }

    @Override
    public DocumentoFiscal criarDocumento() {
        return new NotaFiscalBR(interestadual);   // repassa a informação para o produto
    }

    @Override
    public Pagamento criarPagamento() {
        return new PixBR();
    }

    @Override
    public Etiqueta criarEtiqueta() {
        return new EtiquetaCorreios();
    }
}
