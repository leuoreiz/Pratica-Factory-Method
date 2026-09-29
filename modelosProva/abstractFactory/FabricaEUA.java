package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: CONCRETE FACTORY (fábrica concreta de outra família)
 *
 * Só cria produtos dos EUA.
 */
public class FabricaEUA implements FabricaPais {

    // O estado americano define a taxa (CA, TX, OR).
    private final String estado;

    public FabricaEUA(String estado) {
        this.estado = estado;
    }

    @Override
    public DocumentoFiscal criarDocumento() {
        return new SalesInvoiceUS(estado);
    }

    @Override
    public Pagamento criarPagamento() {
        return new CartaoUS();
    }

    @Override
    public Etiqueta criarEtiqueta() {
        return new EtiquetaUSPS();
    }
}
