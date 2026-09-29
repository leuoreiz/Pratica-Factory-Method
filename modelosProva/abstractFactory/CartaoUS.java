package modelosProva.abstractFactory;

/*
 * PAPEL NO PADRÃO: CONCRETE PRODUCT (pagamento dos EUA)
 */
public class CartaoUS implements Pagamento {

    @Override
    public String processar(double valor) {
        return String.format("Cartão de crédito com verificação AVS: US$ %.2f", valor);
    }
}
