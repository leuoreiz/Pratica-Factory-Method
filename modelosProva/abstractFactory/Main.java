package modelosProva.abstractFactory;

/*
 * Ponto de entrada: escolhe a fábrica e entrega para o Checkout.
 * É o ÚNICO lugar onde aparece "Brasil" ou "EUA" pelo nome.
 */
public class Main {
    public static void main(String[] args) {
        // new Checkout(fábrica).finalizar(valor, endereço)
        new Checkout(new FabricaBrasil(false)).finalizar(100.0, "80000-000");   // dentro do estado
        new Checkout(new FabricaBrasil(true)).finalizar(100.0, "01000-000");    // interestadual
        new Checkout(new FabricaEUA("CA")).finalizar(100.0, "90210-1234");      // Califórnia

        // Novo país = FabricaAlemanha + 3 produtos novos (VatInvoiceDE, SepaDE,
        // EtiquetaDeutschePost). Nenhuma classe existente muda.
    }
}
