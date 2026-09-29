package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: CONCRETE PRODUCT (pagamento do Brasil)
 */
public class PixBR implements Pagamento {

    @Override
    public String processar(double valor) {
        // No String.format, "%%" imprime o símbolo % (um % sozinho daria erro).
        return String.format("Pix com 5%% de desconto: R$ %.2f", valor * 0.95);   // 5% de desconto
    }
}
