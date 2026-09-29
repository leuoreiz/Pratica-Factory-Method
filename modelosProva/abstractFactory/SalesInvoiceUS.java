package modelosProva.abstractFactory;

import java.util.Map;

/*
 * PAPEL NO PADRÃO: CONCRETE PRODUCT (documento fiscal dos EUA)
 *
 * A taxa depende do estado. Em vez de if/else para cada estado,
 * usa um Map (tabela chave -> valor). Estado novo = só mais uma linha no Map.
 */
public class SalesInvoiceUS implements DocumentoFiscal {

    // static final = uma tabela única e constante para a classe toda.
    private static final Map<String, Double> TAXAS = Map.of(
            "CA", 0.0725,   // Califórnia 7,25%
            "TX", 0.0625,   // Texas 6,25%
            "OR", 0.0);     // Oregon isento

    private final String estado;

    public SalesInvoiceUS(String estado) {
        this.estado = estado;
    }

    @Override
    public String emitir(double valor) {
        // getOrDefault: busca a taxa do estado; se não achar, usa 0.0
        double taxa = TAXAS.getOrDefault(estado, 0.0);
        return String.format("Sales Invoice | %s | Sales tax US$ %.2f", estado, valor * taxa);
    }
}
